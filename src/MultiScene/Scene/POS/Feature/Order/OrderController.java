package MultiScene.Scene.POS.Feature.Order;

import java.util.ResourceBundle;

import MultiScene.OpenScene;

import java.io.IOException;
import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class OrderController implements Initializable {
  OpenScene openScene = new OpenScene();

  @FXML
  private BorderPane mainPane;
  private Stage stage;
  private Parent root;
  private Scene scene;

   @FXML
  public void backButton(ActionEvent event) throws IOException{
      root = FXMLLoader.load(getClass().getResource("../../POSScene.fxml"));
      stage = (Stage)((Node)event.getSource()).getScene().getWindow();
      scene = new Scene(root);
      stage.setScene(scene);
      stage.show();
  }

  // @FXML
  // private void backButton(ActionEvent event) {
  //   Pane page = openScene.getPane("../MultiScene/Scene/POS/POSScene.fxml");
  //   mainPane.setCenter(page);
  //   System.out.println("Button Menu is clicked!");
  // }

  @Override
  public void initialize(URL location, ResourceBundle resources) {
    // TODO Auto-generated method stub
    
  }

}