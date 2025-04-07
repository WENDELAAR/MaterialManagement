package com.r217887l.rawmaterialmanagement.View;

import javafx.animation.TranslateTransition;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainView {
    
    private boolean isDrawerVisible = false;
    private static final double DRAWER_WIDTH = 250;
    
    public void MainView(Stage primaryStage){
        
        BorderPane root = new BorderPane();
        
             VBox drawer = configureDrawer();
        drawer.setTranslateX(-DRAWER_WIDTH); // Initially hide the drawer

        StackPane content = new StackPane();
        content.setStyle("-fx-background-color:  #E6E6FA;");
        
        HBox header = configureHeader();
        
        Button toggle = configureToggleButton();
        toggle.setOnMouseClicked(_->toggleDrawer(drawer,content));
        
        VBox logoPane = new VBox();
        logoPane.setAlignment(Pos.CENTER);
        
        Label logo = new Label("Material Management System");
        logo.setStyle("-fx-text-fill: White;");
        logo.setFont(Font.font("Tahoma",32));
        logoPane.getChildren().add(logo);
        
        header.getChildren().addAll(toggle,logoPane);
   
        StackPane mainContent = new StackPane(drawer,content);
   
        root.setTop(header);
        root.setCenter(mainContent);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    
    }

    private VBox configureDrawer() {
        VBox drawer = new VBox(10);
        drawer.setStyle("-fx-background-color: #818589; -fx-pref-width: " + DRAWER_WIDTH + ";");
        drawer.setPadding(new Insets(30));
        
        Button dashboard = new Button("Dashboard");
        dashboard.setPrefSize(190,40);
        dashboard.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        dashboard.setOnMouseEntered(_->{
        dashboard.setStyle("-fx-background-color: #202E78;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        });
        
        dashboard.setOnMouseExited(_->{
        dashboard.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        });
        
        
                
        Button inventory = new Button("Inventory");
        inventory.setPrefSize(190,40);
        inventory.setStyle("-fx-background-color: #001429;"
                  + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        inventory.setOnMouseEntered(_->{
        inventory.setStyle("-fx-background-color: #202E78;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        });
        
        inventory.setOnMouseExited(_->{
        inventory.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        });
        
        Button materials = new Button("Materials");
        materials.setPrefSize(190,40);
        materials.setStyle("-fx-background-color: #001429;"
                  + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        materials.setOnMouseEntered(_->{
        materials.setStyle("-fx-background-color: #202E78;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        });
        
        materials.setOnMouseExited(_->{
        materials.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        });
        
        Button orderLevel = new Button("Payments");
        orderLevel.setPrefSize(190,40);
        orderLevel.setStyle("-fx-background-color: #001429;"
                  + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
              
        
        orderLevel.setOnMouseEntered(_->{
        orderLevel.setStyle("-fx-background-color: #202E78;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        });
        
        orderLevel.setOnMouseExited(_->{
        orderLevel.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        });
        
        Button supplier = new Button("Supplier Details");
        supplier.setPrefSize(190,40);
        supplier.setStyle("-fx-background-color: #001429;"
                  + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        supplier.setOnMouseEntered(_->{
        supplier.setStyle("-fx-background-color: #202E78;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        });
        
        supplier.setOnMouseExited(_->{
        supplier.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        });
        
        
        Button users = new Button("User Management");
        users.setPrefSize(190,40);
        users.setStyle("-fx-background-color: #001429;"
                  + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        users.setOnMouseEntered(_->{
        users.setStyle("-fx-background-color: #202E78;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        });
        
        users.setOnMouseExited(_->{
        users.setStyle("-fx-background-color: #001429;"
                + "-fx-font-size: 14px; "
                +" -fx-text-fill: white;"
                 + "-fx-border-color: transparent;"
                + "-fx-font-weight: bold;");
        
        });
        
        
        
        drawer.getChildren().addAll(dashboard,inventory,materials,orderLevel,supplier,users);
       
        return drawer;
    }

    private HBox configureHeader() {
       HBox header = new HBox(10);
        
        header.setStyle("-fx-background-color:  #001429; "
                + "-fx-pref-height:70;"
                + "-fx-border-color: transparent;"
                + "-fx-padding: 10;"
                + "-fx-effect: dropshadow(gaussian, rgba(0,0,0,0.8), 5, 0, 1, 1);");
       
        return header;
   
    }
    
    private Button configureToggleButton() {
        Button toggle = new Button("Toggle");
        toggle.setPrefHeight(50);
        return toggle;
   
    }

    private void toggleDrawer(VBox drawer, StackPane content) {
          TranslateTransition transition = new TranslateTransition(Duration.millis(300), drawer);

        if (isDrawerVisible) {
            // Hide drawer
            transition.setFromX(0);
            transition.setToX(-DRAWER_WIDTH);
            content.setTranslateX(0); // Reset content position
        } else {
            // Show drawer
            transition.setFromX(-DRAWER_WIDTH);
            transition.setToX(0);
            content.setTranslateX(DRAWER_WIDTH); // Move content right when drawer shows
        }

        transition.play();
        isDrawerVisible = !isDrawerVisible;
    }
    
}
