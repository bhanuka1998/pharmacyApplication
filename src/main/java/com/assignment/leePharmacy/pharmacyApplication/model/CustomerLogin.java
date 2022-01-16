package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "tbl_cust_login")
public class CustomerLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_log_id", nullable = false)
    private Integer cusLogID;


    @Column(name = "cus_email", nullable = false)
    private String cusEmail;

    @Column(name = "cus_password", nullable = false)
    private String cusPassword;

    @Column(name = "status", nullable = false)
    private int status;

    public Integer getCusLogID() {
        return cusLogID;
    }

    public void setCusLogID(Integer cusLogID) {
        this.cusLogID = cusLogID;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPassword() {
        return cusPassword;
    }

    public void setCusPassword(String cusPassword) {
        this.cusPassword = cusPassword;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

}
