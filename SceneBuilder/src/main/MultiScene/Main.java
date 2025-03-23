package MultiScene;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
            Parent root= FXMLLoader.load(getClass().getResource("/MultiScene/Scene1.fxml"));

        Scene scene= new Scene(root);

        Image pic = new Image("download.png");
        stage.getIcons().add(pic);

        stage.setTitle("Crazyyy ShaPESSSS");

        stage.setScene(scene);
        stage.show();
    }
}
