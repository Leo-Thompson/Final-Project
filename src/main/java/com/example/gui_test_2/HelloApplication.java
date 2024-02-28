package com.example.gui_test_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;



public class HelloApplication extends Application {
    public static numInScreen numScreen = new numInScreen();



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Hello!");


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }


    public void secondScreen(Stage stage) throws IOException{
        VBox vbox = new VBox(16); // spacing = 8
        HBox row1 = new HBox(10);
        Label confirmation = new Label("");
        row1.getChildren().addAll(new Button("r1 b1"), new Button("r1, b2"));
        vbox.getChildren().addAll(confirmation, row1, new Button("item1"), new Button("item2"), new Button("item3"));
        Scene scene = new Scene(vbox, 1280, 720);
        stage.setTitle("second screen test");
        EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
            public void handle(ActionEvent ALL)

            {
                confirmation.setText("button selected    ");
            }
        };
        stage.setScene(scene);
        stage.show();


    }

    public static String increaseNumberByDigit(String numIn, String totalIn) throws IOException {
        if (numIn != ""){
            totalIn.concat(numIn);


            numScreen.displayTotal.setText(totalIn.concat(numIn));
            System.out.println(totalIn.concat(numIn));

            return(totalIn);

        }

        return totalIn;
    }

    public static void plusOrMinus(String typeIn, String totalIn){
        int numberIn = Integer.valueOf(totalIn);
        if (typeIn == "-"){
            numberIn -= 1;
        }
        else {
            numberIn += 1;
        }
        numScreen.displayTotal.setText(String.valueOf(numberIn));
    }


    public void numberInput(int numIn) throws IOException{


        Scene inputScene = new Scene(numScreen.keypadDisplay(numIn), 1280, 720);
        Stage numberScreen = new Stage();
        numberScreen.setScene(inputScene);
        numberScreen.show();
    }

    public void displayNumPad() throws IOException{

    }

    public void itemScreen(Item item, int itemNumber) throws IOException{
        String displayNumber = String.valueOf(itemNumber);
        Label name = new Label(item.name);
        Label itemTotal = new Label(displayNumber);
        float totalPrice = item.price * itemNumber;
        String newPrice = String.valueOf(totalPrice);
        Label displayPrice = new Label(newPrice);

        HBox hbox = new HBox(name, itemTotal, displayPrice);
    }

    public void buttonPressConfirmation(){
        /**/
    }
}

