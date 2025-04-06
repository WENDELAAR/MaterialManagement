package com.r217887l.rawmaterialmanagement.Model;

import java.sql.Date;

public class Inventory {

    private Date stokedate;
    private String material;
    private int stockin;
    private int stockout;
    private Double price;

    public Inventory() {
    }

    public Inventory(Date stokedate, String material, int stockin, int stockout, Double price) {
        this.stokedate = stokedate;
        this.material = material;
        this.stockin = stockin;
        this.stockout = stockout;
        this.price = price;
    }

    public Date getStokedate() {
        return stokedate;
    }

    public void setStokedate(Date stokedate) {
        this.stokedate = stokedate;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getStockin() {
        return stockin;
    }

    public void setStockin(int stockin) {
        this.stockin = stockin;
    }

    public int getStockout() {
        return stockout;
    }

    public void setStockout(int stockout) {
        this.stockout = stockout;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    
    
    
}
