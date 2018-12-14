import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class BarChar extends Application {
    final static String austria = "BTHS";
    final static String brazil = "Stuyvesant";
    final static String france = "Staten Island Tech";
    final static String italy = "Queens Science";
    final static String usa = "Bronx Science";

    @Override public void start(Stage stage) {
        stage.setTitle("Bar Chart Sample");
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        final BarChart<String,Number> bc =
                new BarChart<String,Number>(xAxis,yAxis);
        bc.setTitle("School SAT");
        xAxis.setLabel("School");
        yAxis.setLabel("Score");

        XYChart.Series series1 = new XYChart.Series();
        series1.setName("2003");
        series1.getData().add(new XYChart.Data(austria, 659));
        series1.getData().add(new XYChart.Data(brazil, 735));
        series1.getData().add(new XYChart.Data(france, 682));
        series1.getData().add(new XYChart.Data(italy, 660));
        series1.getData().add(new XYChart.Data(usa, 688));

        XYChart.Series series2 = new XYChart.Series();
        series2.setName("2004");
        series2.getData().add(new XYChart.Data(austria, 659));
        series2.getData().add(new XYChart.Data(brazil, 735));
        series2.getData().add(new XYChart.Data(france, 682));
        series2.getData().add(new XYChart.Data(italy, 660));
        series2.getData().add(new XYChart.Data(usa, 688));

        XYChart.Series series3 = new XYChart.Series();
        series3.setName("2005");
        series3.getData().add(new XYChart.Data(austria, 659));
        series3.getData().add(new XYChart.Data(brazil, 735));
        series3.getData().add(new XYChart.Data(france, 682));
        series3.getData().add(new XYChart.Data(italy, 660));
        series3.getData().add(new XYChart.Data(usa, 688));

        Scene scene  = new Scene(bc,800,600);
        bc.getData().addAll(series1, series2, series3);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
