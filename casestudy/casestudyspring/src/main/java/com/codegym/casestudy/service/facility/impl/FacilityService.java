package com.codegym.casestudy.service.facility.impl;

import com.codegym.casestudy.model.facility.Facility;
import com.codegym.casestudy.repository.facility.IFacilityRepository;
import com.codegym.casestudy.repository.facility.IFacilityTypeRepository;
import com.codegym.casestudy.repository.facility.IRentTypeRepository;
import com.codegym.casestudy.service.facility.IFacilityService;
import com.codegym.casestudy.service.facility.IFacilityTypeService;
import com.codegym.casestudy.service.facility.IRentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityService implements IFacilityService {
    @Autowired
    private IFacilityRepository iFacilityRepository;
    @Autowired
    private IFacilityTypeRepository iFacilityTypeRepository;
    @Autowired
    private IRentTypeRepository iRentTypeRepository;

    @Override
    public Page<Facility> getAll(Pageable pageable) {
        return iFacilityRepository.findAllFacility(pageable);
    }
}
