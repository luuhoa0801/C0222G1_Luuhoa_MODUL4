package com.codegym.music.controller;

import com.codegym.music.model.Music;
import com.codegym.music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class MusicController {
    @Autowired
    private IMusicService iMusicService;
    @GetMapping("/music")
    public String getShowForm(@RequestParam(name = "page", defaultValue = "0") int page, Model model) {
        Page<Music> list = iMusicService.getAll(PageRequest.of(page, 2));
        model.addAttribute("listMusic",list );
        return "list";
    }
    @GetMapping("/create")
    public String create( Model model ) {
        model.addAttribute("music", new Music());
        return "create";
    }

    @PostMapping("/create")
    public String save(@Valid @ModelAttribute("music") Music music, BindingResult bindingResult ,
                       RedirectAttributes redirectAttributes ) {
        if (bindingResult.hasErrors()){
            return "create";
        }
        iMusicService.create(music);
        redirectAttributes.addFlashAttribute("msg","thêm mới thành công");
        return "redirect:/music";
    }

    @GetMapping("/{id}/update")
    public String showUpdate(@PathVariable Integer id, Model model) {
        model.addAttribute("music", iMusicService.findByIdSearch(id));
        return "edit";
    }

    @PostMapping("/update")
    public String PostUpdate(@Valid @ModelAttribute(name = "music") Music music, BindingResult bindingResult) {

        if(bindingResult.hasErrors()){
            return "edit";
        }
        iMusicService.update(music);
        return "redirect:/music";
    }

}
