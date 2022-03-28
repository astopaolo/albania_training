package it.training.datalayer.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import it.training.bean.Teacher;

@Repository
public interface TeacherDAO extends JpaRepository<Teacher, Long> {

	List<Teacher> findBySchoolName(String schoolName);
}
