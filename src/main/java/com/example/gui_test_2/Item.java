package com.example.gui_test_2;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Item {
    static String name = "";
    String barcode;
    static float price;





     public static HBox createBox(){
         Label displayName = new Label(name);
         Label displayPrice = new Label(String.valueOf(price));


         HBox itemBox = new HBox(displayName, displayPrice);
         return itemBox;
     }


}
