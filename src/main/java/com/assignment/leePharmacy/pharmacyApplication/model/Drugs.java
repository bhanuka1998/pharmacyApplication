package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "drugs")
public class Drugs implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "drug_id")
    private Integer drugID;

    @OneToOne(targetEntity = Brand.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id", referencedColumnName = "brand_id")
    private Brand brand;

    @ManyToOne(targetEntity = Category.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "cat_id", referencedColumnName = "cat_id")
    private Category category;

    @OneToOne(targetEntity = Rack.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "rack_no", referencedColumnName = "rack_no")
    private Rack rack;

    @OneToOne(targetEntity = Supplier.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "sup_id", referencedColumnName = "sup_id")
    private Supplier supplier;

    @Column(name = "drug_name", nullable = false)
    private String drugName;

    @Column(name = "full_qty", nullable = false)
    private  Integer fullQty;

    @Column(name = "price", nullable = false)
    private Float price;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Integer getDrugID() {
        return drugID;
    }

    public void setDrugID(Integer drugID) {
        this.drugID = drugID;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Rack getRack() {
        return rack;
    }

    public void setRack(Rack rack) {
        this.rack = rack;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
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
