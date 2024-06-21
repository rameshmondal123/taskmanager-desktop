package com.example.newjavafxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    public void click(ActionEvent actionEvent) {
    }

    public void cancel(ActionEvent actionEvent) {
    }

    public void handleSaveTask(ActionEvent actionEvent) {
    }

    @FXML
    private void onHelloButtonClick() {
        try {
            // Load the new page
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Addnewtask.fxml"));
            Parent newPage = fxmlLoader.load();
            // Create a new stage for the new page
            Stage stage = new Stage();
            stage.setTitle("Add Task");
            stage.setScene(new Scene(newPage, 600, 400));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}