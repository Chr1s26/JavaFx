import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class AUDILOGO extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Chris future car");

        Pane pane = new Pane();

        Circle circle = new Circle();
        circle.setCenterX(100);
        circle.setCenterY(100);
        circle.setFill(null);
        circle.setStroke(Color.BLACK);
        circle.setRadius(50);
//        circle.centerXProperty().bind(circle.radiusProperty().add(100));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.centerXProperty().bind(pane.widthProperty().divide(2));

        Circle circle1 = new Circle();
        circle1.setCenterX(170);
        circle1.setCenterY(100);
        circle1.setFill(null);
        circle1.setStroke(Color.BLACK);
        circle1.setRadius(50);
        circle1.centerXProperty().bind(circle1.radiusProperty().add(170));
        circle1.centerYProperty().bind(pane.heightProperty().divide(2));
        circle1.centerXProperty().bind(pane.widthProperty().divide(2.19));


        Circle circle2 = new Circle();
        circle2.setCenterX(240);
        circle2.setCenterY(100);
        circle2.setFill(null);
        circle2.setStroke(Color.BLACK);
        circle2.setRadius(50);
//        circle2.centerXProperty().bind(circle2.radiusProperty().add(240));
        circle2.centerYProperty().bind(pane.heightProperty().divide(2));
        circle2.centerXProperty().bind(pane.widthProperty().divide(2.39));


        Circle circle3 = new Circle();
        circle3.setCenterX(310);
        circle3.setCenterY(100);
        circle3.setFill(null);
        circle3.setStroke(Color.BLACK);
        circle3.setRadius(50);
//        circle3.centerXProperty().bind(circle3.radiusProperty().add(310));
        circle3.centerYProperty().bind(pane.heightProperty().divide(2));
        circle3.centerXProperty().bind(pane.widthProperty().divide(2.59));


        pane.getChildren().addAll(circle,circle1,circle2,circle3);

        Scene scene = new Scene(pane,400,500);



        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
