package com.example.gui_test_2;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.scene.control.ScrollPane;

public class itemList extends ScrollPane{

    static ScrollPane listContainer = new ScrollPane();
    public static void initialiseListWindow(Node scrollContent){
        listContainer.setContent(scrollContent);
    }


}
