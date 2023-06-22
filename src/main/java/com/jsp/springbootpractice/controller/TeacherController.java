package com.jsp.springbootpractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.springbootpractice.dto.Teacher;
import com.jsp.springbootpractice.service.TeacherService;

@RestController
public class TeacherController {

	@Autowired
	private TeacherService teacherService;

	@PostMapping("/teachers")
	public Teacher saveTeacher(@RequestBody Teacher teacher) {
		return teacherService.saveTeacher(teacher);
	}

	@GetMapping("/teachers")
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}

	@GetMapping("/teachers/{id}")
	public Teacher getByIdTeacher(@PathVariable int id) {
		return teacherService.getByIdTeacher(id);
	}

	@DeleteMapping("/teachers/{id}")
	public boolean deleteTeacher(@PathVariable int id) {
		return teacherService.deleteTeacher(id);
	}

	@PutMapping("/teachers/{id}")
	public Teacher updateTeacher(@RequestBody Teacher teacher, @PathVariable int id) {
		return teacherService.updateTeacher(teacher, id);
	}

}
