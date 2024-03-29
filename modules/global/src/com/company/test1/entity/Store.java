package com.company.test1.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "TEST1_STORE")
@Entity(name = "test1_Store")
@NamePattern("%s|name")
public class Store extends StandardEntity {
    private static final long serialVersionUID = -6203138517978786743L;

    @NotNull
    @Column(name = "ID_STORE", nullable = false, unique = true)
    private UUID idStore;

    @NotNull
    @Column(name = "NAME", nullable = false)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getIdStore() {
        return idStore;
    }

    public void setIdStore(UUID idStore) {
        this.idStore = idStore;
    }
}