package test2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();

        Scene scene=new Scene(root, Color.PURPLE);

      Image pic = new Image("download.png");

       stage.getIcons().add(pic);

        stage.setTitle("welcome");
        //stage.setWidth(420);
        //stage.setHeight(420);
        //stage.setResizable(true);
        //stage.setX(55);
        //stage.setY(55);
        //stage.setFullScreen(true);
        //stage.getFullScreenExitHint();
        //stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("s"));

        Text text= new Text();
        text.setText("Here we GOO AgAiN");
        text.setX(50);
        text.setY(50);
        text.setFont(Font.font("Verdana",50));
        text.setFill(Color.LAVENDER);

        Line line=new Line();
        line.setStartX(200);
        line.setStartY(200);
        line.setEndX(500);
        line.setEndY(200);
        line.setStrokeWidth(5);
        line.setStroke(Color.BURLYWOOD);
        line.setOpacity(0.5);
        line.setRotate(45);

        Rectangle rectangle =new Rectangle();
        rectangle.setX(100);
        rectangle.setY(100);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.PINK);
        rectangle.setStroke(Color.BISQUE);
        rectangle.setStrokeWidth(5);

        Polygon triangle=new Polygon();
        triangle.getPoints().setAll(
                200.0,200.0,
                300.0,300.0,
                200.0,300.0
        );
        triangle.setFill(Color.YELLOW);

        Circle circle=new Circle();
        circle.setCenterX(350);
        circle.setCenterY(350);
        circle.setRadius(50);
        circle.setFill(Color.ORANGE);

        ImageView imageView=new ImageView(pic);
        imageView.setX(400);
        imageView.setY(400);

        root.getChildren().add(rectangle);
        root.getChildren().add(text);
        root.getChildren().add(line);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        root.getChildren().add(imageView);

        stage.setScene(scene);
        stage.show();
    }
}
