import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.text.Text;

import java.awt.*;

public class DisplayingText extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text();
        text.setFont(new Font(45));
        text.setX(50);
        text.setY(150);
        text.setText("Welcome to Class");

        Label label = new Label("Hello world");

        Group root = new Group();
        ObservableList list = root.getChildren();
        list.add(text);

        Scene scene = new Scene(root,700,300);
        primaryStage.setTitle("Simple Application");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
