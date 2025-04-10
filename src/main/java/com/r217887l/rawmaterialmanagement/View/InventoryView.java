
package com.r217887l.rawmaterialmanagement.View;

import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

public class InventoryView {
    
    public void InventoryView(StackPane content){
    
            HBox mainpanel = new HBox();
            mainpanel.setStyle("-fx-background-color: red;");
            
            content.getChildren().clear();
            content.getChildren().add(mainpanel);        
    
            
    }
    
}
