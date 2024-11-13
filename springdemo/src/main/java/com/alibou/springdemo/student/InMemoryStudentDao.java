package com.alibou.springdemo.student;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryStudentDao {
    private List<student> STUDENTS = new ArrayList<student>();



    public student save(student s) {
        STUDENTS.add(s);
        return s ;
    }

    public student findByEmail(String email ){
        return( STUDENTS.stream()
                .filter(s ->email.equals(s.getEmail()))
                .findFirst()
                .orElse(null));
    }

    public List<student> findAllStudents() {
        return STUDENTS;
    }





    public student update(student s) {
        var studentIndex = IntStream.range(0, STUDENTS.size())
                .filter (index ->STUDENTS.get(index).getEmail().equals(s.getEmail()))
                .findFirst()
                .orElse(-1);
        if (studentIndex > -1){
            STUDENTS.set(studentIndex, s);
            return s ;
        }
        return null;
    }


    public void delete(String email) {
        var student1 = findByEmail(email);
        if (student1 != null) {
            STUDENTS.remove(student1);
        }

    }



}
