package com.alibou.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class InMemoryStudentService implements StudentService{

    private final InMemoryStudentDao dao;
    public InMemoryStudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }
    @Override
    public student save(student s) {
        return this.dao.save(s);
    }

    @Override
    public student findByEmail(String email) {
        return this.dao.findByEmail(email);
    }

    @Override
    public student update(student s) {
        return this.dao.update(s);
    }

    @Override
    public void delete(String email) {
        dao.delete(email);

    }

    @Override

    public List<student> findaAllStudents() {
        return this.dao.findAllStudents() ;


    }
}
