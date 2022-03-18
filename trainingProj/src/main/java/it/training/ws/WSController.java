package it.training.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.training.bean.Student;
import it.training.bean.User;
import it.training.datalayer.StudentManager;
import it.training.datalayer.UserManager;

@RestController
@RequestMapping("/ws")
public class WSController implements WebServices {

	@Autowired
	private UserManager userManager;
	@Autowired
	private StudentManager studentManager;

	@Override
	@GetMapping(value = "/createAndSaveUser")
	public User createAndSaveUser(final String name, final String surname) {
		return userManager.createAndSaveUser(name, surname);
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
	@GetMapping(value = "/createAndSaveStudent")
	public Student createAndSaveStudent(String name,String surname, int grade,  String schoolName) {
		return studentManager.createAndSaveStudent(name,surname,grade, schoolName);
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
	@GetMapping(value = "/isBackendAlive")
	public boolean isBackendAlive() {
		return true;
	}

}
