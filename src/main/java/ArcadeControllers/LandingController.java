import javafx.fxml.FXML;
import javafx.scene.control.Button;
public class LandingController {

    private ArcadeApplication application;

    @FXML
    private Button nextButton;

    public void setMain(ArcadeApplication main) {
        this.application = main;
    }

    @FXML
    private void switchToScene2() {
        ArcadeApplication.changeScene(ArcadeApplication.getSecondScene(), "x");
    }
}