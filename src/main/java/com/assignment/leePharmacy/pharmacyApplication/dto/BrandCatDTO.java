package com.assignment.leePharmacy.pharmacyApplication.dto;

public class BrandCatDTO {
    private Integer brandID;
    private String brandName;
    private Integer catID;
    private String catName;

    public BrandCatDTO(Integer brandID, String brandName, Integer catID, String catName) {
        this.brandID = brandID;
        this.brandName = brandName;
        this.catID = catID;
        this.catName = catName;
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
}
