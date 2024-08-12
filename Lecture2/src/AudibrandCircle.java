import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AudibrandCircle extends Application {
    public static void main(String[] args) {
    launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle();
        circle.setRadius(50);
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setStroke(Color.BLACK);
        circle.setFill(null);

        Circle circle1 = new Circle();
        circle1.setRadius(50);
        circle1.setCenterX(170);
        circle1.setCenterY(100);
        circle1.setStroke(Color.BLACK);
        circle1.setFill(null);

        Circle circle2 = new Circle();
        circle2.setRadius(50);
        circle2.setCenterX(240);
        circle2.setCenterY(100);
        circle2.setStroke(Color.BLACK);
        circle2.setFill(null);

        Circle circle3 = new Circle();
        circle3.setRadius(50);
        circle3.setCenterX(310);
        circle3.setCenterY(100);
        circle3.setStroke(Color.BLACK);
        circle3.setFill(null);

        Pane pane = new Pane();
        pane.getChildren().addAll(circle,circle1,circle2,circle3);


        Scene scene = new Scene(pane,200,200);
        primaryStage.setTitle("AUDI LOGO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
