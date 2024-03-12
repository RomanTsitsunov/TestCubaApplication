package com.company.test1.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Table(name = "TEST1_ITEM")
@Entity(name = "test1_Item")
@NamePattern("%s|name")
public class Item extends StandardEntity {
    private static final long serialVersionUID = -7428454780396245491L;

    @NotNull
    @Column(name = "ID_ITEM", nullable = false, unique = true)
    private UUID idItem;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "STORE_ID")
    private Store store;

    @NotNull
    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @NotNull
    @Column(name = "COUNT_", nullable = false)
    private Integer count;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public UUID getIdItem() {
        return idItem;
    }

    public void setIdItem(UUID idItem) {
        this.idItem = idItem;
    }
}