package hello;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class SimplePort extends Application {

    @Override
    public void start(Stage primaryStage) {

//        Label answer = new Label("Hello World!");
//
//        StackPane root = new StackPane();
//        root.getChildren().addAll(answer);


        VBox root = null;
        try {
            root = FXMLLoader.load(
                    getClass().getResource("/sample.fxml")
            );
        } catch (IOException e) {
            e.printStackTrace();
        }


//        Scene scene = new Scene(root, 300, 250);
        Scene scene = new Scene(root);

        primaryStage.setTitle("JavaFX Porting Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}