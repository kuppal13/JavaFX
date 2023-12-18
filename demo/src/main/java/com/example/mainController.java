package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class mainController {
    @FXML
    private Button studentbButton;
    @FXML
    private Button searchstudent;
    @FXML
    private Button modifyStudentButton;
    @FXML
    private Button exitButton;

    private Stage stage;
    private Scene scene;
    private Parent root;

    public void startswitchToScene2(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("addStudent.fxml"));
        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void startswitchToScene3(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("searchStudent.fxml"));
        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void startswitchToStudentModify(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("studentModify.fxml"));
        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void startswitchToExit(ActionEvent event) throws IOException {
        Node source = (Node) event.getSource();
        Stage stage = (Stage) source.getScene().getWindow();
        System.out.println("Thanks for using our app!!!!");
        stage.close();
    }

}