package com.codegym.product.service;

import com.codegym.music.model.Music;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Music> getAll(Pageable pageable);

    void create(Music music);

    void update(Music music);

    Music findByIdSearch(Integer id);
}
