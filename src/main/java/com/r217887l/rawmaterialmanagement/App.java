package com.r217887l.rawmaterialmanagement;

import com.r217887l.rawmaterialmanagement.Service.UserService;
import com.r217887l.rawmaterialmanagement.View.MainView;
import com.r217887l.rawmaterialmanagement.View.ViewLogin;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application{

    private final UserService userService = new UserService();
    
    @Override
    public void start(Stage primaryStage) throws Exception {

        final boolean emptyUserTable = userService.checkIfUserTableEmpty();
        
        if(emptyUserTable){
            MainView init = new MainView();
            init.MainView(primaryStage);
        }else{
       
            ViewLogin init = new ViewLogin();
            init.ViewLogin(primaryStage);
        
        }
        
    }
    
   public static void main(String[] args) {
       launch(args);
    }
    
}
