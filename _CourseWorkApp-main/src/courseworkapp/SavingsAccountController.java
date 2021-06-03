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
	import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

	public class SavingsAccountController implements Initializable {

	    @FXML
	    private TableColumn<SavingsAccountInfo,String> accRates;

	    
	    @FXML
	    private TableColumn<SavingsAccountInfo,String> toAmount;

	    @FXML
	    private TableColumn<SavingsAccountInfo,String> rateTable;

	    @FXML
	    private ChoiceBox<String> accNumSAChoice;

	    @FXML
	    private ChoiceBox<String> productCatSAChoice;

	    @FXML
	    private ChoiceBox<String> productSAChoice;

	    @FXML
	    private ChoiceBox<String> subproductSAChoice;

	    @FXML
	    private ChoiceBox<String> amountCategorySA;

	    @FXML
	    private Button submitSaveAccount;

	    @FXML
	    private Button declineSaveAccount;

	    @FXML
	    private TableView<SavingsAccountInfo> savingsAccountTableView;


	    @FXML
	    private TextField amountSA;
	    
	    private Parent page;
	    private Stage stage;
	    private Scene scene;

	    @FXML
	    void handleDeclineSA(ActionEvent event) throws IOException {
	    	 page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
	            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
	            scene=new Scene(page);
	            stage.setScene(scene);
	            stage.show();
	    }

	    @FXML
	    void handleSubmitSaveAccount(ActionEvent event) throws IOException, SQLException {
	    	//Executing sql query
	    	Connection connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
	    	Statement statement=connection.createStatement();
	    	String query="INSERT INTO savings_account(account_num,prod_category,product,sub_product,amount,type_rate) "+
	    	"VALUES("+"'"+accNumSAChoice.getValue().toString()+"','"+productCatSAChoice.getValue().toString()+"',"+"'"+productSAChoice.getValue().toString()+"','"+subproductSAChoice.getValue().toString()+"','"+amountSA.getText()+"'"
	    			+ ",'"+amountCategorySA.getValue().toString()+"');";
	    	System.out.println(query);
	    	statement.execute(query);
	    	
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
			productCatSAChoice.getItems().add("bonds");
			productCatSAChoice.getItems().add("futures");
			productCatSAChoice.getItems().add("hedges");
			productCatSAChoice.getItems().add("derivatives");
			
			accNumSAChoice.getItems().add("0048382332");
			accNumSAChoice.getItems().add("0038885034");
			accNumSAChoice.getItems().add("0099943244");
			
			productCatSAChoice.getItems().add("physical-law free");
			productCatSAChoice.getItems().add("physical-law charged");
			
			subproductSAChoice.getItems().add("swaps");
			subproductSAChoice.getItems().add("options");
			
			
			
			
			
			
			
			//Account Number SA Choice box filling
			accNumSAChoice.getItems().add("990202121 Savings Account");
			accNumSAChoice.getItems().add("338903213 Savings Account");
			accNumSAChoice.getItems().add("880208831 Savings Account");
			
			//Product category SA Choice box filling
			productCatSAChoice.getItems().add("General");
			productCatSAChoice.getItems().add("Superior");
			productCatSAChoice.getItems().add("Minor");
			productCatSAChoice.getItems().add("Major");
			
			//Filling product choice box:
			productSAChoice.getItems().add("SAVINGS - FOREIGN");
			productSAChoice.getItems().add("SAVINGS - RELATIVE");
			
			//Amount category type choice box filling
			amountCategorySA.getItems().add("G");
			amountCategorySA.getItems().add("S");
			amountCategorySA.getItems().add("C");
			amountCategorySA.getItems().add("E");
			
			//***Filling Table values***
			
			accRates.setCellValueFactory(new PropertyValueFactory<>("accountRate"));
			savingsAccountTableView.getColumns().add(accRates);
			
			
			toAmount.setCellValueFactory(new PropertyValueFactory<>("amount"));
			savingsAccountTableView.getColumns().add(toAmount);
			
			
			rateTable.setCellValueFactory(new PropertyValueFactory<>("rate"));
			savingsAccountTableView.getColumns().add(rateTable);
			
			
			savingsAccountTableView.getItems().add(new SavingsAccountInfo("EUR 0.00", "8000$", "5.79%"));
			
			savingsAccountTableView.getItems().add(new SavingsAccountInfo("LKR 6.00", "5000$", "5.80%"));
			
			savingsAccountTableView.getItems().add(new SavingsAccountInfo("DOL 1.00", "7000$", "5.73%"));
			
				
		}

	}


