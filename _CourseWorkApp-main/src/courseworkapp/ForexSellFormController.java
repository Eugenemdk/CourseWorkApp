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
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ForexSellFormController implements Initializable{
	  private Parent page;
	    private Stage stage;
	    private Scene scene;
    @FXML
    private TextArea nameTextArea;

    @FXML
    private TextArea surnameTextArea;

    @FXML
    private TextArea cityTextArea;

    @FXML
    private ChoiceBox<String> stateChoiceBox;

    @FXML
    private ChoiceBox<String> paymentChoiceBox;

    @FXML
    private ChoiceBox<String> cardChoiceBox;

    @FXML
    private Slider amountSlide;

    @FXML
    private Button submitBtn;

    @FXML
    private Button declineBtn;

    @FXML
    void declineAction(ActionEvent event) throws IOException {
    	 page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
         stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         scene=new Scene(page);
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    void submitAction(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("SubmitMessage.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        stage.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		  cardChoiceBox.getItems().add("paypal");
		    cardChoiceBox.getItems().add("visa");
		    cardChoiceBox.getItems().add("mastercard");
		    
		    paymentChoiceBox.getItems().add("cash");
		    paymentChoiceBox.getItems().add("card");
		    
		    stateChoiceBox.getItems().add("Indiana");
		    stateChoiceBox.getItems().add("New York");
		    stateChoiceBox.getItems().add("Texas");
		    stateChoiceBox.getItems().add("New Mexico");
		
	}
  
}
