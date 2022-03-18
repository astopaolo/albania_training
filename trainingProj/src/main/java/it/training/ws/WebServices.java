package it.training.ws;

import java.util.List;

import it.training.bean.Student;
import it.training.bean.User;

public interface WebServices {

	Student createAndSaveStudent(String name, String surname, int grade, String schoolName);

	User createAndSaveUser(String name, String surname);

	Student getStudent(Long id);

	List<Student> getStudentBySchoolName(String schoolName);

	User getUser(Long id);

	List<User> getUsersByName(String name);

	boolean isBackendAlive();

}
