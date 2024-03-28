package com.example.gui_test_2;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.io.IOException;

public class numInScreen {

    Font font = Font.font("Courier New", FontWeight.BOLD, 32);

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
    Button remove = new Button("<-");



    public VBox keypadDisplay(int numIn) throws IOException{

        num1.setMinHeight(50);
        num1.setMinWidth(50);
        num1.setFont(font);


        num2.setMinHeight(50);
        num2.setMinWidth(50);
        num2.setFont(font);

        num3.setMinHeight(50);
        num3.setMinWidth(50);
        num3.setFont(font);

        num4.setMinHeight(50);
        num4.setMinWidth(50);
        num4.setFont(font);

        num5.setMinHeight(50);
        num5.setMinWidth(50);
        num5.setFont(font);

        num6.setMinHeight(50);
        num6.setMinWidth(50);
        num6.setFont(font);

        num7.setMinHeight(50);
        num7.setMinWidth(50);
        num7.setFont(font);

        num8.setMinHeight(50);
        num8.setMinWidth(50);
        num8.setFont(font);

        num9.setMinHeight(50);
        num9.setMinWidth(50);
        num9.setFont(font);

        num0.setMinHeight(50);
        num0.setMinWidth(50);
        num0.setFont(font);

        add.setMinHeight(50);
        add.setMinWidth(50);
        add.setFont(font);

        minus.setMinHeight(50);
        minus.setMinWidth(50);
        minus.setFont(font);

        displayTotal.setMinWidth(300);
        displayTotal.setMaxWidth(200);
        displayTotal.setFont(font);
        int intTotal = numIn;
        String stringTotal = String.valueOf(numIn);



        num1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                try {
                    HelloApplication.increaseNumberByDigit("1", displayTotal.getText() );
                } catch (IOException e) {
                    System.out.println("somethings gone wrong");
                    throw new RuntimeException(e);

                }
                System.out.println("test");
            }
        });


        num2.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("2", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num3.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("3", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num4.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("4", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num5.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("5", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num6.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("6", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num7.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("7", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num8.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("8", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);

            }

        });
        num9.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("9", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        num0.setOnAction(actionEvent ->{
            try {
                HelloApplication.increaseNumberByDigit("0", displayTotal.getText());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        add.setOnAction(actionEvent ->{
            HelloApplication.plusOrMinus("+", displayTotal.getText());

        });
        minus.setOnAction(actionEvent ->{
            HelloApplication.plusOrMinus("-", displayTotal.getText());

        });
        remove.setOnAction(actionEvent ->{
            HelloApplication.removeNumber(displayTotal.getText());

        });


        HBox row0 = new HBox();
        row0.getChildren().addAll(displayTotal, remove);
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






        numDisplay.getChildren().addAll(row0, row1, row2, row3, row4);



        System.out.println(numDisplay.getChildren());
        return numDisplay;

    }

}
