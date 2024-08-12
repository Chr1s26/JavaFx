package edu.au;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginPage_Inner extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        //creating label email
        Text text1 = new Text("Email");
        //creating label password
        Text text2 = new Text("Password");
        //creating text field for email
        TextField textField1 = new TextField();
        //creating text field for password
        PasswordField textField2 = new PasswordField();
        //creating buttons
        Button button1 = new Button("Submit");
        Button button2 = new Button("Clear");
        //creating a Grid Pane
        GridPane gridPane = new GridPane();
        //setting size for the pane
        gridPane.setMinSize(400,200);
        //setting the padding
        gridPane.setPadding(new Insets(10,10,10,10));
        //setting vertical and horizontal gaps between the columns
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        //setting the grid alignment
        gridPane.setAlignment(Pos.CENTER);
        //arranging all the nodes in the grid
        gridPane.add(text1, 0, 0);
        gridPane.add(textField1, 1, 0);
        gridPane.add(text2, 0, 1);
        gridPane.add(textField2, 1, 1);
        gridPane.add(button1, 0,2);
        gridPane.add(button2, 1, 2);

        button1.setOnAction(new SubmitHandler());

        //creating a scene object
        Scene scene = new Scene(gridPane);
        primaryStage.setTitle("Login Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    class SubmitHandler implements EventHandler<ActionEvent> {
        @Override // Override the handle method
        public void handle(ActionEvent e) {
            System.out.println("Submit button has been clicked");
        }
    }
}
