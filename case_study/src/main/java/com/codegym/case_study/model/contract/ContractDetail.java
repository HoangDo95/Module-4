package com.codegym.case_study.model.contract;

import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCD;

    @ManyToOne
    @JoinColumn(name = "id_con",referencedColumnName = "idCon")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "id_af",referencedColumnName = "idA")
    private AttachFacility attachFacility;

    private int quantity;

    public ContractDetail() {
    }

    public ContractDetail(int idCD, Contract contract, AttachFacility attachFacility, int quantity) {
        this.idCD = idCD;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public int getIdCD() {
        return idCD;
    }

    public void setIdCD(int idCD) {
        this.idCD = idCD;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
