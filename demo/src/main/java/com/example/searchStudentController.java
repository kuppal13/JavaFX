package com.example;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class searchStudentController {
    private Parent root;
    private Stage stage;
    private Scene scene;
    @FXML
    Label getnameLabel;
    @FXML
    private TextField idField;

    @FXML
    private Label resultLabel;

    @FXML
    private void searchStudent(ActionEvent event) {
        int id = Integer.parseInt(idField.getText());

        student student = studentManager.findStudentById(id);

        if (student != null) {
            resultLabel.setText("Name: " + student.getName()+"\n" +
            "DOB: " + student.getDOB()+"\n"+ 
            "Class: " + student.getClass1()+"\n"+ 
            "Grades: " + student.getGrades()+"% "+"\n" +
            "Attendance: " + student.getAttendance()+"% ");
        } else {
            resultLabel.setText("No student found with ID " + id);
        }
    }

    public void cancelToMain(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("main.fxml"));
        stage = (Stage) (((Node) event.getSource()).getScene().getWindow());
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

