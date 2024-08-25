package com.springboot.springboot.controller;

import com.springboot.springboot.entity.Student;
import com.springboot.springboot.mapper.UserMapper;
import com.springboot.springboot.model.UserModel;
import com.springboot.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/users")
public class UserController {
    private UserService userService;

    @PostMapping("/create")
    public ResponseEntity<UserModel> createStudent(@RequestBody UserModel studentModel){
        UserModel savedStudent = userService.createStudent(studentModel);
        return new ResponseEntity<>(savedStudent, HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public ResponseEntity<UserModel> login(@RequestBody UserModel loginRequest) {
        Student user = userService.login(loginRequest.getEmail(), loginRequest.getPassword());
        if (user != null) {
            return new ResponseEntity<>(UserMapper.mapToStudentModel(user), HttpStatus.OK);
            //return ResponseEntity.ok().body(user);

        } else {
            return new ResponseEntity<>(null, HttpStatus.UNAUTHORIZED);
           // return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
        }
    }

    //build employee restApi
    @GetMapping("{id}")
    public ResponseEntity<UserModel> getStudentId(@PathVariable("id") Long studentId){
        UserModel studentmodel = userService.getStudentbyId(studentId);
        return ResponseEntity.ok(studentmodel);
    }
}
