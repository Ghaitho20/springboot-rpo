package com.alibou.springdemo.student;
import java.util.List;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/students")
public class StudentController {


    private StudentService service ; //= new .... ;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public student save ( @RequestBody student student
    ) {
        return service.save(student);
    }

    @GetMapping("/{email}")
    public student findByEmail ( @PathVariable String email){
        return (service.findByEmail(email));
    }



    @GetMapping
    public List<student> findaAllStudents() {
        return service.findaAllStudents() ;
    }

    @PutMapping
    public student updateStudent(@RequestBody  student student) {
        return service.update(student);
    }

    @DeleteMapping("{email}")
    public void deleteStudent(@PathVariable String email) {
        service.delete(email);
    }

}
