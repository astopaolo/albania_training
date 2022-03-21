package it.training.bean;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "system_user")
public class User extends AbstractIdentifierBean {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	@Column(name = "id")

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")

	private static final long serialVersionUID = -9176086902805262561L;

//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//	@PrimaryKeyJoinColumn
//	private Teacher teacher;
//
//	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
//	@PrimaryKeyJoinColumn
//	private Student student;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacher_id", referencedColumnName = "id")
	private Teacher teacher;

	@Column
	private String name;

	@Column
	private String surname;

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

	public String getSurname() {
		return surname;
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

	public void setSurname(final String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", getId()=" + getId() + "]";
	}
}
