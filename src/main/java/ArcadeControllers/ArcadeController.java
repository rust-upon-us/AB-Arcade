package ArcadeControllers;

import ArcadeMain.ArcadeApplication;
import javafx.scene.control.Button;

public class ArcadeController {
    protected ArcadeApplication application;
    protected final String focus = "-fx-background-color: lightblue;";
    protected final String player = "-fx-background-color: green;";
    protected final String npc = "-fx-background-color: red;";
    protected final String miss = "-fx-background-color: lightblue;";
    protected final String hit = "-fx-background-color: red;";
    protected final String none = "";

    public void setMain(ArcadeApplication main) {
        this.application = main;
    }
    protected void itemHighlight(Button item, String style){
        // Requested the change of an element style
        item.setStyle(style);
    }
}
