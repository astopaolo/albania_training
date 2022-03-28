package it.training.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "system_user")
public class User extends AbstractIdentifierBean {

	private static final long serialVersionUID = -9176086902805262561L;

	@Column
	private String name;

	@Column
	private String surname;

	@OneToOne
	private Student student;

	@OneToOne
	private Teacher teacher;

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;

	}

	public String getName() {
		return name;
	}

	public Student getStudent() {
		return student;
	}

	public String getSurname() {
		return surname;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(name, surname);
		return result;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public void setStudent(final Student student) {
		this.student = student;
	}

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	public void setTeacher(final Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", student=" + student + ", teacher=" + teacher
				+ ", getName()=" + getName() + ", getStudent()=" + getStudent() + ", getSurname()=" + getSurname()
				+ "]";
	}

}
