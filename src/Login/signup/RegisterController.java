package Login.signup;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class RegisterController implements Initializable {

  @FXML
  private TextField textName;

  @FXML
  private TextField textUsername;

  @FXML
  private PasswordField textPassword;

  @FXML
  private Button RegisterButtton;

  @FXML
  Hyperlink loginHyperlink;

  private RegisterModel userModel;

  @FXML
  private void handleRegisterButton(ActionEvent event) {
    String name = textName.getText();
    String username = textUsername.getText();
    String password = textPassword.getText();


    if (userModel.registerUser(name, username, password)) {
      showAlert("Registration Successful", "User " + username + " has been registered.");
      System.out.println("berhasil");
      directToSignin(event);
    } else {
      showAlert("Registration Failed", "Could not register user.");
    }
  }
  
  private void showAlert(String title, String message) {
    Alert alert = new Alert(Alert.AlertType.INFORMATION);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }

  private void directToSignin(ActionEvent event) {
    try {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../signin/FXMLLogin.fxml"));
      Stage stage = (Stage) RegisterButtton.getScene().getWindow();
      stage.setScene(new Scene(fxmlLoader.load()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  private void directToLogin() {
    try {
      Stage stage = (Stage) loginHyperlink.getScene().getWindow();
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../signin/FXMLLogin.fxml"));
      Scene scene = new Scene(fxmlLoader.load());
      stage.setScene(scene);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  
  @FXML
  private void handleLoginHyperlink(ActionEvent event) {
    directToLogin();
  }
  
 
  @Override
  public void initialize(URL location, ResourceBundle resources) {
    userModel = new RegisterModel();
  }

}