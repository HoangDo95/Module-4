package com.codegym.case_study.model.user;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idR;
    private String nameR;

    @ManyToMany
    @JoinTable(name = "user_role",joinColumns = @JoinColumn(name = "role_id"),inverseJoinColumns = @JoinColumn(name = "username"))
    private Set<User> userSet;

    public Role() {
    }

    public Role(int idR, String nameR) {
        this.idR = idR;
        this.nameR = nameR;
    }

    public int getIdR() {
        return idR;
    }

    public void setIdR(int idR) {
        this.idR = idR;
    }

    public String getNameR() {
        return nameR;
    }

    public void setNameR(String nameR) {
        this.nameR = nameR;
    }
}
