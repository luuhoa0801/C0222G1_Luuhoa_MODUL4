package com.codegym.ss7_c0222g1.service;

import com.codegym.ss7_c0222g1.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IUserService {

    Page<User> getAll(Pageable pageable);

    void create(User user);
}
