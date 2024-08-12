package edu.au;

import javafx.animation.PathTransition;
import javafx.application.Application;
import javafx.geometry.HorizontalDirection;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CheckBoxTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Label l = new Label("What do you listen:     ");
        CheckBox c1 = new CheckBox("Radio one");
        CheckBox c2 = new CheckBox("Radio cool");
        CheckBox c3 = new CheckBox("Red FM");
        CheckBox c4 = new CheckBox("FM GOLD");
        HBox root = new HBox();
        root.getChildren().addAll(l,c1,c2,c3,c4);
        root.setSpacing(5);

        Scene scene = new Scene(root, 800, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Checkbox Example");
        primaryStage.show();
    }
}
