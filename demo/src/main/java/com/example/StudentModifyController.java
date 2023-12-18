package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;
import java.util.ArrayList;

public class StudentModifyController {
    private Parent root;
    private Stage stage;
    private Scene scene;

    @FXML
    private TextField idField;
     @FXML
    private TextField nameField;
    @FXML
    private TextField dobField;
    @FXML
    private TextField classField;
    @FXML
    private TextField gradesField;
    @FXML
    private TextField attendanceField;

    @FXML
    private Label statusLabel;

    private int currentIndex = -1;
    private ArrayList<student> students;

    public void initialize() {
        students = studentManager.getStudents();
        if (!students.isEmpty()) {
            currentIndex = 0;
            loadStudentData(currentIndex);
        }
    }

    private void loadStudentData(int index) {
        if (index < 0 || index >= students.size()) {
            statusLabel.setText("No students available.");
            return;
        }
        student currentStudent = students.get(index);
        idField.setText(String.valueOf(currentStudent.getId()));
        nameField.setText(currentStudent.getName());
        dobField.setText(currentStudent.getDOB());
        classField.setText(currentStudent.getClass1());
        gradesField.setText(String.valueOf(currentStudent.getGrades()));
        attendanceField.setText(String.valueOf(currentStudent.getAttendance()));
    }

    @FXML
    public void handlePrevButton(ActionEvent event) {
        if (currentIndex > 0) {
            currentIndex--;
            loadStudentData(currentIndex);
        } else {
            statusLabel.setText("You're already viewing the first student.");
        }
    }

    @FXML
    public void handleNextButton(ActionEvent event) {
        if (currentIndex < students.size() - 1) {
            currentIndex++;
            loadStudentData(currentIndex);
        } else {
            statusLabel.setText("You're already viewing the last student.");
        }
    }

    @FXML
    public void handleSaveButton(ActionEvent event) {
        student currentStudent = students.get(currentIndex);
        try {
            currentStudent.setName(nameField.getText());
            currentStudent.setDOB(dobField.getText());
            currentStudent.setClass1(classField.getText());
            currentStudent.setGrades(Integer.parseInt(gradesField.getText()));
            currentStudent.setAttendance(Integer.parseInt(attendanceField.getText()));

            statusLabel.setText("Student data saved successfully!");
        } catch (NumberFormatException e) {
            statusLabel.setText("Error: Please ensure grades and attendance are valid numbers.");
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
