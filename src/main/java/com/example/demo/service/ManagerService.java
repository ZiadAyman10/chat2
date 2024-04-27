package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ManagerDAO;
import com.example.demo.entity.Teacher;

@Service
public class ManagerService {
   private ManagerDAO managerDAO;

@Autowired
public ManagerService(ManagerDAO managerDAO) {
    this.managerDAO = managerDAO;
}
  public Teacher getTeacherById(int id){
    Teacher theTeacher =managerDAO.getTeacherById(id);
    return theTeacher;
  }
  public List<Teacher> getTeacherByName(String name){
    List<Teacher> theTeacher =managerDAO.getTeachersByName(name);
    return theTeacher;
  }
}
