package it.training.bean;

import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
public abstract class AbstractIdentifierBean extends AbstractBean {

    private static final long serialVersionUID = 3393614994418068338L;
    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "increment")
    private Long id;

    @Override
    public boolean equals(final Object obj) {
	if (this == obj) {
	    return true;
	}
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final AbstractIdentifierBean other = (AbstractIdentifierBean) obj;
	return Objects.equals(id, other.id);
    }

    public Long getId() {
	return id;
    }

    @Override
    public int hashCode() {
	return Objects.hash(id);
    }

    public void setId(final Long id) {
	this.id = id;
    }

    @Override
    public String toString() {
	return "AbstractIdentifierBean [id=" + id + "]";
    }

}
