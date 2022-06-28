package com.codegym.gio_hang.service;

import com.codegym.gio_hang.model.Cart;
import com.codegym.gio_hang.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{
    @Autowired
    private ICartRepository iCartRepository;
    @Override
    public Page<Cart> getAll(Pageable pageable) {
        return iCartRepository.fillAllCart(pageable);
    }

    @Override
    public Cart findById(Integer id) {
        return iCartRepository.findById(id).orElse(null);
    }
}
