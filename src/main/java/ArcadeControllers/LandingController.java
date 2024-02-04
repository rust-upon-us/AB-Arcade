package ArcadeControllers;

import ArcadeMain.ArcadeApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class LandingController extends ArcadeController{

    @FXML
    private Button sinkTheFleet;
    @FXML
    private Button threeInRow;
    @FXML
    private Button exit;

    @FXML
    private void switchToScene2() {
        ArcadeApplication.changeScene(ArcadeApplication.getSecondScene(), "sink the fleet");
    }
    @FXML
    private void switchToScene3() {
        ArcadeApplication.changeScene(ArcadeApplication.getThirdScene(), "three in row");
    }
    @FXML
    private void programEnd() {
        Platform.exit();
    }
}