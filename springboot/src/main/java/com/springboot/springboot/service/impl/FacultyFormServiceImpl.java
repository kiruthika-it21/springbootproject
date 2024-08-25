package com.springboot.springboot.service.impl;




import com.springboot.springboot.entity.Facultyform;
import com.springboot.springboot.entity.Student;
import com.springboot.springboot.exception.ResourceNotFoundException;
import com.springboot.springboot.mapper.FacultyFormMapper;
import com.springboot.springboot.mapper.UserMapper;
import com.springboot.springboot.model.FacultyFormModel;
import com.springboot.springboot.repository.FacultyRepository;
import com.springboot.springboot.service.FacultyFormService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class FacultyFormServiceImpl implements FacultyFormService{

    private FacultyRepository facultyRepository;
    @Override
    public FacultyFormModel createFacultyform(FacultyFormModel facultyModel) {
        Facultyform facultyform = FacultyFormMapper.mapToFacultyFormModel(facultyModel);
        Facultyform savedFaculty = facultyRepository.save(facultyform);
        return FacultyFormMapper.mapToFacultyFormModel(savedFaculty);
    }
}
