import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VboxPractice extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Vbox Display");

        TextField textField = new TextField();
        Button playbutton = new Button("Play");
        Button stopbutton = new Button("Stop");

        VBox vBox = new VBox();
        vBox.setSpacing(10);
        VBox.setMargin(textField,new Insets(20,20,20,20));
        VBox.setMargin(playbutton,new Insets(20,20,20,20));
        VBox.setMargin(stopbutton,new Insets(20,20,20,20));


        vBox.getChildren().addAll(textField,playbutton,stopbutton);

//        ObservableList list = vBox.getChildren();
//        list.addAll(textField,playbutton,stopbutton);

        Scene scene = new Scene(vBox);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
