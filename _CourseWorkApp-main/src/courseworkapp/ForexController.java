package courseworkapp;

import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class ForexController implements Initializable{
    @FXML
    private MenuItem salesMenuItem;
    
	@FXML
    private MenuItem savingsAccMenuItem;
	
    @FXML
    private MenuItem monthStatMenu;

    @FXML
    private MenuItem forexMenu;
    @FXML
    private MenuItem purchaseMenuItem;
    
    @FXML
    private MenuBar myMenuBar; 
    
    @FXML
    private ImageView imgIndia;

    @FXML
    private ImageView imgCanada;

    @FXML
    private Button buyPoundBtn;

    @FXML
    private Button buyCDollarBtn;

    @FXML
    private Button buyRupeeBtn;

    @FXML
    private ImageView imgTurkey;

    @FXML
    private ImageView imgAustralia;

    @FXML
    private ImageView imgHungary;

    @FXML
    private Button buyLeerBtn;

    @FXML
    private Button buyADollarBtn;

    @FXML
    private Button buyForentBtn;

    @FXML
    private ImageView imgBritain;
    
    @FXML
    private Button chartPound;

    @FXML
    private Button chartCDDollar;

    @FXML
    private Button chartRuppee;

    @FXML
    private Button chartLeer;

    @FXML
    private Button chartADollar;

    @FXML
    private Button chartForent;
    
    

    private Parent page;
    private Stage stage;
    private Scene scene;
    

    



    
    //Working with charts:
    @FXML
    private void openChartPound(ActionEvent event) throws IOException{
             page=FXMLLoader.load(getClass().getResource("ChartPound.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }
    @FXML
    void openChartADollarbuy(ActionEvent event) throws IOException {
    	 page=FXMLLoader.load(getClass().getResource("ChartADollar.fxml"));
         stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         scene=new Scene(page);
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    void openChartCDDollarbuy(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("ChartCDDollar.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openChartForentbuy(ActionEvent event) throws IOException {
       	page=FXMLLoader.load(getClass().getResource("ChartForent.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void openChartLeerBuy(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("ChartLeer.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void handleATMCardCreate(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("ATMCardFXML.fxml"));
    	stage = (Stage)(chartADollar).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
     

    @FXML
    void handleForexMenu(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    	stage = (Stage)(chartADollar).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    void handleMonthStat(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("MonthlyStatFXML.fxml"));
    	stage = (Stage)(chartADollar).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    void handlePurchaseMenuItem(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("PurchasesFXML.fxml"));
    	stage = (Stage)(chartADollar).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void openChartRuppeeBuy(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("ChartRuppee.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void openChartADollarBuy(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("ChartADollar.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
    void openChartForentBuy(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("ChartForent.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
 
    /*
     * Working with handlers for button buy and sell
     */

    
    @FXML
    private void handleButtonPoundSell(ActionEvent event) throws IOException {
    	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
         stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         scene=new Scene(page);
         stage.setScene(scene);
         stage.show();
    }
    

    @FXML
    void handleCreateSavingsAcc(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("SavingsAccountFXML.fxml"));
    	stage = (Stage)(chartADollar).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
    @FXML
     private void handleButtonPoundBuy(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
     
    @FXML
    private void handleButtonCDollarBuy(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
    
    @FXML
    private void handleButtonCDollarSell(ActionEvent event) throws IOException {
   	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
     stage=(Stage)((Node)event.getSource()).getScene().getWindow();
     scene=new Scene(page);
     stage.setScene(scene);
     stage.show();
    }

    @FXML
    private void handleButtonRupeeBuy(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonRupeeSell(ActionEvent event) throws IOException {
   	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
     stage=(Stage)((Node)event.getSource()).getScene().getWindow();
     scene=new Scene(page);
     stage.setScene(scene);
     stage.show();
    }

    @FXML
    private void handleButtonLeerBuy(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonADollarBuy(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonForentBuy(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonLeerSell(ActionEvent event) throws IOException {
   	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
     stage=(Stage)((Node)event.getSource()).getScene().getWindow();
     scene=new Scene(page);
     stage.setScene(scene);
     stage.show();
    }

    @FXML
    private void handleButtonADollarSell(ActionEvent event) throws IOException {
   	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
     stage=(Stage)((Node)event.getSource()).getScene().getWindow();
     scene=new Scene(page);
     stage.setScene(scene);
     stage.show();
    }

    @FXML
    private void handleButtonForentSell(ActionEvent event) throws IOException {
   	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
     stage=(Stage)((Node)event.getSource()).getScene().getWindow();
     scene=new Scene(page);
     stage.setScene(scene);
     stage.show();
    }
    
    
    @FXML
    private void switchToSubmissionForm(ActionEvent event) throws IOException {
            page=FXMLLoader.load(getClass().getResource("FormSubmission.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }
    

    @FXML
    void handleSalesMenuItem(ActionEvent event) throws IOException {
    	page=FXMLLoader.load(getClass().getResource("SalesFXML.fxml"));
    	stage = (Stage)(chartADollar).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }
    
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		
	}




   

}
