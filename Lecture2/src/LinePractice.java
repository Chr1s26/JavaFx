import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LinePractice extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Line line = new Line();
        line.setStartX(100);
        line.setStartY(150);
        line.setEndX(500);
        line.setEndY(150);

        Group root = new Group();
        root.getChildren().add(line);

        Scene scene = new Scene(root,600,300);
        primaryStage.setTitle("Line");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
