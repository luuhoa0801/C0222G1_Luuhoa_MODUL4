package com.example.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicalService implements IMedicalService {

    @Override
    public List<Integer> year() {
        List<Integer> listYear = new ArrayList<>();
        listYear.add(1990);
        listYear.add(1991);
        listYear.add(1992);
        listYear.add(1993);
        listYear.add(1995);
        listYear.add(2000);
        listYear.add(2001);
        listYear.add(2002);
        return listYear;
    }

    @Override
    public List<String> gender() {
        List<String> listGender = new ArrayList<>();
        listGender.add("Nam");
        listGender.add("Nu");
        return listGender;
    }

    @Override
    public List<String> languages() {
        List<String> listLanguages = new ArrayList<>();
        listLanguages.add("VN");
        listLanguages.add("USA");
        listLanguages.add("Japan");
        return listLanguages;
    }
}
