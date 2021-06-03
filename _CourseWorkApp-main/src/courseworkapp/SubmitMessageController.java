package courseworkapp;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SubmitMessageController {

    @FXML
    private Button okBackBtn;
    private Parent page;
    private Stage stage;
    private Scene scene;
    
    
    
    @FXML
    void okBackBtnHandler(ActionEvent event) throws IOException {
      page=FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
            stage=(Stage)((Node)event.getSource()).getScene().getWindow();
            scene=new Scene(page);
            stage.setScene(scene);
            stage.show();
    }

}
