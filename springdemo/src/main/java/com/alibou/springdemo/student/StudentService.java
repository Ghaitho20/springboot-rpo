package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {


    public List<student> findaAllStudents() {
        return List.of(
                new student (
                        "Ali",
                        "bouali",
                        LocalDate.now(),
                        "contact@alibouali.com",
                        34),
                new student (
                        "ghaith",
                        "benammar",
                        LocalDate.now(),
                        "contat@alibouali.com",
                        34)

        );


    }


}
