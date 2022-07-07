package com.codegym.casestudy.service.facility;

import com.codegym.casestudy.model.customer.Customer;
import com.codegym.casestudy.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IFacilityService {
    Page<Facility> getAll(Pageable pageable);
}
