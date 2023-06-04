package com.kaab.restapi.rest;

import com.kaab.restapi.entity.student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
