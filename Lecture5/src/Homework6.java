import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Homework6 extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        RadioButton redbut = new RadioButton("red");
        RadioButton yellowbut = new RadioButton("Yellow");
        RadioButton blackbut = new RadioButton("Black");
        RadioButton orangebut = new RadioButton("Orange");
        RadioButton greenbut = new RadioButton("Green");

        ToggleGroup tg = new ToggleGroup();
        redbut.setToggleGroup(tg);
        yellowbut.setToggleGroup(tg);
        blackbut.setToggleGroup(tg);
        orangebut.setToggleGroup(tg);
        greenbut.setToggleGroup(tg);
        blackbut.setSelected(true);

        Text text = new Text(20,40,"Programming is fun");
        text.setFont(new Font("Times",20));
        Pane pane = new Pane();
        pane.getChildren().add(text);

        Button leftbut = new Button("<=");
        Button rigtbut = new Button("=>");

        HBox hBox = new HBox();
        hBox.setSpacing(5);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(redbut,yellowbut,blackbut,orangebut,greenbut);

        HBox hbox1 = new HBox();
        hbox1.setAlignment(Pos.CENTER);
        hbox1.getChildren().addAll(leftbut,rigtbut);

        BorderPane bpane = new BorderPane();
        bpane.setTop(hBox);
        bpane.setBottom(hbox1);
        bpane.setCenter(pane);

        blackbut.setOnAction(event -> text.setStroke(Color.BLACK));
        redbut.setOnAction(event -> text.setStroke(Color.RED));
        orangebut.setOnAction(event -> text.setStroke(Color.ORANGE));
        yellowbut.setOnAction(event -> text.setStroke(Color.YELLOW));
        greenbut.setOnAction(event -> text.setStroke(Color.GREEN));

        leftbut.setOnAction(event -> text.setX(text.getX()-10));
        rigtbut.setOnAction(event -> text.setX(text.getX()+10));



        Scene scene= new Scene(bpane,500,150);
        primaryStage.setTitle("Assignment 6");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
