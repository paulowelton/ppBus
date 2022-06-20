package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import modelo.Onibus;

public class Linhas {
    private Parent root;
    private Stage tela;
    private Scene cena;
    Onibus onibus = Onibus.getInstancia();

    @FXML
    private Button btn016;

    @FXML
    private Button btn051;

    @FXML
    private Button btn055;

    @FXML
    private Button btn070;

    @FXML
    private Button btn092;

    @FXML
    private Button btn101;

    @FXML
    private Button btn706;

    @FXML
    private Button btn711;

    @FXML
    private Button btnAv;

    @FXML
    private Label btnO;

    @FXML
    private Button btnParadas;
    
    @FXML
    void abrirAvaliação(ActionEvent event) throws Exception{
        abrirTela(event, "Avaliacao.fxml", "app.css");
    }

    private void abrirTela(ActionEvent event, String arquivo, String css) throws Exception{
        // Coloca arquivo na memória para carregar
        root = FXMLLoader.load(getClass().getResource(arquivo));
        // Cria cena a partir do arquivo
        cena = new Scene(root);
        cena.getStylesheets().addAll(getClass().getResource(css).toString());
        // Define que a tela que será usada será a mesma da aplicação
        tela = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Define nova cena para a tela
        tela.setScene(cena);
        // Mostra a tela
        tela.show();
    }

    @FXML
    void abrirParadas(ActionEvent event) throws Exception {
        abrirTela(event, "Paradas.fxml", "app.css");
    }
    @FXML
    void abrir070(ActionEvent event) throws Exception {
        onibus.numero = "070";
        abrirTela(event, "Paradas.fxml", "app.css");
        
    }
    @FXML
    void abrir016(ActionEvent event) throws Exception {
        onibus.numero = "016";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void abrir051(ActionEvent event) throws Exception {
        onibus.numero = "051";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void abrir055(ActionEvent event) throws Exception {
        onibus.numero = "055";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void abrir092(ActionEvent event) throws Exception {
        onibus.numero = "092";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void abrir101(ActionEvent event) throws Exception {
        onibus.numero = "101";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void abrir706(ActionEvent event) throws Exception {
        onibus.numero = "706";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

    @FXML
    void abrir711(ActionEvent event) throws Exception {
        onibus.numero = "711";
        abrirTela(event, "Paradas.fxml", "app.css");
    }

}
