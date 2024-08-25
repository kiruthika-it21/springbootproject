package com.springboot.springboot.controller;
import com.springboot.springboot.model.FacultyFormModel;
import com.springboot.springboot.model.UserModel;
import com.springboot.springboot.service.FacultyFormService;
import com.springboot.springboot.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/faculty/")
public class FacultyFormController {
    private FacultyFormService facultyFormService;

    @PostMapping("/creates")
    public ResponseEntity<FacultyFormModel> createFacultyForm(@RequestBody FacultyFormModel facultyModel){
        FacultyFormModel savedFaculty = facultyFormService.createFacultyform(facultyModel);
        return new ResponseEntity<>(savedFaculty, HttpStatus.CREATED);
    }
}
