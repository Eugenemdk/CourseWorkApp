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

public class SalesFXMLController implements Initializable {
//DAta
	ObservableList<ObservableList>data;
	
	 private Parent page;
	    private Stage stage;
	    private Scene scene;
    @FXML
    private TableView<Sales> tableSales;
	
    @FXML
    private TableColumn<Sales,String> firstnameTC;

    @FXML
    private TableColumn<Sales,String> surnameTC;

    @FXML
    private TableColumn<Sales, String> stateSale;

    @FXML
    private TableColumn<Sales,String> citySale;

    @FXML
    private TableColumn<Sales,String> typePaymentSale;

    @FXML
    private TableColumn<Sales,String> amountSale;

    @FXML
    private TableColumn<Sales,String> cardSale;

    @FXML
    private TableColumn<Sales,String> currencySale;

    @FXML
    private Button cityBtnOrder;

    @FXML
    private Button orderByStateSale;

    @FXML
    private Button orderByPaySale;

    @FXML
    private Button orderByAmountSale;

    @FXML
    private Button orderByCurrencySale;


    @FXML
    private Button mainPageBtn;
    
    @FXML
    void handleOrderByAmountSale(ActionEvent event) {
    	// TODO Auto-generated method stub
		tableSales.getItems().clear();
    			Connection connection;
    			try {
    				connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
    				Statement statement=connection.createStatement();
    				String query="SELECT * FROM forex_sell ORDER BY amount";
    				ResultSet rs=statement.executeQuery(query);
    				while(rs.next()) {
    					sales.add(new Sales(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
    					
    				}
    				
    				firstnameTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
    				surnameTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
    				stateSale.setCellValueFactory(new PropertyValueFactory<>("c_state"));
    				citySale.setCellValueFactory(new PropertyValueFactory<>("city"));
    				typePaymentSale.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
    				amountSale.setCellValueFactory(new PropertyValueFactory<>("amount"));
    				cardSale.setCellValueFactory(new PropertyValueFactory<>("type_card"));
    				currencySale.setCellValueFactory(new PropertyValueFactory<>("type_money"));
    				tableSales.setItems(sales);
    			} catch (SQLException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    			}
    	    
    			    	
    }
    
    @FXML
    void gotoMainPageSales(ActionEvent event) throws IOException {
    	  page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
          stage=(Stage)((Node)event.getSource()).getScene().getWindow();
          scene=new Scene(page);
          stage.setScene(scene);
          stage.show();
    }

    @FXML
    void handleOrderByCitySale(ActionEvent event) {
		tableSales.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_sell ORDER BY city";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				sales.add(new Sales(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnameTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnameTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			stateSale.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			citySale.setCellValueFactory(new PropertyValueFactory<>("city"));
			typePaymentSale.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountSale.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardSale.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencySale.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tableSales.setItems(sales);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		    	
    }

    @FXML
    void handleOrderByCurrencySale(ActionEvent event) {
		tableSales.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_sell ORDER BY type_money";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				sales.add(new Sales(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnameTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnameTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			stateSale.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			citySale.setCellValueFactory(new PropertyValueFactory<>("city"));
			typePaymentSale.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountSale.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardSale.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencySale.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tableSales.setItems(sales);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		    	
    }

    @FXML
    void handleOrderByPaySale(ActionEvent event) {
		tableSales.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_sell ORDER BY type_payment";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				sales.add(new Sales(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnameTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnameTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			stateSale.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			citySale.setCellValueFactory(new PropertyValueFactory<>("city"));
			typePaymentSale.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountSale.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardSale.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencySale.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tableSales.setItems(sales);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		    	
    }

    @FXML
    void handleOrderByStateSale(ActionEvent event) {
		tableSales.getItems().clear();
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_sell ORDER BY c_state";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				sales.add(new Sales(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnameTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnameTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			stateSale.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			citySale.setCellValueFactory(new PropertyValueFactory<>("city"));
			typePaymentSale.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountSale.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardSale.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencySale.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tableSales.setItems(sales);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		    	
    }
ObservableList<Sales>sales=FXCollections.observableArrayList();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		Connection connection;
		try {
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/finances","postgres","112263");
			Statement statement=connection.createStatement();
			String query="SELECT * FROM forex_sell";
			ResultSet rs=statement.executeQuery(query);
			while(rs.next()) {
				sales.add(new Sales(rs.getString("firstname"),rs.getString("surname"),rs.getString("c_state"),rs.getString("city") , rs.getString("type_payment"),rs.getString("amount"), rs.getString("type_card"),rs.getString("type_money")));
				
			}
			
			firstnameTC.setCellValueFactory(new PropertyValueFactory<>("firstname"));
			surnameTC.setCellValueFactory(new PropertyValueFactory<>("surname"));
			stateSale.setCellValueFactory(new PropertyValueFactory<>("c_state"));
			citySale.setCellValueFactory(new PropertyValueFactory<>("city"));
			typePaymentSale.setCellValueFactory(new PropertyValueFactory<>("type_payment"));
			amountSale.setCellValueFactory(new PropertyValueFactory<>("amount"));
			cardSale.setCellValueFactory(new PropertyValueFactory<>("type_card"));
			currencySale.setCellValueFactory(new PropertyValueFactory<>("type_money"));
			tableSales.setItems(sales);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    
		
	
		
	}

}
