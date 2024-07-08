package MultiScene.Scene.Chart;

import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.TextField;

public class ChartController {
    @FXML
    private LineChart<String, Number> lineChart;
    @FXML
    private TextField pemasukan;
    @FXML
    private TextField profit;
    @FXML
    private BarChart<String, Number> item;
    @FXML
    private BarChart<String, Number> customer;
    @FXML
    private TextField makanan;
    @FXML
    private TextField minuman;

    @FXML
    public void initialize() {
        // Initial data setup for testing
        pemasukan.setText("1000000");
        profit.setText("500000");
        updateBarChart1Day();
        makanan.setText("Nasi Goreng");
        minuman.setText("Teh Manis");
    }

    @FXML
    private void updateBarChart1Day() {
        // Clear existing data
        item.getData().clear();
        customer.getData().clear();
        lineChart.getData().clear();

        // Create and populate the item bar chart series
        XYChart.Series<String, Number> itemSeries = new XYChart.Series<>();
        itemSeries.setName("Pendapatan Harian - 1 Day");

        itemSeries.getData().add(new XYChart.Data<>("08:00", 2));
        itemSeries.getData().add(new XYChart.Data<>("10:00", 4));
        itemSeries.getData().add(new XYChart.Data<>("12:00", 3));
        itemSeries.getData().add(new XYChart.Data<>("14:00", 7));
        itemSeries.getData().add(new XYChart.Data<>("16:00", 8));
        itemSeries.getData().add(new XYChart.Data<>("18:00", 1));

        item.getData().add(itemSeries);

        // Create and populate the customer bar chart series
        XYChart.Series<String, Number> customerSeries = new XYChart.Series<>();
        customerSeries.setName("Aktivitas Pelanggan - 1 Day");

        customerSeries.getData().add(new XYChart.Data<>("08:00", 5));
        customerSeries.getData().add(new XYChart.Data<>("10:00", 7));
        customerSeries.getData().add(new XYChart.Data<>("12:00", 6));
        customerSeries.getData().add(new XYChart.Data<>("14:00", 9));
        customerSeries.getData().add(new XYChart.Data<>("16:00", 1));
        customerSeries.getData().add(new XYChart.Data<>("18:00", 1));

        customer.getData().add(customerSeries);

        // Create and populate the line chart series
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Pendapatan Harian");

        lineSeries.getData().add(new XYChart.Data<>("08:00", 2));
        lineSeries.getData().add(new XYChart.Data<>("10:00", 4));
        lineSeries.getData().add(new XYChart.Data<>("12:00", 3));
        lineSeries.getData().add(new XYChart.Data<>("14:00", 7));
        lineSeries.getData().add(new XYChart.Data<>("16:00", 8));
        lineSeries.getData().add(new XYChart.Data<>("18:00", 1));

        lineChart.getData().add(lineSeries);
    }



    

    @FXML
    private void updateBarChart3Days() {
        item.getData().clear();
        customer.getData().clear();
        lineChart.getData().clear();
    
        XYChart.Series<String, Number> itemSeries = new XYChart.Series<>();
        itemSeries.setName("Pendapatan Harian - 3 Days");
    
        itemSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        itemSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        itemSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        item.getData().add(itemSeries);
    
        XYChart.Series<String, Number> customerSeries = new XYChart.Series<>();
        customerSeries.setName("Aktivitas Pelanggan - 3 Days");
    
        customerSeries.getData().add(new XYChart.Data<>("Day 1", 150));
        customerSeries.getData().add(new XYChart.Data<>("Day 2", 170));
        customerSeries.getData().add(new XYChart.Data<>("Day 3", 160));
    
        customer.getData().add(customerSeries);
    
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Pendapatan Harian");
    
        lineSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        lineSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        lineSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        lineChart.getData().add(lineSeries);
    }




    

