package it.training.datalayer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.training.bean.Student;
import it.training.datalayer.StudentManager;
import it.training.datalayer.dao.StudentDAO;

@Component
public class StudentManagerImpl implements StudentManager {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public Student createAndSaveStudent(final String name, final String surname, final int grade,
			final String schoolName) {
		Student student = createStudent(name, surname, grade, schoolName);

		try {
			return studentDAO.save(student);

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private Student createStudent(final String name, final String surname, final int grade, final String schoolName) {
		Student student = new Student();
		student.setName(name);
		student.setSurname(surname);
		student.setGrade(grade);
		student.setSchoolName(schoolName);

		return student;
	}

	@Override
	public Student getStudent(final Long id) {

		return studentDAO.findById(id).orElse(null);
	}

	@Override
	public List<Student> getStudentBySchoolName(final String schoolName) {
		return studentDAO.findByName(schoolName);
	}

}
