package it.training.datalayer.impl;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.training.bean.User;
import it.training.datalayer.UserManager;
import it.training.datalayer.dao.UserDAO;

@Component
public class UserManagerImpl implements UserManager {

    private final Logger log = Logger.getLogger(UserManagerImpl.class);

    @Autowired
    private UserDAO userDAO;

    @Override
    public User createAndSaveUser(final String name, final String surname) {

	log.info("creating User");
	User user = createUser(name, surname);
	log.info("User created");

	try {
	    log.info("saving User");
	    return userDAO.save(user);
	} catch (final Exception e) {
	    log.error(e.getMessage(), e);
	}

	return null;
    }

    @Override
    public User getUser(final Long id) {

	return userDAO.findById(id).orElse(null);
    }

    @Override
    public List<User> getUsersByName(final String name) {
	return userDAO.findByName(name);
    }

    @Override
    public User saveUser(final User user) {
	// TODO Auto-generated method stub
	return null;
    }

    private User createUser(final String name, final String surname) {
	User user = new User();
	user.setName(name);
	user.setSurname(surname);

	return user;
    }

}
