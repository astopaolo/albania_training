package it.training.datalayer;

import java.util.List;

import it.training.bean.Teacher;

public interface TeacherManager {
	Teacher createAndSaveTeacher(String name, String surname, String subject, String schoolName);

	Teacher getTeacher(Long id);

	List<Teacher> getTeacherBySchoolName(String schoolName);

}
