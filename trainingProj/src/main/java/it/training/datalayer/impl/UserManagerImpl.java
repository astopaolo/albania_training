package it.training.datalayer.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.training.bean.User;
import it.training.datalayer.UserManager;
import it.training.datalayer.dao.UserDAO;

@Component
public class UserManagerImpl implements UserManager {

	@Autowired
	private UserDAO userDAO;

	@Override
	public User createAndSaveUser(final String name, final String surname) {
		User user = createUser(name, surname);

		try {
			return userDAO.save(user);

		} catch (final Exception e) {
			e.printStackTrace();
		}

		return null;
	}


	private User createUser(final String name, final String surname) {
		User user = new User();
		user.setName(name);
		user.setSurname(surname);

		return user;
	}	

	@Override
	public User getUser(final Long id) {

		return userDAO.findById(id).orElse(null);
	}

	@Override
	public List<User> getUsersByName(final String name) {
		return userDAO.findByName(name);
	}

}
