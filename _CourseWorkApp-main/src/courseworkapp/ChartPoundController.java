package courseworkapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedAreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ChartPoundController implements Initializable {
    private Parent page;
    private Stage stage;
    private Scene scene;
    @FXML
    private Button buyPoundBtn;
    @FXML
    private Button buyPoundBtnChart;

    @FXML
    private Button sellPoundBtnChart;
    
    @FXML
    private StackedAreaChart<String, NumberAxis> stackAreaChartPound;
    @FXML
    void handleButtonPoundBuy(MouseEvent event) throws IOException {
    		page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    void handleButtonPoundSell(ActionEvent event) throws IOException {
    	  page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
          stage=(Stage)((Node)event.getSource()).getScene().getWindow();
          scene=new Scene(page);
          stage.setScene(scene);
          stage.show();
  }
    

    @FXML
    void switchToSubmissionForm(ActionEvent event) {

    }
     
    
    @FXML
    void currencyBtnHandler(ActionEvent event) throws IOException {
    		page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }
    
    @FXML
    void dayChartHndlr(ActionEvent event) {
        
    }
      @FXML
    void myCabBtnHndlr(ActionEvent event) throws IOException {
          	page=FXMLLoader.load(getClass().getResource("ChartPound.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }
    
      @FXML
       void weekChartHandler(ActionEvent event) {

    }

    @FXML
    void yearChartHandler(ActionEvent event) {

    }
    void openChartPound(ActionEvent event) {
    
    }
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
      NumberAxis xAxis = new NumberAxis();
        xAxis.setLabel("7 Day Interval");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Visits");

      

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("April");

        dataSeries1.getData().add(new XYChart.Data( 0, 567));
        dataSeries1.getData().add(new XYChart.Data( 1, 612));
        dataSeries1.getData().add(new XYChart.Data( 2, 800));
        dataSeries1.getData().add(new XYChart.Data( 3, 780));
        dataSeries1.getData().add(new XYChart.Data( 4, 650));
        dataSeries1.getData().add(new XYChart.Data( 5, 610));
        dataSeries1.getData().add(new XYChart.Data( 6, 590));

        stackAreaChartPound.getData().add(dataSeries1);

        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName("May");

        dataSeries2.getData().add(new XYChart.Data( 0, 101));
        dataSeries2.getData().add(new XYChart.Data( 1, 110));
        dataSeries2.getData().add(new XYChart.Data( 2, 140));
        dataSeries2.getData().add(new XYChart.Data( 3, 132));
        dataSeries2.getData().add(new XYChart.Data( 4, 115));
        dataSeries2.getData().add(new XYChart.Data( 5, 109));
        dataSeries2.getData().add(new XYChart.Data( 6, 105));

        stackAreaChartPound.getData().add(dataSeries2);
        
          XYChart.Series dataSeries3 = new XYChart.Series();
        dataSeries3.setName("June");

        dataSeries3.getData().add(new XYChart.Data( 0, 140));
        dataSeries3.getData().add(new XYChart.Data( 1, 110));
        dataSeries3.getData().add(new XYChart.Data( 2, 110));
        dataSeries3.getData().add(new XYChart.Data( 3, 132));
        dataSeries3.getData().add(new XYChart.Data( 4, 110));
        dataSeries3.getData().add(new XYChart.Data( 5, 110));
        dataSeries3.getData().add(new XYChart.Data( 6, 105));

        stackAreaChartPound.getData().add(dataSeries3);
      

        
    }

}
