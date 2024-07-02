import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;

public class Sample2 extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override 
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, Color.WHITE);

        stage.setTitle("Test1");
        // Image icon = new Image("icon.png");
        // stage.getIcons().add(icon);
        stage.setWidth(500);
        stage.setHeight(500);
        stage.setResizable(false);
        // stage.setX(50);
        // stage.setY(50);
        // stage.setFullScreen(true);
        // stage.setFullScreenexitHint("press q to escape");
        // stage.setFullScreenExitKeyCombinaation(KeyCombination.valueOf("q"));

        stage.setScene(scene);
        stage.show();
    } 
}