package com.codegym.case_study.dto;

import com.codegym.case_study.model.customer.CustomerType;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class CustomerDto {

    private int idC;
    private CustomerType customerType;

    @NotBlank(message = "Không được để trống")

    private String nameC;

    @NotBlank(message = "Không được để trống")
    private String birthDayC;

    @NotNull
    private int gender;

    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^[0-9]{9}")
    private String idCardC;

    @NotBlank(message = "Không được để trống")
    @Pattern(regexp = "^(((\\+|)84)|0)(3|5|7|8|9)+([0-9]{8})$", message = "sai định dạng 9 numbers")
    private String phoneC;

    @Email
    @Pattern(regexp = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$", message = "abc@gmail.com")
    private String email;

    @NotBlank(message = "Không được để trống")

    private String address;

    public CustomerDto() {
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getNameC() {
        return nameC;
    }

    public void setNameC(String nameC) {
        this.nameC = nameC;
    }

    public String getBirthDayC() {
        return birthDayC;
    }

    public void setBirthDayC(String birthDayC) {
        this.birthDayC = birthDayC;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getIdCardC() {
        return idCardC;
    }

    public void setIdCardC(String idCardC) {
        this.idCardC = idCardC;
    }

    public String getPhoneC() {
        return phoneC;
    }

    public void setPhoneC(String phoneC) {
        this.phoneC = phoneC;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
