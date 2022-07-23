package com.codegym.case_study.model.employee;

import com.codegym.case_study.model.contract.Contract;
import com.codegym.case_study.model.user.User;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idE;
    private String nameE;
    private String birthDayE;
    private String idCardE;
    private double salary;
    private String phoneE;
    private String emailE;

    @ManyToOne
    @JoinColumn(name = "id_p", referencedColumnName = "idP")
    private Position position;

    @ManyToOne
    @JoinColumn(name = "id_ed", referencedColumnName = "idE")
    private EducationDegree educationDegree;

    @ManyToOne
    @JoinColumn(name = "id_d", referencedColumnName = "idD")
    private Division division;

    @ManyToOne
    @JoinColumn(name = "username",referencedColumnName = "username")
    private User user;

    @OneToMany(mappedBy = "employee")
    private Set<Contract> contractSet;

    public Employee() {
    }

    public Employee(int idE, String nameE, String birthDayE, String idCardE, double salary, String phoneE, String emailE, Position position, EducationDegree educationDegree, Division division, User user) {
        this.idE = idE;
        this.nameE = nameE;
        this.birthDayE = birthDayE;
        this.idCardE = idCardE;
        this.salary = salary;
        this.phoneE = phoneE;
        this.emailE = emailE;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getIdE() {
        return idE;
    }

    public void setIdE(int idE) {
        this.idE = idE;
    }

    public String getNameE() {
        return nameE;
    }

    public void setNameE(String nameE) {
        this.nameE = nameE;
    }

    public String getBirthDayE() {
        return birthDayE;
    }

    public void setBirthDayE(String birthDayE) {
        this.birthDayE = birthDayE;
    }

    public String getIdCardE() {
        return idCardE;
    }

    public void setIdCardE(String idCardE) {
        this.idCardE = idCardE;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPhoneE() {
        return phoneE;
    }

    public void setPhoneE(String phoneE) {
        this.phoneE = phoneE;
    }

    public String getEmailE() {
        return emailE;
    }

    public void setEmailE(String emailE) {
        this.emailE = emailE;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public EducationDegree getEducationDegree() {
        return educationDegree;
    }

    public void setEducationDegree(EducationDegree educationDegree) {
        this.educationDegree = educationDegree;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }


}
