package it.training.ws;

import java.util.List;

import it.training.bean.User;

public interface WebServices {

	User createAndSaveUser(String name, String surname);

	User getUser(Long id);

	List<User> getUsersByName(String name);

	boolean isBackendAlive();

}
