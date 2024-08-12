import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


public class CircleControl extends Application {
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle = new Circle(40,50,20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLACK);

        Button button1 = new Button("Left");
        Button button2 = new Button("Right");
        Button button3 = new Button("Up");
        Button button4 = new Button("Down");

        HBox hBox = new HBox();
        hBox.getChildren().addAll(button1,button2,button3,button4);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        hBox.setPadding(new Insets(5,5,5,5));

        Pane pane = new Pane();
        pane.getChildren().add(circle);

        button1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double setx = circle.getTranslateX()-10;
                if(setx >= 0){
                    circle.setTranslateX(setx);
                }
            }
        });

        button2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double setx = circle.getTranslateX()+10;
                double x = pane.getWidth()-circle.getRadius()*2;
                if(setx <= x){
                    circle.setTranslateX(setx);
                }
            }
        });

        button3.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double sety = circle.getTranslateY()-10;
                if(sety >= 0){
                    circle.setTranslateY(sety);
                }
            }
        });

        button4.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double sety = circle.getTranslateY()+10;
                double y = pane.getHeight()-circle.getRadius()*2;
                if(sety <= y){
                    circle.setTranslateY(sety);
                }
            }
        });

        BorderPane bpane = new BorderPane();
        bpane.setCenter(pane);
        bpane.setBottom(hBox);

        Scene scene = new Scene(bpane,200,150);
        primaryStage.setTitle("Assignment 5");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
