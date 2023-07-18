package com.BootAPI.RegBoot.StudService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BootAPI.RegBoot.StudBean.Stud;
import com.BootAPI.RegBoot.StudRepository.StudRepository;

@Service
public class StudService {
    private StudRepository studRepository;

    @Autowired
    public StudService(StudRepository studRepository) {
        this.studRepository = studRepository;
    }

    public List<Stud> getAllStudents() {
        return studRepository.findAll();
    }

    public Stud saveStud(Stud stud) {
        return studRepository.save(stud);
    }

    public void deleteStud(Long id) {
        studRepository.deleteById(id);
    }
}
