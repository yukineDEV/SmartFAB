package Login.signup;

import java.io.File;

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

public class RegisterModel {

  public boolean registerUser(String name, String username, String password) {
    try {
      DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
      DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
      Document document;

      File file = new File("users.xml");

      if (file.exists()) {
        document = documentBuilder.parse(file);
        Element root = document.getDocumentElement();

        Element userElement = document.createElement("user");

        Element nameElement = document.createElement("name");
        nameElement.appendChild(document.createTextNode(name));

        Element usernameElement = document.createElement("username");
        usernameElement.appendChild(document.createTextNode(username));

        Element passwordElement = document.createElement("password");
        passwordElement.appendChild(document.createTextNode(password));

        userElement.appendChild(nameElement);
        userElement.appendChild(usernameElement);
        userElement.appendChild(passwordElement);

        root.appendChild(userElement);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(domSource, streamResult);

      } else {
        document = documentBuilder.newDocument();
        Element root = document.createElement("users");
        document.appendChild(root);

        Element userElement = document.createElement("user");

        Element nameElement = document.createElement("name");
        nameElement.appendChild(document.createTextNode(name));

        Element usernameElement = document.createElement("username");
        usernameElement.appendChild(document.createTextNode(username));


        Element passwordElement = document.createElement("password");
        passwordElement.appendChild(document.createTextNode(password));

        userElement.appendChild(nameElement);
        userElement.appendChild(usernameElement);
        userElement.appendChild(passwordElement);

        root.appendChild(userElement);

        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource domSource = new DOMSource(document);
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(domSource, streamResult);
      }

      System.out.println("User registered to XML");
      return true;

    } catch (ParserConfigurationException | TransformerException | org.xml.sax.SAXException | java.io.IOException e) {
      e.printStackTrace();
      return false;
    }
  }

}