package com.example.gui_test_2;

import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

import java.util.EventListener;

public class itemButton extends HBox {

    String Name = "placeholder";
    double price = 99.99;

    EventHandler clickHandler = new EventHandler<MouseEvent>() {
        @Override
        public void handle(MouseEvent mouseEvent) {

        }


    };
}
