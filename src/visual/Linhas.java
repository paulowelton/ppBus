package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Linhas {
    private Parent root;
    private Stage tela;
    private Scene cena;

    @FXML
    private Button btnHorarios;

    @FXML
    private Button btnIntroducao;

    @FXML
    private Button btnParadas;


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
    void abrirHorarios(ActionEvent event) throws Exception {
        abrirTela(event, "Horarios.fxml", "app.css");
    }

    @FXML
    void abrirParadas(ActionEvent event) throws Exception {
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void voltarIntroducao(ActionEvent event) throws Exception {
        abrirTela(event, "Introducao.fxml", "app.css");
    }

}
