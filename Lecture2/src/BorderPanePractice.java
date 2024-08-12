import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPanePractice extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane bpane = new BorderPane();
        bpane.setTop(new TextField("Top"));
        bpane.setBottom(new TextField("Bottom"));
        bpane.setCenter(new TextField("Center"));
        bpane.setLeft(new TextField("Left"));
        bpane.setRight(new TextField("Right"));

        Scene scene = new Scene(bpane);
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
