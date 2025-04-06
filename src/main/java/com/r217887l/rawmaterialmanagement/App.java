package com.r217887l.rawmaterialmanagement;

import com.r217887l.rawmaterialmanagement.View.ViewLogin;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class App extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root = new StackPane();
        
        ViewLogin init = new ViewLogin();
        init.ViewLogin(root,primaryStage);
        
        Scene scene = new Scene(root,500,500);
        primaryStage.setScene(scene);
        primaryStage.setResizable(true);
        primaryStage.show();
        
    }
    
   public static void main(String[] args) {
       launch(args);
    }
    
}
