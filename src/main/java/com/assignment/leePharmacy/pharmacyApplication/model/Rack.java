package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;

@Entity
@Table(name = "rack")
public class Rack implements java.io.Serializable {
    @Id
    @Column(name = "rack_no")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer rackNo;

    @Column(name = "cat_id", nullable = false)
    private Integer catID;

    @Column(name = "brand_id", nullable = false)
    private Integer brandID;

    @Column(name = "row_no", nullable = false)
    private Integer rowNo;

    public Integer getRowNo() {
        return rowNo;
    }

    public void setRowNo(Integer rowNo) {
        this.rowNo = rowNo;
    }

    public Integer getRackNo() {
        return rackNo;
    }

    public void setRackNo(Integer rackNo) {
        this.rackNo = rackNo;
    }

    public Integer getCatID() {
        return catID;
    }

    public void setCatID(Integer catID) {
        this.catID = catID;
    }

    public Integer getBrandID() {
        return brandID;
    }

    public void setBrandID(Integer brandID) {
        this.brandID = brandID;
    }
}
