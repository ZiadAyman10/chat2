package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Teacher;
import com.example.demo.service.ManagerService;

@RestController
@RequestMapping("/api")
public class ManagerRestController {

   private ManagerService managerService;
   @Autowired
    public ManagerRestController(ManagerService managerService) {
    this.managerService = managerService;
}

    @GetMapping("/admin/searchForTeacher/{id}")
    public Teacher getTeacherById(@PathVariable int id){
        Teacher theTeacher =managerService.getTeacherById(id);
        return theTeacher;
    }
    @GetMapping("/admin/searchForTeachers/{name}")
     public List<Teacher>getTeacherByName(@PathVariable String name){
        return managerService.getTeacherByName(name);
     }
}
