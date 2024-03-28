package com.example.gui_test_2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;


public class HelloController {


    @FXML
    private Label welcomeText;

    @FXML
    private Integer greg = 0;

    @FXML
    protected void onHelloButtonClick() throws IOException {
        welcomeText.setText("Welcome to JavaFX Application!" + greg);
        greg += 1;
        HelloApplication secondScreen = new HelloApplication();
        Stage stage = new Stage();
        secondScreen.secondScreen(stage);
        secondScreen.numberInput(5);
        secondScreen.mainScreen(stage);
    }
}
