module ArcadeMain {
    requires javafx.controls;
    requires javafx.fxml;


    opens ArcadeMain to javafx.fxml;
    opens ArcadeControllers to javafx.fxml;
    exports ArcadeMain;
    exports ArcadeGlobal;
    exports ArcadeControllers;
}