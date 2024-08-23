package com.Springpro.Springpro.Controller;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping(path = "/addStudent")
    public Student postDetails(@RequestBody Student student){
           return studentService.saveDetails(student);
    }

    @GetMapping(path = "/getAllStudentDetails")
    public List<Student> getDetails(){
        return studentService.getAllDetails();
    }

    @GetMapping(path = "/getStudentDetailsById/{id}")
    public Student getStudentById(@PathVariable int id){
        return studentService.getStudentById(id);
    }
    @PutMapping("/updateStudent")
    public Student updateStudentDetails (@RequestBody Student student){
        return studentService.updateDetails(student);
    }





}
