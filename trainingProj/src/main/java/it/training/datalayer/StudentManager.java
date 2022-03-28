package it.training.datalayer;

import java.util.List;

import it.training.bean.Student;

public interface StudentManager {
	Student createAndSaveStudent(int grade, String schoolName);

	Student getStudent(Long id);

	List<Student> getStudentBySchoolName(String schoolName);

}
