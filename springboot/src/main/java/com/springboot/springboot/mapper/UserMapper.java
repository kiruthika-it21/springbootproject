package com.springboot.springboot.mapper;

import com.springboot.springboot.entity.Student;
import com.springboot.springboot.model.RoleType;
import com.springboot.springboot.model.UserModel;

public class UserMapper {


    public static UserModel mapToStudentModel(Student student){
        return new UserModel(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getPassword(),
                student.getRole().name()
        );
        }

        public static Student mapToStudentModel(UserModel studentmodel){
            return new Student(
                    studentmodel.getId(),
                    studentmodel.getName(),
                    studentmodel.getEmail(),
                    studentmodel.getPassword(),
                    RoleType.FACULTY.name().equals(studentmodel.getRole()) ? RoleType.FACULTY : RoleType.APPROVAL_COMMITTEE
            );
        }
}
