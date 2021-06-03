package courseworkapp;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class PurchaseFXMLController implements Initializable{
	 private Parent page;
	    private Stage stage;
	    private Scene scene;
	    
	    ObservableList<Purchase>purchases=FXCollections.observableArrayList();

    @FXML
    private Button cityBtnOrderPurchase;

    @FXML
    private Button orderByStatePurchase;

    @FXML
    private Button orderByPayPurchase;

    @FXML
    private Button orderByAmountPurchase;

    @FXML
    private Button orderByCurrencyPurchase;

    @FXML
    private Button mainPageBtnPurchase;

    @FXML
    private TableView<Purchase> tablePurchase;

    @FXML
    private TableColumn<Purchase,String> firstnamePurchaseTC;

    @FXML
    private TableColumn<Purchase, String> surnamePurchaseTC;

    @FXML
    private TableColumn<Purchase,String> statePurchaseTC;

    @FXML
    private TableColumn<Purchase,String> cityPurchaseTC;

    @FXML
    private TableColumn<Purchase,String> paymentPurchaseTC;

    @FXML
    private TableColumn<Purchase,String> amountPurchaseTC;

    @FXML
    private TableColumn<Purchase,String> cardPurchaseTC;

    @FXML
    private TableColumn<Purchase , String> currencyPurchaseTC;

    @FXML
    void gotoMainPageSalesPurchase(ActionEvent event) throws IOException {
    	  page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
          stage=(Stage)((Node)event.getSource()).getScene().getWindow();
          scene=new Scene(page);
          stage.setScene(scene);
          stage.show();
    }

    @FXML
    void handleOrderByAmountPurchase(ActionEvent event) {
    	// TODO Auto-generated method stub
    			tablePurchase.getItems().clear();
    	    			Connection connection;
    	    			try {
    	    				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
    	    				Statement statement=connection.createStatement();
    	    				String query="SELECT * FROM forex_buy ORDER BY amount";
    	    				ResultSet rs=statement.executeQuery(query);
    	    				while(rs.next()) {
    	    					purchases.add(new Purchase(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
    	    					
    	    				}
    	    				
    	    				firstnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
    	    				surnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
    	    				statePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("c_state"));
    	    				cityPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("city"));
    	    				paymentPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
    	    				amountPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
    	    				cardPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_card"));
    	    				currencyPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_money"));
    	    				tablePurchase.setItems(purchases);
    	    			} catch (SQLException e) {
    	    				// TODO Auto-generated catch block
    	    				e.printStackTrace();
    	    			}
    	    	    
    	    			    	
    }

    @FXML
    void handleOrderByCityPurchase(ActionEvent event) {
    	tablePurchase.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_buy ORDER BY city";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				purchases.add(new Purchase(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			statePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			cityPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("city"));
			paymentPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencyPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tablePurchase.setItems(purchases);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

    @FXML
    void handleOrderByCurrencyPurchase(ActionEvent event) {
    	tablePurchase.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_buy ORDER BY type_money";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				purchases.add(new Purchase(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			statePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			cityPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("city"));
			paymentPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencyPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tablePurchase.setItems(purchases);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

    @FXML
    void handleOrderByPayPurchase(ActionEvent event) {
    	tablePurchase.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_buy ORDER BY type_payment";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				purchases.add(new Purchase(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			statePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			cityPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("city"));
			paymentPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencyPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tablePurchase.setItems(purchases);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

    @FXML
    void handleOrderByStatePurchase(ActionEvent event) {
    	tablePurchase.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_buy ORDER BY c_state";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				purchases.add(new Purchase(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			statePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			cityPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("city"));
			paymentPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencyPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tablePurchase.setItems(purchases);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
	
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_buy";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				purchases.add(new Purchase(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnamePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			statePurchaseTC.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			cityPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("city"));
			paymentPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencyPurchaseTC.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tablePurchase.setItems(purchases);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		
	}

}
