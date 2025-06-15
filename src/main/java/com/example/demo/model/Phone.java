package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "phone")
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "model_name", length = 400)
    private String modelName;

    @Column(name = "brand_name", length = 350)
    private String brandName;

    @Column(name = "price")
    private Double price;

    @Column(name = "shop")
    private String shop;



    public Long getId() {
        return id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public Double getPrice() {
        return price;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
    public String getShop() {
        return shop;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id", unique = true)
    private Person person;

}

