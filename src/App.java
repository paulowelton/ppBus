import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage tela) throws Exception {
      Parent root = FXMLLoader.load(getClass().getResource("visual/Introducao.fxml"));
      Scene cena = new Scene(root);
      cena.getStylesheets().addAll(getClass().getResource("visual/app.css").toString());
      tela.setResizable(false);
      tela.setScene(cena);
      tela.show();
        
    }
}
