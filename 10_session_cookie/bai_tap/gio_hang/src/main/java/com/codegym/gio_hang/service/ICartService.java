package com.codegym.gio_hang.service;

import com.codegym.gio_hang.model.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICartService {
    Page<Cart> getAll(Pageable pageable);
    Cart findById(Integer id);

}
