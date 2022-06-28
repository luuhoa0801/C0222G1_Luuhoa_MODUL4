package com.codegym.gio_hang.repository;

import com.codegym.gio_hang.model.Cart;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

@Transactional
public interface ICartRepository extends JpaRepository<Cart,Integer> {
    @Query(value = "select * from cart ", nativeQuery = true)
    Page<Cart> fillAllCart(Pageable pageable);


}
