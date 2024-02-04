import ArcadeControllers.LandingController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ArcadeApplication extends Application {

    private static Stage primaryStage;
    private static Scene scene1;
    private static Scene scene2;

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        // Create the main scene for the application "ArcadeLanding"
        scene1 = createScene("scene.fxml", 300, 200);

        // Create the scene for the game mode "Sink the fleet"
        scene2 = createScene("scene.fxml", 300, 200);

        // Check for the possibility of not being able to recover some of the scenes
        if (scene1 != null || scene2 != null){
            // All the scenes were recovered properly proceed with the display of the main window
            primaryStage.setTitle("Two Scene App");
            primaryStage.setScene(scene1);
            primaryStage.show();
        }else {
            // Some error occurred, end of program
            System.out.println("Some of the scenes couldn't be recovered end of program");
        }
    }

    // Method to create new Scene objects from 3 given parameters
    private Scene createScene(String file, int width, int height){
        // Using the parameter file we recover the data contained within it
        Parent content = recoverData(file);
        if(content != null){
            // The content from the file is recovered successfully, so proceed with the creation of the Scene object
            return new Scene(content, width, height);
        }else{
            // Something went wrong and the scene couldn't be recovered for more info check the console's log
            return null;
        }
    }

    // Method to handle the recovery of data contained on a .fxml file
    private Parent recoverData(String file) {
        // First we handle the possible occurrence of errors on execution
        try {
            // Using a regular expression we check that the file given by parameter is an .fxml
            if(file.matches(".*\\.fxml")){
                // Recover create an object to make use of the file given by parameter
                FXMLLoader loader = new FXMLLoader(getClass().getResource(file));
                // Load the data of the file to obtain required information
                Parent root = loader.load();
                // Recover the controller for the file
                LandingController controller = loader.getController();
                // Link the controller to the current implementation of "Application"
                controller.setMain(this);
                // return the data of the file for further usage
                return root;
            }else {
                // The file wasn't a valid one for the execution, so we print a message on the console that indicates this result
                System.out.println("File "+file+" is not a valid *.fxml file check the parameter given to the method \"createScene\"");
                return null;
            }
        } catch (IOException e) {
            // Something went wrong, so we show the information related to said exception to get info useful to fix it for further iterations
            e.printStackTrace();
            return null;
        }
    }

    // Method to switch scenes accessible from any part of our project
    public static void changeScene(Scene scene, String title) {
        // Set the new title to help user keep track of the current window
        primaryStage.setTitle(title);
        // Update the stage for the proper one
        primaryStage.setScene(scene);
    }

    // Methods to give access to the scene's object to the controllers of the different .fxml files
    public static Scene getMainScene(){
        return scene1;
    }
    public static Scene getSecondScene(){
        return scene2;
    }
}