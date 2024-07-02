import java.io.File;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Sample3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        try {
            // Load FXML file
           Parent root = FXMLLoader.load(new File("Main.fxml").toURI().toURL());


            // Set up scene
            Scene scene = new Scene(root);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Sample3 Application");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
