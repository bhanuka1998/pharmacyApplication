package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "stock")
public class Stock implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "stock_id")
    private Integer stockID;

    @OneToOne(targetEntity = Drugs.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "drug_id", referencedColumnName = "drug_id")
    private Drugs drugs;

    @Column(name = "mf_date", nullable = false)
    private String mfDate;

    @Column(name = "exp_date", nullable = false)
    private String expDate;

    @Column(name = "qty", nullable = false)
    private  Integer qty;

    @Column(name =  "rcvd_date", nullable = false)
    private String rcvdDate;


    public Integer getStockID() {
        return stockID;
    }

    public void setStockID(Integer stockID) {
        this.stockID = stockID;
    }

    public Drugs getDrugs() {
        return drugs;
    }

    public void setDrugs(Drugs drugs) {
        this.drugs = drugs;
    }

    public String getMfDate() {
        return mfDate;
    }

    public void setMfDate(String mfDate) {
        this.mfDate = mfDate;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getRcvdDate() {
        return rcvdDate;
    }

    public void setRcvdDate(String rcvdDate) {
        this.rcvdDate = rcvdDate;
    }
}
