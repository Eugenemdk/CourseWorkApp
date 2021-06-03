package courseworkapp;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ATMCardFXMLController implements Initializable {
	  private Parent page;
	    private Stage stage;
	    private Scene scene;

	    @FXML
	    private ChoiceBox<String> typeUseChoiceBox;

    @FXML
    private ChoiceBox<String> pointChoiceBox;

    @FXML
    private ChoiceBox<String> cardValueChoiceBox;

    @FXML
    private Button submitATM;

    @FXML
    private Button declineATMBtn;

    @FXML
    private ChoiceBox<String> atmPayMethod;

    @FXML
    private TextField firstnameATMtextField;

    @FXML
    private TextField surnameATMtextField;

    @FXML
    void handleDeclineBtn(ActionEvent event) throws IOException {
        page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
       stage=(Stage)((Node)event.getSource()).getScene().getWindow();
       scene=new Scene(page);
       stage.setScene(scene);
       stage.show();
    }

    @FXML
    void handleSubmitATM(ActionEvent event) throws SQLException, IOException {
    	Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
    	Statement statement=connection.createStatement();
    	statement.execute("INSERT INTO atm_card(type_use,payment_method,card_value,point_use,firstname,surname) "+
    	"VALUES("+"'"+typeUseChoiceBox.getValue().toString()+"','"+atmPayMethod.getValue()+"','"+cardValueChoiceBox.getValue().toString()+"','"+pointChoiceBox.getValue().toString()+"'"
    			+ ",'"+firstnameATMtextField.getText()+"','"+surnameATMtextField.getText()+"');"
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
		typeUseChoiceBox.getItems().add("Gift");
		typeUseChoiceBox.getItems().add("Personal Use");
		
		atmPayMethod.getItems().add("Card");
		atmPayMethod.getItems().add("Cash");
		
		cardValueChoiceBox.getItems().add("Superior");
		cardValueChoiceBox.getItems().add("Major");
		cardValueChoiceBox.getItems().add("Minor");
		
		pointChoiceBox.getItems().add("Local use");
		pointChoiceBox.getItems().add("Foreign use");
		
		
		
	}

}
