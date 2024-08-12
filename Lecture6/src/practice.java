import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class practice extends Application {

    private static final int NUM_THREADS = 5;

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Label titleLabel = new Label("File Download Simulation");
        titleLabel.setStyle("-fx-font-size: 18px; -fx-font-weight: bold;");

        Button startButton = new Button("Start Downloads");

        root.getChildren().addAll(titleLabel, startButton);

        startButton.setOnAction(event -> {
            for (int i = 1; i <= NUM_THREADS; i++) {
                DownloadThread downloadThread = new DownloadThread(i);
                downloadThread.start();
            }
        });

        Scene scene = new Scene(root, 300, 200);
        primaryStage.setTitle("File Download App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private static class DownloadThread extends Thread {
        private int threadId;

        public DownloadThread(int threadId) {
            this.threadId = threadId;
        }

        @Override
        public void run() {
            System.out.println("Thread " + threadId + ": Downloading file...");
            try {
                // Simulate file download by sleeping for a random duration
                long downloadTime = (long) (Math.random() * 5000) + 1000;
                Thread.sleep(downloadTime);
                System.out.println("Thread " + threadId + ": File download complete.");
            } catch (InterruptedException e) {
                System.out.println("Thread " + threadId + ": Download interrupted.");
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

