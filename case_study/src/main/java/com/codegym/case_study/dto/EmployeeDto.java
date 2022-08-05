package com.codegym.case_study.dto;

import com.codegym.case_study.model.employee.Division;
import com.codegym.case_study.model.employee.EducationDegree;
import com.codegym.case_study.model.employee.Position;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


public class EmployeeDto {
    private int idE;

//    @NotBlank(message = "Không được để trống")
    private String nameE;

//    @NotBlank(message = "Không được để trống")
    private String birthDayE;

//    @NotBlank(message = "Không được để trống")
    private String idCardE;

//    @NotNull(message = "Không được để trống")
    private double salary;

//    @NotBlank(message = "Không được để trống")
    private String phoneE;

//    @NotBlank(message = "Không được để trống")
    private String emailE;

//    @NotBlank(message = "Không được để trống")
    private String addressE;

    private Position position;

    private EducationDegree educationDegree;

    private Division division;

    public EmployeeDto() {
    }

    public EmployeeDto(int idE, String nameE, String birthDayE, String idCardE, double salary, String phoneE, String emailE, String addressE, Position position, EducationDegree educationDegree, Division division) {
        this.idE = idE;
        this.nameE = nameE;
        this.birthDayE = birthDayE;
        this.idCardE = idCardE;
        this.salary = salary;
        this.phoneE = phoneE;
        this.emailE = emailE;
        this.addressE = addressE;
        this.position = position;
        this.educationDegree = educationDegree;
        this.division = division;
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

    public String getAddressE() {
        return addressE;
    }

    public void setAddressE(String addressE) {
        this.addressE = addressE;
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
