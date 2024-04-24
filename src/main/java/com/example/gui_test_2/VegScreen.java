package com.example.gui_test_2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class VegScreen {

    @FXML
    public void handleCloseButtonAction() throws IOException {


        new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent actionEvent) {
                // take some action
                System.out.println( actionEvent.getEventType());

                // close the dialog.
                Node source = (Node)  actionEvent.getSource();
                Stage stage  = (Stage) source.getScene().getWindow();
                stage.close();
            }
        };
    }
}
