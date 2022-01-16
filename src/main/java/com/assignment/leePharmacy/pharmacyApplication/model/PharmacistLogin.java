package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "pharmacist_login")
public class PharmacistLogin {
    @Id
    @Column(name = "pharmacist_log_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userLogId;

    @Column(name = "pharmacist_email")
    private String userEmail;

    @Column(name = "pharmacist_password")
    private String userPassword;

    @Column(name = "status")
    private boolean status;

    @Column(name = "role")

    private String role;

    public PharmacistLogin() {
    }

    public PharmacistLogin(String userEmail) {
        this.userEmail = userEmail;
        this.status = true;
        this.role = "ROLE_PHARMACIST";
    }

    public Integer getUserLogId() {
        return userLogId;
    }

    public void setUserLogId(Integer userLogId) {
        this.userLogId = userLogId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
