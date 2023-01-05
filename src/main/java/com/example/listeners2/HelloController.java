package com.example.listeners2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
public HelloApplication helloApplication = new HelloApplication();
public Stage hStage;
    public CheckBox chkbx1;
    public Button btn1;
    public Text txt1;
    public AnchorPane RootPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        chkbx1.selectedProperty().addListener(new ChangeListener<Boolean>() {
            @Override
            public void changed(ObservableValue<? extends Boolean> observableValue, Boolean aBoolean, Boolean t1) {
                txt1.setText(String.valueOf(chkbx1.isSelected()));

                Stage stage = (Stage) RootPane.getScene().getWindow();
                stage.setAlwaysOnTop(chkbx1.isSelected());
            }
        });
        txt1.setText("Ready");

    }
}