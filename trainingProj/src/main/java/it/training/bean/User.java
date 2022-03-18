package it.training.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "system_user")
public class User extends AbstractPerson {

	private static final long serialVersionUID = -4233793321768918185L;

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

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return "User [getName()=" + getName() + ", getSurname()=" + getSurname() + ", getId()=" + getId() + "]";
	}

}
