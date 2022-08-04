package com.codegym.case_study.model.user;

import com.codegym.case_study.model.employee.Employee;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    private String username;

    @OneToMany(mappedBy = "user")
    private Set<Employee> employeeSet;

    private String password;

    @ManyToMany(mappedBy = "userSet", fetch=FetchType.EAGER)
    private List<Role> roleList;

    public User() {
    }

    public User(String username, Set<Employee> employeeSet, String password, List<Role> roleList) {
        this.username = username;
        this.employeeSet = employeeSet;
        this.password = password;
        this.roleList = roleList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}
