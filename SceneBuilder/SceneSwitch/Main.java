package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        try {
            // Load FXML file
            Parent root = FXMLLoader.load(new File("Scene1.fxml").toURI().toURL());
            Scene scene = new Scene(root);

            // String css = new File("application.css").toURI().toURL().toExternalForm();
            // scene.getStylesheets().add(css);
            stage.setScene(scene);
            stage.setTitle("SceneSwitch");
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}