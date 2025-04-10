
package com.r217887l.rawmaterialmanagement.View;

import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;


public class SupplierView {
    
    public void SupplierView(StackPane content){
    
    
        HBox mainpanel = new HBox();
            mainpanel.setStyle("-fx-background-color: green;");
            
            content.getChildren().clear();
            content.getChildren().add(mainpanel);
    }
    
}
