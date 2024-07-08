package MultiScene;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;             
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Loader extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("./Scene/POS/POSScene.fxml"));
        // Parent root = FXMLLoader.load(getClass().getResource("../Login/signin/FXMLLogin.fxml"));

        primaryStage.setTitle("SmartFAB");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
