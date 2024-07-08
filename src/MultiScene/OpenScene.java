package MultiScene;

import java.net.URL;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;

public class OpenScene {
  private Pane page;

  public Pane getPane(String fileName) {
    try {
      URL pageFile = Loader.class.getResource(fileName);
      
      // URL pageFile = LoginLoader.class.getResource(fileName+".fxml");
      System.out.println("ada filenya :" + pageFile);
      System.out.println(fileName);

      if (pageFile == null) {
        throw new java.io.FileNotFoundException("Cannot find the pade");
      }
      page = FXMLLoader.load(pageFile);
    } catch (Exception e) {
      System.out.println(e);
      System.out.println("Cannot find the requested page");
    }
    return page;
  }
}
