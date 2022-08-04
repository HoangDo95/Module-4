package com.codegym.case_study.model.facility;

import javax.persistence.*;
import java.util.Set;

@Entity
public class RentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idRT;
    private String nameRT;

    @OneToMany(mappedBy = "rentType")
    private Set<Facility> facilitySet;

    public RentType() {
    }

    public int getIdRT() {
        return idRT;
    }

    public void setIdRT(int idRT) {
        this.idRT = idRT;
    }

    public String getNameRT() {
        return nameRT;
    }

    public void setNameRT(String nameRT) {
        this.nameRT = nameRT;
    }

    public Set<Facility> getFacilitySet() {
        return facilitySet;
    }

    public void setFacilitySet(Set<Facility> facilitySet) {
        this.facilitySet = facilitySet;
    }
}
