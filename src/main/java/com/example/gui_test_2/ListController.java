package com.example.gui_test_2;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;

public class ListController {

    @FXML
    protected void onFruitButtonClick() throws IOException{
        FXMLLoader fruitFXML = new FXMLLoader(getClass().getResource("Fruit-Screen.fxml"));
        Scene fruitScene = new Scene(fruitFXML.load() ,1280, 720);
        Stage fruitStage = new Stage();
        fruitStage.setTitle("FRUIT");
        fruitStage.setScene(fruitScene);
        fruitStage.show();


    }

    @FXML
    protected void onVegButtonClick() throws IOException{
        FXMLLoader vegFXML = new FXMLLoader(getClass().getResource("Veg-Screen.fxml"));
        Scene vegScene = new Scene(vegFXML.load(), 1280, 720);
        Stage vegStage = new Stage();
        vegStage.setTitle("VEG");
        vegStage.setScene(vegScene);
        vegStage.show();

    }
}
