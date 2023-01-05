package com.example.listeners2;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    public CheckBox chkbx1;
    public Button btn1;
    public Text txt1;
    public AnchorPane RootPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        chkbx1.selectedProperty().addListener((observableValue, aBoolean, t1) -> {
            txt1.setText(String.valueOf(chkbx1.isSelected()));

            Stage stage = (Stage) RootPane.getScene().getWindow();
            stage.setAlwaysOnTop(chkbx1.isSelected());
        });
        txt1.setText("Ready");

    }
}