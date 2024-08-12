//import javafx.application.Application;
//import javafx.scene.Scene;
//import javafx.scene.layout.Pane;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.stage.Stage;
//
//public class Hello extends Application {
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        primaryStage.setTitle("Chris future car");
//
//        Pane pane = new Pane();
//
//        Circle circle = createCircle(1);
//        Circle circle1 = createCircle(2.3);
//        Circle circle2 = createCircle(2.4);
//        Circle circle3 = createCircle(2.6);
//
//        pane.getChildren().addAll(circle, circle1, circle2, circle3);
//
//        Scene scene = new Scene(pane, 400, 500);
//
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    private Circle createCircle(double centerXFactor) {
//        Circle circle = new Circle();
//        circle.setFill(null);
//        circle.setStroke(Color.BLACK);
//        circle.setRadius(50);
//
//        Scene pane;
//        circle.centerXProperty().bind(pane.widthProperty().divide(centerXFactor));
//        circle.centerYProperty().bind(pane.heightProperty().divide(2));
//
//        return circle;
//    }
//}