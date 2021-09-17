package com.assignment.leePharmacy.pharmacyApplication.model;

import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import org.hibernate.annotations.CollectionId;
import org.hibernate.exception.DataException;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "invoice_items")
public class InvoiceItems {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "inv_it_id")
    private Integer invItID;

    @Column(name = "inv_id", nullable = false)
    private Integer invID;

    @Column(name = "inv_date", nullable = false)
    private Date invDate;

    @Column(name = "drug_id", nullable = false)
    private Integer drugID;

    @Column(name = "qty", nullable = false)
    private Integer qty;

    @Column(name = "price", nullable = false)
    private Float price;

    @Column(name = "tot_price", nullable = false)
    private Float totPrice;

    public Integer getInvItID() {
        return invItID;
    }

    public void setInvItID(Integer invItID) {
        this.invItID = invItID;
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

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTotPrice() {
        return totPrice;
    }

    public void setTotPrice(Float totPrice) {
        this.totPrice = totPrice;
    }
}
