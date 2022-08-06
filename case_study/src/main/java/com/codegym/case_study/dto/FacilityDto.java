package com.codegym.case_study.dto;

import com.codegym.case_study.model.facility.FacilityType;
import com.codegym.case_study.model.facility.RentType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class FacilityDto {
    private int idF;

    @NotBlank(message = "Không được để trống")
    @Pattern(message = "Sai định dạng (VD: Nguyễn Văn A)", regexp = "^([A-Z\\p{L}]{1}[a-z\\p{L}]*)+(\\s([A-Z\\p{L}]{1}[a-z\\p{L}]*))*$")
    private String nameF;

    @NotNull(message = "Không được để trống")
    private int area;

    @NotNull(message = "Không được để trống")
    @Pattern(message = "Phải nhập số và lớn hơn 0",regexp = "[1-9]+\\d*")
    private double cost;

    @NotNull(message = "Không được để trống")
    private int maxPeople;

    @NotBlank(message = "Không được để trống")
    private RentType rentType;

    @NotBlank(message = "Không được để trống")
    private FacilityType facilityType;

    @NotBlank(message = "Không được để trống")
    private String standardRoom;

    @NotBlank(message = "Không được để trống")
    private String other;

    @NotNull(message = "Không được để trống")
    @Pattern(message = "Phải nhập số và lớn hơn 0",regexp = "[1-9]+\\d*")
    private double poolArea;

    @NotNull(message = "Không được để trống")
    @Pattern(message = "Phải nhập số và lớn hơn 0",regexp = "[1-9]+\\d*")
    private int floors;

    @NotBlank(message = "Không được để trống")
    private String freeF;

    public FacilityDto() {
    }

    public FacilityDto(int idF, String nameF, int area, double cost, int maxPeople, RentType rentType, FacilityType facilityType, String standardRoom, String other, double poolArea, int floors, String freeF) {
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
