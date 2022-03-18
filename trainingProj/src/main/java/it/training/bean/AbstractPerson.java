package it.training.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractPerson extends AbstractIdentifierBean {

	private static final long serialVersionUID = -9176086902805262561L;

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
		AbstractPerson other = (AbstractPerson) obj;
		return Objects.equals(name, other.name) && Objects.equals(surname, other.surname);
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
		return "AbstractPerson [name=" + name + ", surname=" + surname + ", getId()=" + getId() + "]";
	}
}
