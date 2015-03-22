package hello;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MenuViewController {
    @FXML
    private Label label;

    @FXML
    private void say(ActionEvent event) {
        label.setText("Hello, JavaFX!");
    }
}
