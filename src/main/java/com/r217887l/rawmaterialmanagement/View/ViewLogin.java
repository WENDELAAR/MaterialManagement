package com.r217887l.rawmaterialmanagement.View;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ViewLogin {

    public void ViewLogin(Stage primaryStage) {
        
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root,500,420);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
        
    }
    
}
