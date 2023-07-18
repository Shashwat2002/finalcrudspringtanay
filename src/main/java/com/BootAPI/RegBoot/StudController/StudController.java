package com.BootAPI.RegBoot.StudController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BootAPI.RegBoot.StudBean.Stud;
import com.BootAPI.RegBoot.StudRepository.StudRepository;
import com.BootAPI.RegBoot.StudService.StudService;

@RestController
@RequestMapping("/api/students")
public class StudController {
    private StudService studService;

    @Autowired
    public StudController(StudService studService) {
        this.studService = studService;
    }

    @GetMapping
    public ResponseEntity<List<Stud>> getAllStudent() {
        List<Stud> students = studService.getAllStudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Stud> saveStudent(@RequestBody Stud stud) {
        Stud savedStud = studService.saveStud(stud);
        return new ResponseEntity<>(savedStud, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        studService.deleteStud(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
