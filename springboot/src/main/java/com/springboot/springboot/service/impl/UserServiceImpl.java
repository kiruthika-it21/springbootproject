package com.springboot.springboot.service.impl;


import com.springboot.springboot.entity.Student;
import com.springboot.springboot.exception.ResourceNotFoundException;
import com.springboot.springboot.mapper.UserMapper;
import com.springboot.springboot.model.UserModel;
import com.springboot.springboot.repository.UserRepository;
import com.springboot.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;
    @Override
    public UserModel createStudent(UserModel studentmodel) {
        Student student = UserMapper.mapToStudentModel(studentmodel);
        Student savedStudent = userRepository.save(student);
        return UserMapper.mapToStudentModel(savedStudent);
    }


    @Override
    public Student login(String email, String password) {
        Student user = userRepository.findByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            return user;
        } else {
            return null;
        }
    }

    @Override
    public UserModel getStudentbyId(Long studentId) {
        return null;
    }



}
