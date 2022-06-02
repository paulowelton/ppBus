package visual;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Introducao {
    private Parent root;
    private Stage tela;
    private Scene cena;

    @FXML
    private AnchorPane Tela;

    @FXML
    private Button btnComoUsar;

    @FXML
    private Button btnHorarios;

    @FXML
    private Button btnLinhas;

    private void abrirTela(ActionEvent evento, String arquivo, String css) throws Exception{
         // Coloca arquivo na memória para carregar
         root = FXMLLoader.load(getClass().getResource(arquivo));
         // Cria cena a partir do arquivo
         cena = new Scene(root);
         cena.getStylesheets().addAll(getClass().getResource(css).toString());
         // Define que a tela que será usada será a mesma da aplicação
         tela = (Stage)((Node)evento.getSource()).getScene().getWindow();
         // Define nova cena para a tela
         tela.setScene(cena);
         // Mostra a tela
         tela.show();
    }

    @FXML
    void abrirComoUsar(ActionEvent event) throws Exception {
       abrirTela(event, "ComoUsar.fxml", "app.css");
    }

    @FXML
    void abrirHorarios(ActionEvent event) throws Exception{
        abrirTela(event, "Horarios.fxml", "app.css");
    }

    @FXML
    void abrirListaIOnibus(ActionEvent event) throws Exception {
        abrirTela(event,  "Linhas.fxml",  "app.css");
    }

}
