package courseworkapp;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.sun.glass.events.MouseEvent;

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
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class ChartCDDollarController implements Initializable {
	  private Parent page;
	    private Stage stage;
	    private Scene scene;
    @FXML
    private ImageView logo;

    @FXML
    private Button buyCDDollarBtnChart;

    @FXML
    private Button sellCDDollarBtnChart;

    @FXML
    private Button mycabBtn;

    @FXML
    private Button currencyBtn;

    @FXML
    private Button yearChartBtn;

    @FXML
    private Button dayChartBtn;

    @FXML
    private Button weekChartBtn;

    @FXML
    private StackedAreaChart<NumberAxis, NumberAxis> stackAreaChartCDDollar;

    @FXML
    private MenuBar menubarChartPound;

    @FXML
    void currencyBtnHandler(ActionEvent event) {

    }
    
    @FXML
    void dayChartHndlr(ActionEvent event) {

    }

    @FXML
    void handleButtonCDDollarBuy(ActionEvent event) throws IOException {
		page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleButtonCDDollarSell(ActionEvent event) throws IOException {
    	  page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
          stage=(Stage)((Node)event.getSource()).getScene().getWindow();
          scene=new Scene(page);
          stage.setScene(scene);
          stage.show();
    }

    @FXML
    void myCabBtnHndlr(ActionEvent event) {

    }

    @FXML
    void switchToSubmissionForm(ActionEvent event) {

    }

    @FXML
    void weekChartHandler(ActionEvent event) {

    }

    @FXML
    void yearChartHandler(ActionEvent event) {

    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
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

	        stackAreaChartCDDollar.getData().add(dataSeries1);

	        XYChart.Series dataSeries2 = new XYChart.Series();
	        dataSeries2.setName("May");

	        dataSeries2.getData().add(new XYChart.Data( 0, 80));
	        dataSeries2.getData().add(new XYChart.Data( 1, 110));
	        dataSeries2.getData().add(new XYChart.Data( 2, 140));
	        dataSeries2.getData().add(new XYChart.Data( 3, 102));
	        dataSeries2.getData().add(new XYChart.Data( 4, 45));
	        dataSeries2.getData().add(new XYChart.Data( 5, 109));
	        dataSeries2.getData().add(new XYChart.Data( 6, 85));

	        stackAreaChartCDDollar.getData().add(dataSeries2);
	        
	          XYChart.Series dataSeries3 = new XYChart.Series();
	        dataSeries3.setName("June");

	        dataSeries3.getData().add(new XYChart.Data( 0, 90));
	        dataSeries3.getData().add(new XYChart.Data( 1, 180));
	        dataSeries3.getData().add(new XYChart.Data( 2, 100));
	        dataSeries3.getData().add(new XYChart.Data( 3, 42));
	        dataSeries3.getData().add(new XYChart.Data( 4, 30));
	        dataSeries3.getData().add(new XYChart.Data( 5, 190));
	        dataSeries3.getData().add(new XYChart.Data( 6, 105));

	        stackAreaChartCDDollar.getData().add(dataSeries3);
	}

}
