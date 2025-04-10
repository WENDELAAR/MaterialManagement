package com.r217887l.rawmaterialmanagement.View;

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

public class MainView {
    
    public void MainView(Stage primaryStage){
        
        BorderPane root = new BorderPane();

        StackPane content = new StackPane();
        content.setStyle("-fx-background-color:  #E6E6FA;");
        
        HBox header = configureHeader();
        
        VBox drawer = configureDrawer(content);
        
        VBox logoPane = new VBox();
        logoPane.setAlignment(Pos.CENTER);
        
        Label logo = new Label("Material Management System");
        logo.setStyle("-fx-text-fill: White;");
        logo.setFont(Font.font("Tahoma",32));
        logoPane.getChildren().add(logo);
        
        header.getChildren().add(logoPane);
   
        root.setTop(header);
        root.setLeft(drawer);
        root.setCenter(content);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setMaximized(true);
        primaryStage.show();
    
    }

    private VBox configureDrawer(StackPane content) {
        VBox drawer = new VBox(10);
        drawer.setStyle("-fx-background-color: #818589;");
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
        
        dashboard.setOnAction(_->{
        
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
        
        inventory.setOnAction(_->{
            
            InventoryView init = new InventoryView();
            init.InventoryView(content);
        
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
        
        materials.setOnAction(_->{
            
            MaterialView init = new MaterialView();
            init.MaterialView(content);
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
        
        supplier.setOnAction(_->{
        
            SupplierView init = new SupplierView();
            init.SupplierView(content);
        
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
        
        users.setOnAction(_->{
        
            UserView init = new UserView();
            init.UserView();
            
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
}
