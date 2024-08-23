package com.Springpro.Springpro.Service;

import com.Springpro.Springpro.Entity.Student;
import com.Springpro.Springpro.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private StudentRepo studentrepo;

    public Student saveDetails(Student student){
        return studentrepo.save(student);
    }

    public List<Student> getAllDetails(){
        return studentrepo.findAll();
    }

    public Student getStudentById(int id){
        return studentrepo.findById(id).orElse(null);
    }

    public Student updateDetails(Student student){
         Student updateStudent = studentrepo.findById(student.getId()).orElse(null);
         if(updateStudent != null){
             updateStudent.setMarks(student.getMarks());
             updateStudent.setName(student.getName());
             studentrepo.save(updateStudent);
             return updateStudent;
         }
         else{
             return null;
         }
    }


}
