package com.codegym.case_study.model.employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class EducationDegree {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private int idED;
    private String nameED;

    @OneToMany(mappedBy = "educationDegree")
    private Set<Employee> employeeSet;

    public Set<Employee> getEmployeeSet() {
        return employeeSet;
    }

    public void setEmployeeSet(Set<Employee> employeeSet) {
        this.employeeSet = employeeSet;
    }

    public EducationDegree() {
    }

    public EducationDegree(int idED, String nameED) {
        this.idED = idED;
        this.nameED = nameED;
    }

    public int getIdED() {
        return idED;
    }

    public void setIdED(int idED) {
        this.idED = idED;
    }

    public String getNameED() {
        return nameED;
    }

    public void setNameED(String nameED) {
        this.nameED = nameED;
    }
}

