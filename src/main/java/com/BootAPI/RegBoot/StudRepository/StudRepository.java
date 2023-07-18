package com.BootAPI.RegBoot.StudRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BootAPI.RegBoot.StudBean.Stud;

@Repository
public interface StudRepository extends JpaRepository<Stud, Long> {

}
