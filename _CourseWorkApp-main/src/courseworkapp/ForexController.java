package courseworkapp;

import java.awt.event.MouseEvent;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.ContextMenuEvent;
import javafx.stage.Stage;

public class ForexController {
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

    private Parent page;
    private Stage stage;
    private Scene scene;
    

    


    @FXML
    void handleButtonPoundSell(ActionEvent event) throws IOException {
    	 page=FXMLLoader.load(getClass().getResource("ForexSellForm.fxml"));
         stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         scene=new Scene(page);
         stage.setScene(scene);
         stage.show();
    }
    @FXML
    private void openChartPound(ActionEvent event) throws IOException{
             page=FXMLLoader.load(getClass().getResource("ChartPound.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
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
    private void switchToSubmissionForm(ActionEvent event) throws IOException {
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

}
