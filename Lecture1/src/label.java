import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class label extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label = new Label("My Fx Application");
        label.setFont(new Font(40));

        Button button = new Button("Hello");
        Button button1 = new Button("GoodBye");
        Button button2 = new Button("Quit");

        button2.setOnAction(event -> {
            Platform.exit();
        });

        HBox buttonbar = new HBox (20, button, button1, button2);
        buttonbar.setAlignment(Pos.CENTER);

        BorderPane layout1 = new BorderPane();
        layout1.setCenter(label);
        layout1.setBottom(buttonbar);

        Scene scene = new Scene(layout1,450,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX Test");
        primaryStage.show();

    }
    public void init() throws Exception{
        System.out.println("init() has been called ");
    }
    public void stop() throws Exception{
        System.out.println("stop() has just been called ");
    }
}
