package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "supplier")
public class Supplier implements java.io.Serializable {
    @Id
    @Column(name = "sup_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer supID;

    @Column(name = "sup_name", nullable = false, length = 100)
    private String supName;

    @Column(name = "brand_id", nullable = false)
    private Integer brandID;

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }

    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }
}
