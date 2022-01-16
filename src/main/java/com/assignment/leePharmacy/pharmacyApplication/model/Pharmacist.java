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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer pID;

    @NotBlank(message = "Name cannot be empty")
    @Column(name = "p_name", length = 100, nullable = false)
    private String pName;

    @Column(name = "p_username", length = 50, nullable = false)
    private String pEmail;

    @OneToOne(targetEntity = PharmacistLogin.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "pID", referencedColumnName = "user_log_id")
    private PharmacistLogin pharmacistLogin;

    public Pharmacist() {
    }

    public Pharmacist(@NotBlank(message = "Name cannot be empty") String pName, String pEmail, PharmacistLogin pharmacistLogin) {
        this.pName = pName;
        this.pEmail = pEmail;
        this.pharmacistLogin = pharmacistLogin;
    }

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

    public String getpEmail() {
        return pEmail;
    }

    public void setpEmail(String pEmail) {
        this.pEmail = pEmail;
    }

    public PharmacistLogin getPharmacistLogin() {
        return pharmacistLogin;
    }

    public void setPharmacistLogin(PharmacistLogin pharmacistLogin) {
        this.pharmacistLogin = pharmacistLogin;
    }
}
