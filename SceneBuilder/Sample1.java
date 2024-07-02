import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;



public class Sample1 extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override 
    public void start(Stage stage) throws Exception {

        Group root = new Group();
        Scene scene = new Scene(root, 500, 500, Color.LIGHTSKYBLUE);

        Text text = new Text();
        text.setText("add numbers here:");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("verdana", 50));
        text.setFill(Color.LIMEGREEN);

        Line line = new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.RED);
        // line.setOpacity(0.5);
        // line.setRotate(45);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.BLUE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(5);
        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
            200.0, 200.0, 
            300.0, 300.0, 
            200.0, 300.0
            );
        triangle.setFill(Color.YELLOW);

        Circle circle = new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        // Image image = new Image("icon.png");
        // ImageView imageView = new ImageView(image);
        // imageView.setX(400);
        // imageView.setY(400);

        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        // root.getChildren().add(imageView);
        stage.setScene(scene);
        stage.show();
    } 
}