    @FXML
    private void updateBarChart1Week() {
       item.getData().clear();
        customer.getData().clear();
        lineChart.getData().clear();
    
        XYChart.Series<String, Number> itemSeries = new XYChart.Series<>();
        itemSeries.setName("Pendapatan Harian - 1 Week");
    
        itemSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        itemSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        itemSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        item.getData().add(itemSeries);
    
        XYChart.Series<String, Number> customerSeries = new XYChart.Series<>();
        customerSeries.setName("Aktivitas Pelanggan - 1 Week");
    
        customerSeries.getData().add(new XYChart.Data<>("Day 1", 150));
        customerSeries.getData().add(new XYChart.Data<>("Day 2", 170));
        customerSeries.getData().add(new XYChart.Data<>("Day 3", 160));
    
        customer.getData().add(customerSeries);
    
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Pendapatan Harian");
    
        lineSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        lineSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        lineSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        lineChart.getData().add(lineSeries);
    }




    @FXML
    private void updateBarChart1Month() {
        item.getData().clear();
        customer.getData().clear();
        lineChart.getData().clear();
    
        XYChart.Series<String, Number> itemSeries = new XYChart.Series<>();
        itemSeries.setName("Pendapatan Harian - 1 Month");
    
        itemSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        itemSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        itemSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        item.getData().add(itemSeries);
    
        XYChart.Series<String, Number> customerSeries = new XYChart.Series<>();
        customerSeries.setName("Aktivitas Pelanggan - 1 Month");
    
        customerSeries.getData().add(new XYChart.Data<>("Day 1", 150));
        customerSeries.getData().add(new XYChart.Data<>("Day 2", 170));
        customerSeries.getData().add(new XYChart.Data<>("Day 3", 160));
    
        customer.getData().add(customerSeries);
    
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Pendapatan Harian");
    
        lineSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        lineSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        lineSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        lineChart.getData().add(lineSeries);
    }






    @FXML
    private void updateBarChart6Months() {
        item.getData().clear();
        customer.getData().clear();
        lineChart.getData().clear();
    
        XYChart.Series<String, Number> itemSeries = new XYChart.Series<>();
        itemSeries.setName("Pendapatan Harian - 6 Month");
    
        itemSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        itemSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        itemSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        item.getData().add(itemSeries);
    
        XYChart.Series<String, Number> customerSeries = new XYChart.Series<>();
        customerSeries.setName("Aktivitas Pelanggan - 6 Month");
    
        customerSeries.getData().add(new XYChart.Data<>("Day 1", 150));
        customerSeries.getData().add(new XYChart.Data<>("Day 2", 170));
        customerSeries.getData().add(new XYChart.Data<>("Day 3", 160));
    
        customer.getData().add(customerSeries);
    
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Pendapatan Harian");
    
        lineSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        lineSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        lineSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        lineChart.getData().add(lineSeries);
    }






    @FXML
    private void updateBarChart1Year() {
        item.getData().clear();
        customer.getData().clear();
        lineChart.getData().clear();
    
        XYChart.Series<String, Number> itemSeries = new XYChart.Series<>();
        itemSeries.setName("Pendapatan Harian - 1 Year");
    
        itemSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        itemSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        itemSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        item.getData().add(itemSeries);
    
        XYChart.Series<String, Number> customerSeries = new XYChart.Series<>();
        customerSeries.setName("Aktivitas Pelanggan - 1 year");
    
        customerSeries.getData().add(new XYChart.Data<>("Day 1", 150));
        customerSeries.getData().add(new XYChart.Data<>("Day 2", 170));
        customerSeries.getData().add(new XYChart.Data<>("Day 3", 160));
    
        customer.getData().add(customerSeries);
    
        XYChart.Series<String, Number> lineSeries = new XYChart.Series<>();
        lineSeries.setName("Pendapatan Harian");
    
        lineSeries.getData().add(new XYChart.Data<>("Day 1", 1000000));
        lineSeries.getData().add(new XYChart.Data<>("Day 2", 1200000));
        lineSeries.getData().add(new XYChart.Data<>("Day 3", 1100000));
    
        lineChart.getData().add(lineSeries);
    }
}
