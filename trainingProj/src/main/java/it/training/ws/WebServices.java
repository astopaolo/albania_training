package it.training.ws;

import java.util.List;

import it.training.bean.Student;
import it.training.bean.Teacher;
import it.training.bean.User;

public interface WebServices {

	Student createAndSaveStudent(String name, String surname, int grade, String schoolName);

	Teacher createAndSaveTeacher(String name, String surname, String subject, String schoolName);

	User createAndSaveUser(String name, String surname);

	Student getStudent(Long id);

	List<Student> getStudentBySchoolName(String schoolName);

	Teacher getTeacher(Long id);

	List<Teacher> getTeacherBySchoolName(String schoolName);

	User getUser(Long id);

	List<User> getUsersByName(String name);

	boolean isBackendAlive();

}
