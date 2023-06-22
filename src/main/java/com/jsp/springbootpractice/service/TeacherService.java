package com.jsp.springbootpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.springbootpractice.dao.TeacherDao;
import com.jsp.springbootpractice.dto.Teacher;

@Service
public class TeacherService {

	@Autowired
	private TeacherDao teacherDao;

	// Save Teacher
	public Teacher saveTeacher(Teacher teacher) {
		return teacherDao.saveTeacher(teacher);
	}

	// Get All Teacher
	public List<Teacher> getAllTeachers() {
		return teacherDao.getAllTeachers();
	}

	// Get By ID Teacher
	public Teacher getByIdTeacher(int id) {
		return teacherDao.getByIDTeacher(id);
	}

	// Delete Teacher
	public boolean deleteTeacher(int id) {
		return teacherDao.deleteTeacher(id);
	}

	// Update Teacher
	public Teacher updateTeacher(Teacher teacher, int id) {

		Teacher teacher2 = teacherDao.getByIDTeacher(id);

		if (teacher.getName() != null) {
			teacher2.setName(teacher.getName());
		}
		if (teacher.getEmail() != null) {
			teacher2.setEmail(teacher.getEmail());
		}
		if (teacher2 != null) {
			return teacherDao.updateTeacher(teacher2, id);
		} else
			return null;

	}

}
