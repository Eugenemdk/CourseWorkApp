/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Евгений
 */
public class FormSubmissionController implements Initializable {

    @FXML
    private ChoiceBox<String> stateChoiceBox;
    @FXML
    private ChoiceBox<String> payChoiceBox;
    @FXML
    private ChoiceBox<String> cardChoiceBox;
    private Parent page;
    private Stage stage;
    private Scene scene;
    @FXML
    private TextArea nameTextArea;
    @FXML
    private Label namelbl;
    @FXML
    private TextArea surnameTextArea;
    @FXML
    private Label surnamelbl;
    @FXML
    private TextArea cityTextArea;
    @FXML
    private Label citylbl;
    @FXML
    private Label statelbl;
    @FXML
    private Label typepaylbl;
    @FXML
    private Slider amountSlide;
    @FXML
    private Label amountlbl;
    @FXML
    private Label cardlbl;
    @FXML
    private Button submitBtn;
    @FXML
    private Button declinelbl;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
       cardChoiceBox.getItems().add("paypal");
       cardChoiceBox.getItems().add("visa");
       cardChoiceBox.getItems().add("mastercard");
       
       payChoiceBox.getItems().add("cash");
       payChoiceBox.getItems().add("card");
       
       stateChoiceBox.getItems().add("Indiana");
       stateChoiceBox.getItems().add("New York");
       stateChoiceBox.getItems().add("Texas");
       stateChoiceBox.getItems().add("New Mexico");
    }    


    @FXML
    private void declineBtn(MouseEvent event) throws IOException {
        
             page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }

    @FXML
    private void submitAction(ActionEvent event) throws IOException{
    page=FXMLLoader.load(getClass().getResource("SubmitMessage.fxml"));
    stage=(Stage)((Node)event.getSource()).getScene().getWindow();
    scene=new Scene(page);
    stage.setScene(scene);
    stage.show();
    }


    
}
