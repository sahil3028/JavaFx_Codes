package test2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Group root = new Group();

        Scene scene=new Scene(root, Color.BISQUE);

      Image pic = new Image("download.png");
       stage.getIcons().add(pic);

        stage.setTitle("welcome");
        stage.setScene(scene);
        stage.show();
    }
}
