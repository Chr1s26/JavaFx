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



public class AlertBox extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("Email");
        Text text1 = new Text("Password");

        TextField textField = new TextField();
        PasswordField passwordField = new PasswordField();

        Button button = new Button("Login");
        Button button1 = new Button("ForgetPassword");

        button.setOnMouseClicked(event -> {
            if(textField.getText().isEmpty()){
                Alert emailAlert = new Alert(Alert.AlertType.ERROR);
                emailAlert.setTitle("Error");
                emailAlert.setHeaderText(null);
                emailAlert.setContentText("Email cannot be empty");
                emailAlert.show();
                return;
            }
            if(passwordField.getText().isEmpty()){
                Alert passwordAlert = new Alert(Alert.AlertType.ERROR);
                passwordAlert.setTitle("Error");
                passwordAlert.setHeaderText(null);
                passwordAlert.setContentText("Password cannot be empty");
                passwordAlert.show();

                return;
            }
            Alert successAlert = new Alert(Alert.AlertType.CONFIRMATION);
            successAlert.setTitle("Success");
            successAlert.setHeaderText(null);
            successAlert.setContentText("Success");
            successAlert.show();

                return;

        });



        GridPane gridPane = new GridPane();
        gridPane.setMinSize(400,200);

        //Gap between box
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        // Padding means the gep between whole box and bound
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setAlignment(Pos.CENTER);

        gridPane.add(text,0,0);
        gridPane.add(textField,1,0);
        gridPane.add(text1,0,1);
        gridPane.add(passwordField,1,1);
        gridPane.add(button,0,2);
        gridPane.add(button1,1,2);

        button.setOnAction(event -> {
            System.out.println(textField.getText());
            System.out.println(passwordField.getText());
        });

        button1.setOnAction(event ->
        {
            textField.setText("");
            passwordField.setText("");
        });

        Scene scene = new Scene(gridPane,400,200);
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}