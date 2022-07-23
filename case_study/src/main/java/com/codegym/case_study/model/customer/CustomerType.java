package com.codegym.case_study.model.customer;

import javax.persistence.*;
import java.util.Set;

@Entity
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCT;
    private String nameCT;

    @OneToMany(mappedBy = "customerType")
    private Set<Customer> customerSet;

    public Set<Customer> getCustomerSet() {
        return customerSet;
    }

    public void setCustomerSet(Set<Customer> customerSet) {
        this.customerSet = customerSet;
    }

    public CustomerType() {
    }

    public CustomerType(int idCT, String nameCT) {
        this.idCT = idCT;
        this.nameCT = nameCT;
    }

    public int getIdCT() {
        return idCT;
    }

    public void setIdCT(int idCT) {
        this.idCT = idCT;
    }

    public String getNameCT() {
        return nameCT;
    }

    public void setNameCT(String nameCT) {
        this.nameCT = nameCT;
    }
}
