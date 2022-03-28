package it.training.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.training.bean.Student;
import it.training.bean.Teacher;
import it.training.bean.User;
import it.training.datalayer.StudentManager;
import it.training.datalayer.TeacherManager;
import it.training.datalayer.UserManager;

@RestController
@RequestMapping("/ws")
public class WSController implements WebServices {

	@Autowired
	private UserManager userManager;
	@Autowired
	private StudentManager studentManager;
	@Autowired
	private TeacherManager teacherManager;

	@Override
	@GetMapping(value = "/createAndSaveStudent")
	public Student createAndSaveStudent(final int grade, final String schoolName) {
		return studentManager.createAndSaveStudent(grade, schoolName);
	}

	@Override
	@GetMapping(value = "/createAndSaveTeacher")
	public Teacher createAndSaveTeacher(final String subject, final String schoolName) {
		return teacherManager.createAndSaveTeacher(subject, schoolName);
	}

	@Override
	@GetMapping(value = "/createAndSaveUser")
	public User createAndSaveUser(final String name, final String surname) {
		return userManager.createAndSaveUser(name, surname);
	}

	@Override
	@GetMapping(value = "/getStudent")
	public Student getStudent(final Long id) {
		return studentManager.getStudent(id);
	}

	@Override
	@GetMapping(value = "/getStudentBySchoolName")
	public List<Student> getStudentBySchoolName(final String schoolName) {
		return studentManager.getStudentBySchoolName(schoolName);
	}

	@Override
	@GetMapping(value = "/getTeacher")
	public Teacher getTeacher(final Long id) {
		return teacherManager.getTeacher(id);
	}

	@Override
	@GetMapping(value = "/getTeacherBySchoolName")
	public List<Teacher> getTeacherBySchoolName(final String schoolName) {
		return teacherManager.getTeacherBySchoolName(schoolName);
	}

	@Override
	@GetMapping(value = "/getUser")
	public User getUser(final Long id) {
		return userManager.getUser(id);
	}

	@Override
	@GetMapping(value = "/getUsersByName")
	public List<User> getUsersByName(final String name) {
		return userManager.getUsersByName(name);
	}

	@Override
	@GetMapping(value = "/isBackendAlive")
	public boolean isBackendAlive() {
		return true;
	}

}
