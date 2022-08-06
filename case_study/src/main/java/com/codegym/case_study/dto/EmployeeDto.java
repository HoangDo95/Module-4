package com.codegym.case_study.dto;

import com.codegym.case_study.model.employee.Division;
import com.codegym.case_study.model.employee.EducationDegree;
import com.codegym.case_study.model.employee.Position;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


public class EmployeeDto {
    private int idE;

    @NotBlank(message = "Không được để trống")
    @Pattern(message = "Sai định dạng (VD: Nguyễn Văn A)", regexp = "^([A-Z\\p{L}]{1}[a-z\\p{L}]*)+(\\s([A-Z\\p{L}]{1}[a-z\\p{L}]*))*$")
    private String nameE;

    @NotBlank(message = "Không được để trống")
    private String birthDayE;

    @NotBlank(message = "Không được để trống")
    @Pattern(message = "Sai định dạng (XXXXXXXXX với X là số từ 0 - 9)",regexp = "^[0-9]{9}")
    private String idCardE;

    @NotNull(message = "Không được để trống")
    @Pattern(message = "Phải nhập số và lớn hơn 0",regexp = "[1-9]+\\d*")
    private double salary;

    @NotBlank(message = "Không được để trống")
    @Pattern(message = "sai định dạng 9 số",regexp = "^(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})$")
    private String phoneE;

    @NotBlank(message = "Không được để trống")
    @Pattern(message = "abc@gmail.com",regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")
    private String emailE;

    @NotBlank(message = "Không được để trống")
    private String addressE;

    @NotBlank(message = "Không được để trống")
    private Position position;

    @NotBlank(message = "Không được để trống")
    private EducationDegree educationDegree;

    @NotBlank(message = "Không được để trống")
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
