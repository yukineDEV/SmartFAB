package MultiScene.Scene.POS;

import java.util.ResourceBundle;
import MultiScene.OpenScene;
import java.io.IOException;
import java.net.URL;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.Node;

public class POSController implements Initializable {
  OpenScene openScene = new OpenScene();
  OpenScene openScene2 = new OpenScene();

  // menu
  @FXML
  private TableColumn<menuModel, Integer> Price;

  @FXML
  private TableColumn<menuModel, String> namaMenu;

  @FXML
  private javafx.scene.control.TableView<menuModel> TableView;

  ObservableList<menuModel> dataMenu = FXCollections.observableArrayList();

  @FXML
  private BorderPane centerMainpane;

  @FXML
  private BorderPane mainPane;
  private Stage stage;
  private Parent root;
  private Scene scene;

  @FXML
  public void POSButton(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("POSScene.fxml"));
    System.out.println("Button POS is clicked!");
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  @FXML
  private void HistoryButton(ActionEvent event) {
    System.out.println("Button History is clicked!");
    Pane page = openScene.getPane("./Scene/History/HistoryScene.fxml");
    mainPane.setCenter(page);
  }

  @FXML
  private void ChartButton(ActionEvent event) {
    System.out.println("Button Chart is clicked!");
    Pane page = openScene.getPane("./Scene/Chart/ChartScene.fxml");
    mainPane.setCenter(page);
  }

  @FXML
  private void ProductButton(ActionEvent event) {
    System.out.println("Button Product is clicked!");
    Pane page = openScene.getPane("./Scene/Product/ProductScene.fxml");
    mainPane.setCenter(page);
  }

  @FXML
  public void signoutButton(ActionEvent event) throws IOException {
    root = FXMLLoader.load(getClass().getResource("../../../Login/signin/FXMLLogin.fxml"));
    System.out.println("Button signout is clicked!");
    stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
  }

  

  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO Auto-generated method stub

    namaMenu.setCellValueFactory(new PropertyValueFactory<>("namaMenu"));
    Price.setCellValueFactory(new PropertyValueFactory<>("harga"));

    TableView.setItems(dataMenu);
  }

  // Featur
  @FXML
  private void OrderButton(ActionEvent event) {
    Pane page = openScene.getPane("./Scene/POS/Feature/Order/OrderScene.fxml");
    mainPane.setCenter(page);
    System.out.println("Button Order is clicked!");
  }

  @FXML
  private void ppButton(ActionEvent event) {
    Pane page = openScene2.getPane("./Scene/POS/Feature/PilihPelanggan/PPScene.fxml");
    centerMainpane.setCenter(page);
    System.out.println("Button Pilih Pelanggan is clicked!");
  }

  @FXML
  private void ctButton(ActionEvent event) {
    System.out.println("Button hapusButton is clicked!");
  }

  @FXML
  private void simpanButton(ActionEvent event) {
    System.out.println("Button hapusButton is clicked!");
  }

  public void hapusButton() {
    menuModel selectedItem = TableView.getSelectionModel().getSelectedItem();
    TableView.getItems().remove(selectedItem);
  }

  // menuButton
  @FXML
  private void Menu1Button(ActionEvent event) {
    dataMenu.add(new menuModel("Nasi Goreng", 25000));
  }

  @FXML
  private void Menu2Button(ActionEvent event) {
    dataMenu.add(new menuModel("Nasi Curry", 28000));
  }

  @FXML
  private void Menu3Button(ActionEvent event) {
    dataMenu.add(new menuModel("Mie pedas", 18000));
  }

  @FXML
  private void Menu4Button(ActionEvent event) {
    dataMenu.add(new menuModel("Sirloin", 80000));
  }

  @FXML
  private void Menu5Button(ActionEvent event) {
    dataMenu.add(new menuModel("Ice Cream", 7000));
  }

  @FXML
  private void Menu6Button(ActionEvent event) {
    dataMenu.add(new menuModel("18++", 350000));
  }

  @FXML
  private void Menu7Button(ActionEvent event) {
    dataMenu.add(new menuModel("Blueberries", 15000));
  }

  @FXML
  private void Menu8Button(ActionEvent event) {
    dataMenu.add(new menuModel("Teh", 10000));
  }

}