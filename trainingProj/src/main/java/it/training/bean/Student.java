package it.training.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private static final long serialVersionUID = -4015539302973160703L;

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column
	private int grade;

	@Column
	private String schoolName;

	@OneToOne(mappedBy = "student")
	private User user;

	public Student() {
		super();
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return grade == other.grade && Objects.equals(schoolName, other.schoolName);
	}

	public int getGrade() {
		return grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(grade, schoolName);
		return result;
	}

	public void setGrade(final int grade) {
		this.grade = grade;
	}

	public void setSchoolName(final String schoolName) {
		this.schoolName = schoolName;
	}

	@Override
	public String toString() {
		return "Student [grade=" + grade + ", schoolName=" + schoolName + ", hashCode()=" + hashCode() + ", getGrade()="
				+ getGrade() + ", getSchoolName()=" + getSchoolName() + ", getName()=" + getName() + ", getSurname()="
				+ getSurname() + ", getStudent()=" + getStudent() + ", toString()=" + super.toString() + ", getId()="
				+ getId() + ", getClass()=" + getClass() + "]";
	}

}
