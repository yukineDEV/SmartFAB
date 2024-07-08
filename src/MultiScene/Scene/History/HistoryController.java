package MultiScene.Scene.History;

import MultiScene.OpenScene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML; 
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HistoryController {
  OpenScene openScene = new OpenScene();


  @FXML
  private BorderPane mainPane;

  @FXML
  private void POSButton (ActionEvent event){
    Pane page = openScene.getPane("./POS/POSScene.fxml");
    mainPane.setCenter(page);
    System.out.println("Button Menu is clicked!");
  }

  @FXML
  private void HistoryButton (ActionEvent event){
    Pane page = openScene.getPane("../History/HistoryScene.fxml");
    mainPane.setCenter(page);
    System.out.println("Button Menu is clicked!");
  }

  @FXML
  private void ChartButton (ActionEvent event){
    Pane page = openScene.getPane("../Chart/ChartScene.fxml");
    mainPane.setCenter(page);
    System.out.println("Button diagram is clicked!");
  }

  @FXML
  private void ProductButton (ActionEvent event){
    Pane page = openScene.getPane("../Product/ProductScene.fxml");
    mainPane.setCenter(page);
    System.out.println("Button stock is clicked!");
  }
}