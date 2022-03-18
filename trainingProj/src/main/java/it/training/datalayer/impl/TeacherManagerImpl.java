package it.training.datalayer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.training.bean.Teacher;
import it.training.datalayer.TeacherManager;
import it.training.datalayer.dao.TeacherDAO;

@Component
public class TeacherManagerImpl implements TeacherManager {

	@Autowired
	private TeacherDAO teacherDAO;

	@Override
	public Teacher createAndSaveTeacher(final String name, final String surname, final String subject,
			final String schoolName) {
		Teacher teacher = createTeacher(name, surname, subject, schoolName);

		try {
			return teacherDAO.save(teacher);

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private Teacher createTeacher(final String name, final String surname, final String subject,
			final String schoolName) {
		Teacher teacher = new Teacher();
		teacher.setName(name);
		teacher.setSurname(surname);
		teacher.setSubject(subject);
		teacher.setSchoolName(schoolName);

		return teacher;
	}

	@Override
	public Teacher getTeacher(final Long id) {

		return teacherDAO.findById(id).orElse(null);
	}

	@Override
	public List<Teacher> getTeacherBySchoolName(final String schoolName) {
		return teacherDAO.findByName(schoolName);
	}

}