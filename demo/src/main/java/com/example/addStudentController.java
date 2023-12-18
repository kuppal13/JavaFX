package com.example;

import java.io.IOException;
import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class addStudentController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField idTextField;
    Label idinput;

    
    @FXML
    private Label resultLabel;

    @FXML
    TextField nameTextField;
    Label nameinput;

    @FXML
    TextField DOBTextField;
    Label DOBLabel;

    @FXML
    TextField classTextField;
    Label classLabel;

    @FXML
    TextField gradesTextField;
    Label gradesLabel;

    @FXML
    TextField attendanceTextField;
    Label attendanceLabel;


    public void submitAddStudent(ActionEvent event) throws IOException {
        String name = nameTextField.getText();
        int id = Integer.parseInt(idTextField.getText());
        String dob = DOBTextField.getText();
        String class1 = classTextField.getText();
        int grades = Integer.parseInt(gradesTextField.getText());
        int attendance = Integer.parseInt(attendanceTextField.getText());
        

        student student = new student(id, name, dob, class1, grades, attendance);
        studentManager.addStudent(student);
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }
    
    public void cancelToMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}