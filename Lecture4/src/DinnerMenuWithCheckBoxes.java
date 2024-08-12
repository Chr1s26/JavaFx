import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class DinnerMenuWithCheckBoxes extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Text text = new Text("Which items would you like?");
        Text text1 = new Text("Salmon");
        Text text2 = new Text("Lobster");
        Text text3 = new Text("Shrimp");
        Text text4 = new Text("Tuna");

        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Label label4 = new Label();

        Button button = new Button("Submit");

        CheckBox checkBox1 = new CheckBox();
        CheckBox checkBox2 = new CheckBox();
        CheckBox checkBox3 = new CheckBox();
        CheckBox checkBox4 = new CheckBox();

        HBox hBox = new HBox();
        hBox.getChildren().add(button);

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(5,5,5,5));
        gridPane.setHgap(5);
        gridPane.setVgap(5);
        gridPane.add(text,0,0);
        gridPane.add(checkBox1,0,1);
        gridPane.add(text1,1,1);
        gridPane.add(checkBox2,0,2);
        gridPane.add(text2,1,2);
        gridPane.add(checkBox3,0,3);
        gridPane.add(text3,1,3);
        gridPane.add(checkBox4,0,4);
        gridPane.add(text4,1,4);
        gridPane.add(hBox,0,5,2,3);
        gridPane.add(label,0,6,3,4);

        button.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                label.setText("You selected");
                int row = 7;
                int rowspan = 5;
                if(checkBox1.isSelected()){
                    label1.setText("Salmon");
                    gridPane.add(label1,0,row++,3,rowspan++);
                }
                if(checkBox2.isSelected()){
                    label2.setText("Lobster");
                    gridPane.add(label2,0,row++,3,rowspan++);
                }
                if(checkBox3.isSelected()){
                    label3.setText("Shrimp");
                    gridPane.add(label3,0,row++,3,rowspan++);
                }
                if(checkBox4.isSelected()){
                    label4.setText("Tuna");
                    gridPane.add(label4,0,row++,3,rowspan++);
                }

            }
        });


        for (int i = 0; i < 20; i++) {
            RowConstraints rowConstraints = new RowConstraints();
            rowConstraints.setPrefHeight(15);
            gridPane.getRowConstraints().add(rowConstraints);
        }

        for (int i = 0; i < 1; i++) {
            ColumnConstraints colConstraints = new ColumnConstraints();
            colConstraints.setPrefWidth(25);
            gridPane.getColumnConstraints().add(colConstraints);
        }

        Scene scene = new Scene(gridPane,400,300);
        primaryStage.setTitle("Dinner Menu Fish Selection");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
