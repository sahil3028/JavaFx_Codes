package MultiScene;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    //switch scenes
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/MultiScene/Scene1.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/MultiScene/Scene2.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    //toggle between shapes



//controling shape movment
    @FXML
    private Circle circle;
    private double x;
    private double y;

    public void up(ActionEvent e) {
        System.out.println("up");
        circle.setCenterY(y-=10);
    }
    public void down(ActionEvent e) {
        System.out.println("down");
        circle.setCenterY(y+=10);
    }
    public void left(ActionEvent e) {
        System.out.println("left");
        circle.setCenterX(y-=10);
    }
    public void right(ActionEvent e) {
        System.out.println("right");
        circle.setCenterX(y+=10);
    }
    public void upLeft(ActionEvent e){
        circle.setCenterX(y-=10);
        circle.setCenterY(y-=10);
    }




}
