module com.example.abarcade {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.abarcade to javafx.fxml;
    exports com.example.abarcade;
}