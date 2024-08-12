package edu.au;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RadioButtonTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        ToggleGroup group = new ToggleGroup();
        RadioButton button1 = new RadioButton("option 1");
        RadioButton button2 = new RadioButton("option 2");
        RadioButton button3 = new RadioButton("option 3");
        RadioButton button4 = new RadioButton("option 4");

        Button button = new Button("Check");

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                RadioButton selectedRadioButton = (RadioButton) group.getSelectedToggle();
                if(selectedRadioButton != null){
                    System.out.println(selectedRadioButton.getText());
                }
            }
        });

        button1.setToggleGroup(group);
        button2.setToggleGroup(group);
        button3.setToggleGroup(group);
        button4.setToggleGroup(group);

        VBox root = new VBox();
        root.setSpacing(10);
        root.getChildren().addAll(button1,button2,button3,button4, button);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Radio Button Example");
        primaryStage.show();

    }
}
