package com.codegym.ung_dung_quan_li_dien_thoai.repository;

import com.codegym.ung_dung_quan_li_dien_thoai.model.Smartphone;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
}
