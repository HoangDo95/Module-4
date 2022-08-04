package com.codegym.case_study.dto;

import com.codegym.case_study.model.customer.Customer;
import com.codegym.case_study.model.employee.Employee;
import com.codegym.case_study.model.facility.Facility;

public class ContractDto {
    private int idCon;
    private String starD;
    private String endD;
    private double deposit;

    private Employee employee;

    private Customer customer;

    private Facility facility;

    public ContractDto() {
    }

    public ContractDto(int idCon, String starD, String endD, double deposit, Employee employee, Customer customer, Facility facility) {
        this.idCon = idCon;
        this.starD = starD;
        this.endD = endD;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
    }

    public int getIdCon() {
        return idCon;
    }

    public void setIdCon(int idCon) {
        this.idCon = idCon;
    }

    public String getStarD() {
        return starD;
    }

    public void setStarD(String starD) {
        this.starD = starD;
    }

    public String getEndD() {
        return endD;
    }

    public void setEndD(String endD) {
        this.endD = endD;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }
}
