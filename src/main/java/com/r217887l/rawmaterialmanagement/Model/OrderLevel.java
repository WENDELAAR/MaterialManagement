
package com.r217887l.rawmaterialmanagement.Model;

public class OrderLevel {
    
    private String material;
    private String reorder;
    private String stoporder;

    public OrderLevel() {
    }

    public OrderLevel(String material, String reorder, String stoporder) {
        this.material = material;
        this.reorder = reorder;
        this.stoporder = stoporder;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getReorder() {
        return reorder;
    }

    public void setReorder(String reorder) {
        this.reorder = reorder;
    }

    public String getStoporder() {
        return stoporder;
    }

    public void setStoporder(String stoporder) {
        this.stoporder = stoporder;
    }
    
    
    
    
}
