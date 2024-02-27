package com.example.gui_test_2;

import javafx.application.Application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class TestController extends Application {

    @FXML
    private Label gregory;

    @FXML

    protected void onTestButtonClick() {
        gregory.setText("This is a test button");
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

    }
}
