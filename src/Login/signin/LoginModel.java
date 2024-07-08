package Login.signin;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class LoginModel {

  public static List<String[]> readUserDataFromXML(String filePath) {
    List<String[]> users = new ArrayList<>();

    try {
      File xmlFile = new File(filePath);
      DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
      org.w3c.dom.Document doc = dBuilder.parse(xmlFile);
      doc.getDocumentElement().normalize();

      NodeList nodeList = doc.getElementsByTagName("user");

      for (int i = 0; i < nodeList.getLength(); i++) {
        Node node = nodeList.item(i);

        if (node.getNodeType() == Node.ELEMENT_NODE) {
          Element element = (Element) node;
          String username = element.getElementsByTagName("username").item(0).getTextContent();
          String name = element.getElementsByTagName("name").item(0).getTextContent();
          String password = element.getElementsByTagName("password").item(0).getTextContent();

          String[] userData = { username, name, password };
          users.add(userData);
        }
      }
    } catch (Exception e) {
      e.printStackTrace();
    }

    return users;
  }

  void showAlert(AlertType alertType, String title, String message) {
    Alert alert = new Alert(alertType);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(message);
    alert.showAndWait();
  }

  public boolean validateUser(String username, String password, List<String[]> users) {
    for (String[] i : users) {
      
      System.out.println(i[0]);
      System.out.println(i[2]);
      if (username.equals(i[0]) && password.equals(i[2])) {
        
        return true;
      }
    }
    return false;
  }

}