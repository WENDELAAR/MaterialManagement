package com.r217887l.rawmaterialmanagement.View;

import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ViewLogin {

    public void ViewLogin(StackPane root, Stage primaryStage) {
        
        HBox mainpanel = new HBox();
                
        VBox formpanel = new VBox();
        formpanel.setAlignment(Pos.CENTER);
        
         
        Label titles = new Label("Raw Material \n Management");
        titles.setStyle("-fx-text-fill: #001429;"
                    + "-fx-font-weight: bold;");
        titles.setFont(Font.font("Ariel",24));
        
        GridPane form = new GridPane();
        
        formpanel.getChildren().addAll(titles,form);
        
        mainpanel.getChildren().addAll(formpanel);
        
        root.getChildren().clear();
        root.getChildren().addAll(mainpanel);
    }
    
}
