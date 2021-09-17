package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "payment_returns")
public class PaymentReturns {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pay_rtn_id")
    private Integer payRtnID;

    @Column(name = "pay_id", nullable = false)
    private Integer payID;

    @Column(name = "rtn_amount", nullable = false)
    private Float rtnAmount;

    @Column(name = "rtn_qty", nullable = false)
    private Integer rtnQty;

    @Column(name = "stock_id", nullable = false)
    private Integer stockID;

    @Column(name = "sup_id", nullable = false)
    private Integer supID;

    public Integer getPayRtnID() {
        return payRtnID;
    }

    public void setPayRtnID(Integer payRtnID) {
        this.payRtnID = payRtnID;
    }

    public Integer getPayID() {
        return payID;
    }

    public void setPayID(Integer payID) {
        this.payID = payID;
    }

    public Float getRtnAmonut() {
        return rtnAmount;
    }

    public void setRtnAmount(Float rtnAmount) {
        this.rtnAmount = rtnAmount;
    }

    public Integer getRtnQty() {
        return rtnQty;
    }

    public void setRtnQty(Integer rtnQty) {
        this.rtnQty = rtnQty;
    }

    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }
}
