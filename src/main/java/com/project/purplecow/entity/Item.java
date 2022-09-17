package com.project.purplecow.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    private @Id @GeneratedValue Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item { " + "id=" + this.id + ", name='" + this.name + "'}";
    }
}
