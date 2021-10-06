package com.assignment.leePharmacy.pharmacyApplication.dto;

public class DrugDTO {
    private Integer drugID;
    private String drugName;
    private Integer brandID;
    private String brandName;
    private Integer catID;
    private String catName;
    private Integer rackNo;
    private Integer fullQty;
    private Float price;

    public DrugDTO(Integer drugID, String drugName, Integer brandID, String brandName, Integer catID, String catName, Integer rackNo, Integer fullQty, Float price) {
        this.drugID = drugID;
        this.drugName = drugName;
        this.brandID = brandID;
        this.brandName = brandName;
        this.catID = catID;
        this.catName = catName;
        this.rackNo = rackNo;
        this.fullQty = fullQty;
        this.price = price;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public Integer getRackNo() {
        return rackNo;
    }

    public void setRackNo(Integer rackNo) {
        this.rackNo = rackNo;
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
