package com.codegym.case_study.model.customer;

import com.codegym.case_study.model.contract.Contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idC;

    @ManyToOne
    @JoinColumn(name = "id_ct",referencedColumnName = "idCT")
    private CustomerType customerType;

    private String nameC;
    private String birthDayC;
    private int gender;
    private String idCardC;
    private String phoneC;
    private String email;
    private String address;

    @OneToMany(mappedBy = "customer")
    private Set<Contract> contractSet;

    public Customer() {
    }

    public Customer(int idC, CustomerType customerType, String nameC, String birthDayC, int gender, String idCardC, String phoneC, String email, String address) {
        this.idC = idC;
        this.customerType = customerType;
        this.nameC = nameC;
        this.birthDayC = birthDayC;
        this.gender = gender;
        this.idCardC = idCardC;
        this.phoneC = phoneC;
        this.email = email;
        this.address = address;
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
