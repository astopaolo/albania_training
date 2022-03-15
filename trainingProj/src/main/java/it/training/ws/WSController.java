package it.training.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.training.bean.User;
import it.training.datalayer.UserManager;

@RestController
@RequestMapping("/ws")
public class WSController implements WebServices {

	@Autowired
	private UserManager userManager;

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
	@GetMapping(value = "/isBackendAlive")
	public boolean isBackendAlive() {
		return true;
	}

}
