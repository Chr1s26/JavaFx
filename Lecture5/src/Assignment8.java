package edu.au;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Assignment8 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Assignment 8 - BarChart");
        CategoryAxis xAxis    = new CategoryAxis();
//        xAxis.setLabel("Devices");
        NumberAxis yAxis = new NumberAxis();
//        yAxis.setLabel("Visits");

        BarChart barChart = new BarChart(xAxis, yAxis);

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("CE2104");

        dataSeries1.getData().add(new XYChart.Data("Participation", 5));
        dataSeries1.getData().add(new XYChart.Data("Assignments"  , 10));
        dataSeries1.getData().add(new XYChart.Data("Project"  , 15));
        dataSeries1.getData().add(new XYChart.Data("Midterm"  , 30));
        dataSeries1.getData().add(new XYChart.Data("Final"  , 40));

        barChart.getData().add(dataSeries1);

        VBox vbox = new VBox(barChart);

        Scene scene = new Scene(vbox, 400, 200);

        primaryStage.setScene(scene);
        primaryStage.setHeight(300);
        primaryStage.setWidth(1200);

        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
