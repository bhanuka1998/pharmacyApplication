package com.assignment.leePharmacy.pharmacyApplication.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category implements java.io.Serializable {

    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cat_id;

    @Column(name = "cat_name", length = 60, nullable = false)
    private String cat_name;

    public Integer getCat_id() {
        return cat_id;
    }

    public void setCat_id(Integer cat_id) {
        this.cat_id = cat_id;
    }

    public String getCat_name() {
        return cat_name;
    }

    public void setCat_name(String cat_name) {
        this.cat_name = cat_name;
    }
}
