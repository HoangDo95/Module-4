package com.codegym.case_study.model.facility;

import com.codegym.case_study.model.contract.Contract;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idF;
    private String nameF;
    private int area;
    private double cost;
    private int maxPeople;

    @ManyToOne
    @JoinColumn(name = "id_rt",referencedColumnName = "idRT")
    private RentType rentType;

    @ManyToOne
    @JoinColumn(name = "id_ft",referencedColumnName = "idFT")
    private FacilityType facilityType;

    private String standardRoom;
    private String other;
    private double poolArea;
    private int floors;
    private String freeF;

    @OneToMany(mappedBy = "facility")
    private Set<Contract> contractSet;

    public Facility() {
    }

    public Facility(int idF, String nameF, int area, double cost, int maxPeople, RentType rentType, FacilityType facilityType, String standardRoom, String other, double poolArea, int floors, String freeF) {
        this.idF = idF;
        this.nameF = nameF;
        this.area = area;
        this.cost = cost;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
        this.facilityType = facilityType;
        this.standardRoom = standardRoom;
        this.other = other;
        this.poolArea = poolArea;
        this.floors = floors;
        this.freeF = freeF;
    }

    public int getIdF() {
        return idF;
    }

    public void setIdF(int idF) {
        this.idF = idF;
    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(int maxPeople) {
        this.maxPeople = maxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public FacilityType getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(FacilityType facilityType) {
        this.facilityType = facilityType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    public String getFreeF() {
        return freeF;
    }

    public void setFreeF(String freeF) {
        this.freeF = freeF;
    }
}
