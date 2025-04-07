package com.r217887l.rawmaterialmanagement.View;

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MainView {
    
    public void MainView(Stage primaryStage){
        
        BorderPane root = new BorderPane();
        
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    
    }
    
}
