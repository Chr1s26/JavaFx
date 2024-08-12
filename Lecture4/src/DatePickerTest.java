package edu.au;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class DatePickerTest extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        DatePicker datePicker = new DatePicker();
        Button button = new Button("Read Date");

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("Date = " + datePicker.getValue());
            }
        });

        HBox hbox = new HBox(datePicker, button);
        hbox.setSpacing(5);

        Scene scene = new Scene(hbox,300, 240);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Date Picker");
        primaryStage.show();
    }
}
