package com.soft1841.sm.utils;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/behind.fxml"));
        primaryStage.setTitle("超市收银系统");
        primaryStage.setScene(new Scene(root, 850, 600));
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
