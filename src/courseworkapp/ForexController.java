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
    private void openChartPound(ActionEvent event) throws IOException{
             page=FXMLLoader.load(getClass().getResource("ChartPound.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }
    
    @FXML
     private void handleButtonPoundBuy(javafx.scene.input.MouseEvent event) throws IOException {

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
    private void handleButtonPoundSell(javafx.scene.input.MouseEvent event) {

    }

    @FXML
    private void handleButtonCDollarBuy(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonCDollarSell(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonRupeeBuy(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonRupeeSell(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonLeerBuy(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonADollarBuy(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonForentBuy(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonLeerSell(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonADollarSell(javafx.scene.input.MouseEvent event) {
    }

    @FXML
    private void handleButtonForentSell(javafx.scene.input.MouseEvent event) {
    }

}
