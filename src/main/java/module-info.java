module com.example.gui_test_2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;

    opens com.example.gui_test_2 to javafx.fxml;
    exports com.example.gui_test_2;
}