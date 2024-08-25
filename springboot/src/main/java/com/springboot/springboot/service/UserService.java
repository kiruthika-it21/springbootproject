package com.springboot.springboot.service;

import com.springboot.springboot.entity.Student;
import com.springboot.springboot.model.UserModel;

public interface UserService {
    UserModel createStudent(UserModel studentmodel);

    Student login(String username, String password);

    UserModel getStudentbyId(Long studentId);


}
