package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "stock")
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private Integer stockID;

    @Column(name = "drug_id", nullable = false)
    private Integer drugID;

    @Column(name = "mf_date", nullable = false)
    private Date mfDate;

    @Column(name = "exp_date", nullable = false)
    private Date expDate;

    @Column(name = "qty", nullable = false)
    private  Integer qty;

    @Column(name =  "rcvd_date", nullable = false)
    private Date rcvdDate;

    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public Date getMfDate() {
        return mfDate;
    }

    public void setMfDate(Date mfDate) {
        this.mfDate = mfDate;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Date getRcvdDate() {
        return rcvdDate;
    }

    public void setRcvdDate(Date rcvdDate) {
        this.rcvdDate = rcvdDate;
    }
}
