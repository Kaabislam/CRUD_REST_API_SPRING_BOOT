package com.kaab.restapi.rest;

import com.kaab.restapi.entity.student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    List<student> theStudents;
    @PostConstruct
    public void loadData(){
        theStudents = new ArrayList<>();
        theStudents.add(new student("kaab","islam"));
        theStudents.add(new student("muaz","umaer"));
        theStudents.add(new student("mufiq","rufail"));
    }
    // define endpoint for "/students"
    @GetMapping("/students")
    public List<student> getStudents(){
        return theStudents;
    }
    @GetMapping("/students/{studentId}")
    public student getStudent(@PathVariable int studentId){
        if((studentId >= theStudents.size()) || (studentId < 0)){
            throw  new StudentNotFoundException("student id not found - "+studentId);
        }
        return theStudents.get(studentId);
    }

    // exception handling
    // create a custom error response class
    // create a custom exception class
    // update rest service to throw exception if student not found
    // add an exception handler using @exceptionhandler


}
