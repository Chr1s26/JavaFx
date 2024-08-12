import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class DrawingLine extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Line line = new Line();

        line.setStartX(100.0);
        line.setStartY(150.0);
        line.setEndX(500.0);
        line.setEndY(150.0);

        Group root = new Group(line);

        Scene scene = new Scene(root,600,300);
        primaryStage.setTitle("Sample app");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
