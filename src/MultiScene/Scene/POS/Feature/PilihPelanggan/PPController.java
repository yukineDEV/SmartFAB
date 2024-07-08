package MultiScene.Scene.POS.Feature.PilihPelanggan;

import java.util.ResourceBundle;
import MultiScene.OpenScene;
import java.io.IOException;
import java.net.URL;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class PPController implements Initializable {
  OpenScene openScene = new OpenScene();
  
  @FXML
  private BorderPane mainPane;
  private Stage stage;
  private Parent root;
  private Scene scene;
  
  @FXML
  private BorderPane centerMainpane;
  
  @FXML
  public void submitButton(ActionEvent event) throws IOException{
    root = FXMLLoader.load(getClass().getResource("../../POSScene.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }
  
  

  @FXML
  public void dpButton(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("../../DPScene.fxml"));
    System.out.println("Button DPScene is clicked!");
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  
  
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    // TODO Auto-generated method stub
  }

}