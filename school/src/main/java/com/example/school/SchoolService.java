package com.example.school;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SchoolService {

    @Autowired
    private  SchoolRepo schoolRepo;

    public void saveSchool(School school) {
       schoolRepo.save(school);
    }

    public List<School> getAllSchools() {
        return schoolRepo.findAll();
    }

}
