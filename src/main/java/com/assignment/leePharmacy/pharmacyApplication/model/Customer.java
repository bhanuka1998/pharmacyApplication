package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;


@Entity
@Table(name = "tbl_customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cus_id", nullable = false)
    private Integer cusID;

    @Column(name = "cus_name", nullable = false)
    private String cusName;

    @Column(name = "cus_email", nullable = false)
    private String cusEmail;

    @Column(name = "cus_phone", nullable = false)
    private String cusPhone;

    @OneToOne(targetEntity = CustomerLogin.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "cus_id", referencedColumnName = "cus_log_id")
    private CustomerLogin customerLogin;

    public Integer getCusID() {
        return cusID;
    }

    public void setCusID(Integer cusID) {
        this.cusID = cusID;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public CustomerLogin getCustomerLogin() {
        return customerLogin;
    }

    public void setCustomerLogin(CustomerLogin customerLogin) {
        this.customerLogin = customerLogin;
    }
}
