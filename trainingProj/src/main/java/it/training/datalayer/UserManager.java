package it.training.datalayer;

import java.util.List;

import it.training.bean.User;

public interface UserManager {

	User createAndSaveUser(String name, String surname);

	User getUser(Long id);

	List<User> getUsersByName(String name);

	User saveUser(User user);

}
