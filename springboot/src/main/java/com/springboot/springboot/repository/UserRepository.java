package com.springboot.springboot.repository;

import com.springboot.springboot.entity.Student;
import com.springboot.springboot.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Student, Long>{
        Student findByEmail(String email);
}
