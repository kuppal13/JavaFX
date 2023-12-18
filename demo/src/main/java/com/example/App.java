package com.example;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        try{
            // Group root= new Group();
        Parent root= FXMLLoader.load(getClass().getResource("main.fxml"));
        Scene scene= new Scene(root);
        // String css=this.getClass().getResource("style.css").toExternalForm();
        // scene.getStylesheets().add(css);
        Image icon=new Image("4436481.png");
        stage.getIcons().add(icon);
        stage.setTitle("Stage Demo Program");        
        stage.sizeToScene();
        stage.setScene(scene);
        stage.show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        launch(args);
    }
}