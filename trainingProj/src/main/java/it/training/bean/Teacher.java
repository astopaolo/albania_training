package it.training.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "teacher")
public class Teacher extends AbstractIdentifierBean {

	private static final long serialVersionUID = -4015539302973160703L;

	@Column
	private String subject;
	@Column
	private String schoolName;

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		return subject == other.subject && Objects.equals(schoolName, other.schoolName);
	}

	public String getSchoolName() {
		return schoolName;
	}

	public String getSubject() {
		return subject;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(subject, schoolName);
		return result;
	}

	public void setSchoolName(final String schoolName) {
		this.schoolName = schoolName;
	}

	public void setSubject(final String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Teacher [subject=" + subject + ", schoolName=" + schoolName + ", getSchoolName()=" + getSchoolName()
				+ ", getSubject()=" + getSubject() + "]";
	}

}