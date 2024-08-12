import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MidtermExam extends Application {

    TextField textField = new TextField();
    TextField textField1 = new TextField();
    TextField textField2 = new TextField();



    public static void main(String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        primaryStage.setTitle("Midterm");
        Text text = new Text("Number 1:");
        Text text1 = new Text("Number 2:");
        Text text2 = new Text("Result :");


        textField.setPrefColumnCount(5);
        textField1.setPrefColumnCount(5);
        textField2.setPrefColumnCount(5);
        textField2.setEditable(false);


        Button button = new Button("Add");
        Button button1 = new Button("Subtract");
        Button button2 = new Button("Multiply");
        Button button3 = new Button("Divide");

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.BOTTOM_CENTER);
        hBox.getChildren().addAll(button,button1,button2,button3);


      FlowPane pane = new FlowPane();
      pane.setPadding(new Insets(1));
      pane.setHgap(5);
      pane.setVgap(5);
      pane.setOrientation(Orientation.HORIZONTAL);
      pane.setAlignment(Pos.CENTER);
      pane.getChildren().addAll(text,textField,text1,textField1,text2,textField2);

        BorderPane bpane = new BorderPane();
        bpane.setCenter(pane);
        bpane.setBottom(hBox);
        

            button.setOnMouseClicked(event -> {
                if(textField.getText().isEmpty()){
                    Alert emailAlert = new Alert(Alert.AlertType.ERROR);
                    emailAlert.setTitle("Error");
                    emailAlert.setHeaderText(null);
                    emailAlert.setContentText("Number is invalid");
                    emailAlert.show();}
                else{
                add();}
            });
        button1.setOnMouseClicked(event -> {
            if(textField.getText().isEmpty()){
                Alert emailAlert = new Alert(Alert.AlertType.ERROR);
                emailAlert.setTitle("Error");
                emailAlert.setHeaderText(null);
                emailAlert.setContentText("Number is invalid");
                emailAlert.show();}
            else{
            subtract();}
        });
        button2.setOnMouseClicked(event -> {
            if(textField.getText().isEmpty()){
                Alert emailAlert = new Alert(Alert.AlertType.ERROR);
                emailAlert.setTitle("Error");
                emailAlert.setHeaderText(null);
                emailAlert.setContentText("number is invalid");
                emailAlert.show();}
            else{
            multiply();}
        });
        button3.setOnMouseClicked(event -> {
            if(textField.getText().isEmpty()){
                Alert emailAlert = new Alert(Alert.AlertType.ERROR);
                emailAlert.setTitle("Error");
                emailAlert.setHeaderText(null);
                emailAlert.setContentText("Number is invalid");
                emailAlert.show();}
            else{
            divide();}
        });


        Scene scene = new Scene(bpane,450,200);
        primaryStage.setScene(scene);
        primaryStage.show();





    }

    private void add() {
        // Get values from text fields
        double number = Double.parseDouble(textField.getText());
        double number1 = Double.parseDouble(textField1.getText());

        MidtermOOP midtermOOP = new MidtermOOP(number,number1);

        // Display monthly payment and total payment
        textField2.setText(String.format("%.2f",midtermOOP.addition()));

    }

    private void subtract() {
        // Get values from text fields
        double number = Double.parseDouble(textField.getText());
        double number1 = Double.parseDouble(textField1.getText());

        MidtermOOP midtermOOP = new MidtermOOP(number,number1);

        // Display monthly payment and total payment
        textField2.setText(String.format("%.2f",midtermOOP.subtract()));

    }

    private void multiply() {
        // Get values from text fields
        double number = Double.parseDouble(textField.getText());
        double number1 = Double.parseDouble(textField1.getText());

        MidtermOOP midtermOOP = new MidtermOOP(number,number1);

        // Display monthly payment and total payment
        textField2.setText(String.format("%.2f",midtermOOP.multiply()));

    }

    private void divide() {
        // Get values from text fields
        double number = Double.parseDouble(textField.getText());
        double number1 = Double.parseDouble(textField1.getText());

        MidtermOOP midtermOOP = new MidtermOOP(number,number1);

        // Display monthly payment and total payment
        textField2.setText(String.format("%.2f",midtermOOP.divide()));

    }

}


