package com.jsp.springbootpractice.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.springbootpractice.dto.Teacher;
import com.jsp.springbootpractice.repository.TeacherRepository;

@Repository
public class TeacherDao {

	@Autowired
	private TeacherRepository teacherRepository;

	// Save Record
	public Teacher saveTeacher(Teacher teacher) {
		if (teacher != null) {
			return teacherRepository.save(teacher);
		} else {
			return null;
		}
	}

	// Get All Record
	public List<Teacher> getAllTeachers() {
		return teacherRepository.findAll();
	}

	// Get By Id Record
	public Teacher getByIDTeacher(int id) {
		Optional<Teacher> optional = teacherRepository.findById(id);

		if (optional != null) {
			return optional.get();
		} else
			return null;
	}

	// Delete Record
	public boolean deleteTeacher(int id) {
		Optional<Teacher> optional = teacherRepository.findById(id);

		if (optional != null) {
			teacherRepository.delete(optional.get());
			return true;
		} else
			return false;
	}

	// Update Record
	public Teacher updateTeacher(Teacher teacher, int id) {
		Optional<Teacher> optional = teacherRepository.findById(id);

		if (optional != null) {
			return teacherRepository.save(teacher);
		} else
			return null;
	}

}
