import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HBOXPractice extends Application {
    public static void main(String[] args) {
        launch(args);

    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Hello");

        TextField textField = new TextField();

        Button playbutton = new Button("Play");
        Button stopbutton = new Button("Stop");

        HBox hBox = new HBox();

        hBox.setSpacing(10);
        hBox.setMargin(textField,new Insets(10,10,10,10));
        hBox.setMargin(playbutton,new Insets(20,20,20,20));
        hBox.setMargin(stopbutton,new Insets(20,20,20,20));

        ObservableList list = hBox.getChildren();

        list.addAll(textField,playbutton,stopbutton);

        Scene scene = new Scene(hBox);
        primaryStage.setScene(scene);

        primaryStage.show();

    }
}
