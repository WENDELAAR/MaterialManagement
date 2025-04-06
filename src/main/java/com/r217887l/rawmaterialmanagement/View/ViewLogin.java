package com.r217887l.rawmaterialmanagement.View;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ViewLogin {

    public void ViewLogin(StackPane root, Stage primaryStage) {
        
        HBox mainpanel = new HBox();
        mainpanel.setStyle(
           "-fx-background-color: rgba(255, 255, 255, 0.4);"
         + "-fx-border-color: transparent;"
         + "-fx-background-radius: 15;"          
         + " -fx-effect: dropshadow(gaussian, rgba(0,0,0,0.5), 10, 0, 1, 1);"
        );
                
        VBox formpanel = new VBox();
        
        GridPane form = new GridPane();
        
        formpanel.getChildren().addAll(form);
        
        mainpanel.getChildren().addAll(formpanel);
        
        root.getChildren().clear();
        root.getChildren().addAll(mainpanel);
    }
    
}
