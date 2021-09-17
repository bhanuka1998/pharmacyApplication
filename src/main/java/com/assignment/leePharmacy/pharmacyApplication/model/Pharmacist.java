package com.assignment.leePharmacy.pharmacyApplication.model;

import org.aspectj.bridge.Message;
import org.springframework.stereotype.Controller;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "pharmacist")
public class Pharmacist {
    @Id
    @Column(name = "pID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pID;

    @NotBlank(message = "Name cannot be empty")
    @Column(name = "p_name", length = 100, nullable = false)
    private String pName;

    @Column(name = "p_username", length = 50, nullable = false)
    private String pUName;

    @Column(name = "p_password", length = 100, nullable = false)
    private String pPassword;

    public Integer getpID() {
        return pID;
    }

    public void setpID(Integer pID) {
        this.pID = pID;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpUName() {
        return pUName;
    }

    public void setpUName(String pUName) {
        this.pUName = pUName;
    }

    public String getpPassword() {
        return pPassword;
    }

    public void setpPassword(String pPassword) {
        this.pPassword = pPassword;
    }
}
