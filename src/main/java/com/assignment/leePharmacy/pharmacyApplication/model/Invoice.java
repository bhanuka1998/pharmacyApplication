package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice")
public class Invoice {
    @Id
    @Column(name = "inv_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer invID;

    @Column(name = "date", nullable = false)
    private Date invDate;

    @Column(name = "grd_price", nullable = false)
    private Float grdPrice;

    @Column(name = "balance", nullable = false)
    private Float balance;

    @Column(name = "pID", nullable = false)
    private Integer pID;

    public Integer getpID() {
        return pID;
    }

    public void setpID(Integer pID) {
        this.pID = pID;
    }

    public Integer getInvID() {
        return invID;
    }

    public void setInvID(Integer invID) {
        this.invID = invID;
    }

    public Date getInvDate() {
        return invDate;
    }

    public void setInvDate(Date invDate) {
        this.invDate = invDate;
    }

    public Float getGrdPrice() {
        return grdPrice;
    }

    public void setGrdPrice(Float grdPrice) {
        this.grdPrice = grdPrice;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }
}
