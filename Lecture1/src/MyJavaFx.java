import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.awt.*;

public class MyJavaFx extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("Click Me !");
        Scene scene = new Scene(button,200, 250);
        primaryStage.setTitle("My JavaFx");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
