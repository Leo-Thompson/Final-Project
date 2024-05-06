package com.example.gui_test_2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.paint.*;

import java.io.IOException;
import java.net.URL;
import java.util.*;


public class HelloApplication extends Application {
    public static numInScreen numScreen = new numInScreen();




    @Override
    public void start(Stage stage) throws IOException {



        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1280, 720);
        stage.setTitle("Hello!");


        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }

    public static void changeButtonFont(String id, double size, Scene scene){
        Button toBeChanged = (Button) scene.lookup("#"+id);
        toBeChanged.setFont(new Font(20));
    }


    public void mainScreen(Stage stage) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("List-View.fxml"));


        Scene scene2 = new Scene(fxmlLoader.load(), 1280, 800);
        changeButtonFont("FruitButton", 24, scene2);
        changeButtonFont("VegButton", 24, scene2);
        changeButtonFont("BakeryButton", 24, scene2);
        changeButtonFont("MobileButton", 24, scene2);
        changeButtonFont("ConfectionaryButton", 24, scene2);
        changeButtonFont("OtherButton", 24, scene2);



        stage.setScene(scene2);
        stage.setTitle("main screen");
        stage.show();
    }


    public void secondScreen(Stage stage) throws IOException{



        VBox vbox = new VBox(16); // spacing = 8
        HBox row1 = new HBox(10);
        Label confirmation = new Label("");
        row1.getChildren().addAll(new Button("r1 b1"), new Button("r1, b2"));
        vbox.getChildren().addAll(confirmation, row1, new Button("item1"), new Button("item2"), new Button("item3"));


        int i = 0;
        ArrayList<HBox> testingList = new ArrayList<>();


        while(i <20){
            Item temp = new Item();
            temp.name = String.valueOf(i);
            temp.price = i*3;
            testingList.add((temp.createBox()));
            i ++;
        }

        VBox testingBox = new VBox();

        for(HBox element: testingList){
            testingBox.getChildren().add(element);
        }

        testingBox.setSpacing(10);
        testingBox.setMaxHeight(100);

        ScrollPane listTest = new ScrollPane(testingBox);
        listTest.setVmax(100);




        itemList testItemList = new itemList();
        testItemList.initialiseListWindow(testingBox);





        Scene scene = new Scene(listTest);

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

        totalIn.concat(numIn);


        numScreen.displayTotal.setText(totalIn.concat(numIn));
        System.out.println(totalIn.concat(numIn));

        return(totalIn);



        
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

    public static void removeNumber(String totalIn){

        if (totalIn != "") {
            String modifiedTotal = totalIn.substring(0, totalIn.length() - 1);
            numScreen.displayTotal.setText(modifiedTotal);
        }
    }


    public void numberInput(int numIn) throws IOException{


        Scene inputScene = new Scene(numScreen.keypadDisplay(numIn), 1280, 720);
        Stage numberScreen = new Stage();
        numberScreen.setScene(inputScene);
       // numberScreen.show();
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

