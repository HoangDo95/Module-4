package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "blog")
public class Blog {
    @Id
    private int id;
    private String name;
    private String day;
    private String status;

    @ManyToOne
    @JoinColumn(name = "id_c",referencedColumnName = "id")
    private Category category;
    public Blog() {
    }

    public Blog(int id, String name, String day, String status) {
        this.id = id;
        this.name = name;
        this.day = day;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
