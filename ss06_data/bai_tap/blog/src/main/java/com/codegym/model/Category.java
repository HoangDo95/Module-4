package com.codegym.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity(name = "category")
public class Category {
    @Id
    private int idC;
    private String nameC;

    @OneToMany(mappedBy = "category")
    private Set<Blog> blogSet;

    public Set<Blog> getBlogSet() {
        return blogSet;
    }

    public void setBlogSet(Set<Blog> blogSet) {
        this.blogSet = blogSet;
    }

    public Category() {
    }

    public Category(int idC, String nameC) {
        this.idC = idC;
        this.nameC = nameC;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }
}
