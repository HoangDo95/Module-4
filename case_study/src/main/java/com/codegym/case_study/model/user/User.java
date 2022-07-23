package com.codegym.case_study.model.user;

import com.codegym.case_study.model.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {
    @Id
    private String username;

    @OneToMany(mappedBy = "user")
    private Set<Employee> employeeSet;

    private String password;

    @ManyToMany(mappedBy = "userSet")
    private Set<Role> roleSet;


    public User() {
    }



}
