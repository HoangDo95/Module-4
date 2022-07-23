package com.codegym.case_study.model.contract;

import com.codegym.case_study.model.Facility.Facility;
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
}
