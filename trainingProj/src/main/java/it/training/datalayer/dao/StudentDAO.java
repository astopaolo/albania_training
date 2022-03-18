package it.training.datalayer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.training.bean.Student;

@Repository
public interface StudentDAO extends JpaRepository<Student, Long> {

	List<Student> findByName(String schoolName);
}
