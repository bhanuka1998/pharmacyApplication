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
    private String invDate;

    @Column(name = "grd_price", nullable = false)
    private Float grdPrice;

    @Column(name = "p_name", nullable = false)
    private String pName;


    public Integer getInvID() {
        return invID;
    }

    public void setInvID(Integer invID) {
        this.invID = invID;
    }

    public String getInvDate() {
        return invDate;
    }

    public void setInvDate(String invDate) {
        this.invDate = invDate;
    }

    public Float getGrdPrice() {
        return grdPrice;
    }

    public void setGrdPrice(Float grdPrice) {
        this.grdPrice = grdPrice;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }
}
