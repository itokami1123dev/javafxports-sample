package hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {

    @Override
    public void start(Stage primaryStage) {
        VBox root = null;
        try {
            root = FXMLLoader.load(
                    getClass().getResource("/MenuView.fxml")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scene scene = new Scene(root);

        primaryStage.setTitle("SampleApplication");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}