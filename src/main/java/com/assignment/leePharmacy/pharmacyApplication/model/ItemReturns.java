package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "item_returns")
public class ItemReturns {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "return_id")
    private Integer returnID;

    @Column(name = "drug_id", nullable = false)
    private Integer drugID;

    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Column(name = "tot_rtn_price", nullable = false)
    private Float totRtnPrice;

    @Column(name = "pID", nullable = false)
    private Integer pID;

    @Column(name = "inv_id")
    private Integer invID;

    public Integer getReturnID() {
        return returnID;
    }

    public void setReturnID(Integer returnID) {
        this.returnID = returnID;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Float getTotRtnPrice() {
        return totRtnPrice;
    }

    public void setTotRtnPrice(Float totRtnPrice) {
        this.totRtnPrice = totRtnPrice;
    }

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
}
