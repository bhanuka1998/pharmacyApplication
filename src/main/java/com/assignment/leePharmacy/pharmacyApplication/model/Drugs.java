package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "drugs")
public class Drugs {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drug_id")
    private Integer drugID;

    @Column(name = "brand_id", nullable = false)
    private Integer brandID;

    @Column(name = "cat_id", nullable = false)
    private Integer catID;

    @Column(name = "rack_no", nullable = false)
    private Integer rackNo;

    @Column(name = "drug_name", nullable = false)
    private String drugName;

    @Column(name = "sup_id", nullable = false)
    private Integer supID;

    @Column(name = "full_qty", nullable = false)
    private  Integer fullQty;

    @Column(name = "price", nullable = false)
    private Float price;

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public Integer getRackNo() {
        return rackNo;
    }

    public void setRackNo(Integer rackNo) {
        this.rackNo = rackNo;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getSupID() {
        return supID;
    }

    public void setSupID(Integer supID) {
        this.supID = supID;
    }

    public Integer getFullQty() {
        return fullQty;
    }

    public void setFullQty(Integer fullQty) {
        this.fullQty = fullQty;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
