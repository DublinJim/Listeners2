package com.example.listeners2;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    public Stage myStage;

    public static void main(String[] args) {
        launch();
    }

public void getNum(){
    int num=39;
    System.out.println(num);
}
    public Stage getMyStage() {
        return myStage;
    }

    public void whatTheFuck() {
        System.out.println("WTF");

    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        primaryStage.setTitle("Hello!");
        primaryStage.setScene(scene);
        primaryStage.show();
        myStage = primaryStage;

    }


}

