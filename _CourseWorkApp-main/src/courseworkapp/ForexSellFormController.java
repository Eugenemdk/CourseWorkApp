package courseworkapp;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class ForexSellFormController implements Initializable{
	  private Parent page;
	    private Stage stage;
	    private Scene scene;
	    @FXML
	    private TextArea nameTextAreaSell;

	    @FXML
	    private TextArea surnameTextAreaSell;

	    @FXML
	    private TextArea cityTextAreaSell;

	    @FXML
	    private ChoiceBox<String> stateChoiceBoxSell;

	    @FXML
	    private ChoiceBox<String> paymentChoiceBoxSell;

	    @FXML
	    private ChoiceBox<String> cardChoiceBoxSell;
	    @FXML
	    private ChoiceBox<String> currencySellChoiceBoxSell;

	    @FXML
	    private Slider amountSlideSell;

    @FXML
    private Label amountSellLabel;
    
    @FXML
    void declineAction(ActionEvent event) throws IOException {
    	 page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
         stage=(Stage)((Node)event.getSource()).getScene().getWindow();
         scene=new Scene(page);
         stage.setScene(scene);
         stage.show();
    }

    @FXML
    void submitActionSell(ActionEvent event) throws IOException, SQLException {
    	Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
    	Statement statement=connection.createStatement();
    	statement.execute("INSERT INTO forex_sell(firstname,surname,c_state,city,type_payment,amount,type_card,type_money) "+
    	"VALUES("+"'"+nameTextAreaSell.getText()+"','"+surnameTextAreaSell.getText()+"','"+stateChoiceBoxSell.getValue().toString()+"','"+cityTextAreaSell.getText()+"'"
    			+ ",'"+paymentChoiceBoxSell.getValue().toString()+"','"+amountSellLabel.getText()+"','"+cardChoiceBoxSell.getValue().toString()+"','"+currencySellChoiceBoxSell.getValue().toString()+"');"
    			);
    	statement.close();
    	connection.close();
        page=FXMLLoader.load(getClass().getResource("SubmitMessage.fxml"));
        stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        scene=new Scene(page);
        stage.setScene(scene);
        
        stage.show();
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		  	cardChoiceBoxSell.getItems().add("paypal");
		    cardChoiceBoxSell.getItems().add("visa");
		    cardChoiceBoxSell.getItems().add("mastercard");
		    
		    paymentChoiceBoxSell.getItems().add("cash");
		    paymentChoiceBoxSell.getItems().add("card");
		    
		    stateChoiceBoxSell.getItems().add("Indiana");
		    stateChoiceBoxSell.getItems().add("New York");
		    stateChoiceBoxSell.getItems().add("Texas");
		    stateChoiceBoxSell.getItems().add("New Mexico");
		    
		    //adding currency
		       currencySellChoiceBoxSell.getItems().add("pound");
		       currencySellChoiceBoxSell.getItems().add("leer");
		       currencySellChoiceBoxSell.getItems().add("ruppee");
		       currencySellChoiceBoxSell.getItems().add("canadian dollar");
		       currencySellChoiceBoxSell.getItems().add("australian dollar");
		       currencySellChoiceBoxSell.getItems().add("dollar");
		       currencySellChoiceBoxSell.getItems().add("forent"); 
		       //Slider works
				
				amountSlideSell.valueProperty().addListener(new ChangeListener<Number>() {
					@Override
					public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
						int amount=(int)amountSlideSell.getValue();
						amountSellLabel.setText(""+amount);
					}
				});
		
	}
  
}
