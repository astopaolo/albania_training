package it.training.bean;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class AbstractBean implements Serializable {

    private static final long serialVersionUID = 7808812184474479233L;

    @Override
    public abstract boolean equals(final Object obj);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();
}
