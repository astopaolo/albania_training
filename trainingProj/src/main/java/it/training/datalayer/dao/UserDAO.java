package it.training.datalayer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.training.bean.User;

@Repository
public interface UserDAO extends JpaRepository<User, Long> {

	List<User> findByName(String name);

}
