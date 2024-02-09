package com.studies.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene mainScene;

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) {
        try {
            String path = "src/main/java/com/studies/gui/MainView.fxml";
            ScrollPane scrollPane = FXMLLoader.load(Paths.get(path).toUri().toURL());
            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);


            mainScene = new Scene(scrollPane);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Sample JavaFX application");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("exports")
    public static Scene getMainScene() {
        return mainScene;
    }


    public static void main(String[] args) {
        launch();
    }

}