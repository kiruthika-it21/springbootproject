package com.springboot.springboot.repository;

import com.springboot.springboot.entity.Facultyform;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacultyRepository extends JpaRepository<Facultyform, Long> {
}
