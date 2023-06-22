package com.jsp.springbootpractice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.springbootpractice.dto.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}
