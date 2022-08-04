package com.codegym.case_study.model.contract;

import com.codegym.case_study.model.facility.Facility;
import com.codegym.case_study.model.customer.Customer;
import com.codegym.case_study.model.employee.Employee;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCon;
    private String starD;
    private String endD;
    private double deposit;

    @ManyToOne
    @JoinColumn(name = "id_e",referencedColumnName = "idE")
    private Employee employee;

    @ManyToOne
    @JoinColumn(name = "id_c",referencedColumnName = "idC")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "id_f",referencedColumnName = "idF")
    private Facility facility;

    @OneToMany(mappedBy = "contract")
    private Set<ContractDetail> contractDetailSet;

    public Contract() {
    }

    public Contract(int idCon, String starD, String endD, double deposit, Employee employee, Customer customer, Facility facility, Set<ContractDetail> contractDetailSet) {
        this.idCon = idCon;
        this.starD = starD;
        this.endD = endD;
        this.deposit = deposit;
        this.employee = employee;
        this.customer = customer;
        this.facility = facility;
        this.contractDetailSet = contractDetailSet;
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

    public Set<ContractDetail> getContractDetailSet() {
        return contractDetailSet;
    }

    public void setContractDetailSet(Set<ContractDetail> contractDetailSet) {
        this.contractDetailSet = contractDetailSet;
    }
}
