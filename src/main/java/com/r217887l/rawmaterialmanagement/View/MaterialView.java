package com.r217887l.rawmaterialmanagement.View;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class MaterialView {
    
    public void MaterialView(StackPane content){
    
        
        TableView tableview = new TableView();
            tableview.setStyle("-fx-background-color: gray;");
            
        GridPane gridpane = createGridPane();
            gridpane.setStyle("-fx-background-color: yellow;");
            gridpane.setPrefWidth(600);
            
    
        HBox mainpanel = new HBox();
            mainpanel.setStyle("-fx-background-color: blue;");
            mainpanel.getChildren().addAll(gridpane,tableview);
            mainpanel.setHgrow(tableview, Priority.ALWAYS);
            
            
            content.getChildren().clear();
            content.getChildren().add(mainpanel);
            
        
        
    }
    
    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setVgap(50);  
        gridPane.setHgap(90);  
        
        Label label = new Label("MateralID");
            label.autosize();
            label.setText("Money");
            label.setFont(new Font("Arial", 24));
            
        
        
        TextField textField = new TextField();
            textField.autosize();
            textField.setBorder(Border.EMPTY);
            
        gridPane.add(label, 0, 0);
        gridPane.add(textField, 1, 0);

        return gridPane;
    }
    
}
