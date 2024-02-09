package com.studies.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.nio.file.Paths;

/**
 * JavaFX App
 */
public class App extends Application {

    @SuppressWarnings("exports")
    @Override
    public void start(Stage primaryStage) {
        try {
            String path = "src/main/java/com/studies/gui/MainView.fxml";
            System.out.println("Diretório de trabalho: " + System.getProperty("user.dir"));
            Parent parent = FXMLLoader.load(Paths.get(path).toUri().toURL());

            Scene mainScene = new Scene(parent);
            primaryStage.setScene(mainScene);
            primaryStage.setTitle("Sample JavaFX application");
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        launch();
    }

}