module com.example.listeners2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.listeners2 to javafx.fxml;
    exports com.example.listeners2;
}