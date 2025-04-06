
package com.r217887l.rawmaterialmanagement.Model;


public class Materials {
  
    private String name;
    private String dec;
    private String sku;
    private String category;
    private String supplier;

    public Materials() {
    }

    public Materials(String name, String dec, String sku, String category, String supplier) {
        this.name = name;
        this.dec = dec;
        this.sku = sku;
        this.category = category;
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDec() {
        return dec;
    }

    public void setDec(String dec) {
        this.dec = dec;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
    
    
    
    
}
