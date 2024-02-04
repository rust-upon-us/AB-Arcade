package ArcadeControllers;

import ArcadeMain.ArcadeApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ThreeInRow extends ArcadeController{
    @FXML
    private Button landing;
    @FXML
    private Label message;

    @FXML
    private void switchToLanding() {
        ArcadeApplication.changeScene(ArcadeApplication.getMainScene(), "Landing");
    }
}
