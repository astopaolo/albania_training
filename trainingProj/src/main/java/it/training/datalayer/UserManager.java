package it.training.datalayer;

import java.util.List;

import it.training.bean.User;

public interface UserManager {

	User createAndSaveUser(String name, String surname);

	List<User> getUsersByName(String name);

	User getUser(Long id);
}
