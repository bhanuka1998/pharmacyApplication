package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "payments")
public class Payments {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pay_id")
    private Integer payID;

    @Column(name = "sup_id", nullable = false)
    private Integer supID;

    @Column(name = "grd_amount", nullable = false)
    private Float grdAmount;

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }

    public Float getGrdAmount() {
        return grdAmount;
    }

    public void setGrdAmount(Float grdAmount) {
        this.grdAmount = grdAmount;
    }
}
