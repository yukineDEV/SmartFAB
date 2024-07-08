package Login.signin;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;


public class LoginController implements Initializable {

  @FXML
  private TextField textUsername;

  @FXML
  private PasswordField textPassword;

  @FXML
  private Button loginButton;

  @FXML
  private Hyperlink registerHyperlink;

  private LoginModel userModel;

  @FXML
  private void handleLoginButton(ActionEvent event) {
    String username = textUsername.getText();
    String password = textPassword.getText();

    List<String[]> users = userModel.readUserDataFromXML("users.xml");
    if (userModel.validateUser(username, password, users)) {
      userModel.showAlert(AlertType.INFORMATION, "Login Success", "Welcome " + username + "!");
      directToPOSScene();
    } else {
      userModel.showAlert(AlertType.ERROR, "Login Failed", "Username and password not registered.");
    }
  }

  @FXML
  private void handleRegisterHyperlink(ActionEvent event) {
    directToRegistrationPage();
  }

  private void directToPOSScene() {
    try {
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/MultiScene/Scene/POS/POSScene.fxml"));
      Stage stage = (Stage) loginButton.getScene().getWindow();
      Scene scene = new Scene(fxmlLoader.load());
      stage.setScene(scene);
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  private void directToRegistrationPage() {
    try {
      Stage stage = (Stage) registerHyperlink.getScene().getWindow();
      FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("../signup/FXMLRegister.fxml"));
      stage.setScene(new Scene(fxmlLoader.load()));
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


  @Override
  public void initialize(URL location, ResourceBundle resources) {
    userModel = new LoginModel();
  }

}