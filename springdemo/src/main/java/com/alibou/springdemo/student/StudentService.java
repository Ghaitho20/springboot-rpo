package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;


public interface StudentService {




    List<student> findaAllStudents() ;
    student save(student s);

    student findByEmail(String email);
    student  update(student s);
    void delete(String email);


}
