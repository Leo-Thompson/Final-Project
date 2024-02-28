package com.example.gui_test_2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class numInScreen {

    VBox numDisplay = new VBox();
    Label displayTotal = new Label("");

    HelloApplication funcIn = new HelloApplication();
    Button num1 = new Button("1");
    Button num2 = new Button("2");
    Button num3 = new Button("3");
    Button num4 = new Button("4");
    Button num5 = new Button("5");
    Button num6 = new Button("6");
    Button num7 = new Button("7");
    Button num8 = new Button("8");
    Button num9 = new Button("9");
    Button num0 = new Button("0");
    Button add = new Button  ("+");
    Button minus = new Button("-");

    public VBox keypadDisplay(int numIn) throws IOException{
        int intTotal = numIn;
        String stringTotal = String.valueOf(numIn);





        num1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    HelloApplication.increaseNumberByDigit("1", stringTotal);
                } catch (IOException e) {
                    System.out.println("somethings gone wrong");
                    throw new RuntimeException(e);

                }
                System.out.println("test");
            }
        });


        num2.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("2", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num3.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("3", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num4.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("4", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num5.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("5", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num6.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("6", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num7.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("7", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num8.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("8", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);

            }

        });
        num9.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("9", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num0.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("0", stringTotal);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });


        HBox row1 = new HBox();
        row1.getChildren().addAll(num1, num2, num3);
        HBox row2 = new HBox();
        row2.getChildren().addAll(num4, num5, num6);
        HBox row3 = new HBox();
        row3.getChildren().addAll(num7, num8, num9);
        HBox row4 = new HBox();
        row4.getChildren().addAll(add, num0, minus);


        if (numDisplay.getChildren().isEmpty() == false){
            numDisplay.getChildren().clear();
        }






        numDisplay.getChildren().addAll(displayTotal, row1, row2, row3, row4);



        System.out.println(numDisplay.getChildren());
        return numDisplay;

    }

}
