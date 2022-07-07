package com.codegym.casestudy.repository.facility;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

@Transactional
public interface IFacilityRepository extends JpaRepository<Facility,Integer> {
    @Query(value = "select * from facility where status = 0",nativeQuery = true)
    Page<Facility> findAllFacility(Pageable pageable);

    @Modifying
    @Query(value = "update facility set status = 1 where id = :id", nativeQuery = true)
    void delete(@Param("id") int id);
}
