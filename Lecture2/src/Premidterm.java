import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;




public class Premidterm extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("JavaFX Welcome!");
        Button button = new Button("Sign in");


        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);
        pane.setPadding(new Insets(10,10,10,10));
        pane.setMinSize(200,400);
        pane.setAlignment(Pos.CENTER);


        Text text = new Text("Welcome");
        text.setFill(Color.BLACK);
        text.setFont(new Font(20));
        Text text1 = new Text("User Name :");
        Text text2 = new Text("Password :");
        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();

//        ColumnConstraints colConstraints = new ColumnConstraints();
//        colConstraints.setPrefWidth(100);
//        pane.getColumnConstraints().add(colConstraints);
        pane.add(text,1,0,2,1);
        pane.add(text1,1,1);
        pane.add(text2,1,2);
        pane.add(textField,2,1);
        pane.add(passwordField,2,2);
        pane.add(button,2,3);
        GridPane.setHalignment(button,HPos.RIGHT);



        GridPane.setHalignment(text,HPos.LEFT);




        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {

                if (textField.getText().contentEquals("javaapp") && passwordField.getText().contentEquals("javafx")){
                    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                    alert.setTitle("CONFIRMATION");
                    alert.setHeaderText(null);
                    alert.setContentText("Your Password is correct");
                    alert.show();
                    return;
                }
                else {
                    Alert alert1 = new Alert(Alert.AlertType.ERROR);
                    alert1.setTitle("Error");
                    alert1.setHeaderText("Invalid");
                    alert1.setContentText("Password is Wrong!");
                    alert1.show();
                    return;

                }
            }
        });

        Scene scene = new Scene(pane,400,300);
        primaryStage.setScene(scene);
        primaryStage.show();




    }

}
