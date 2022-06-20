package visual;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import modelo.Onibus;

public class Paradas implements Initializable {
    private Parent root;
    private Stage tela;
    private Scene cena;
    Onibus onibus = Onibus.getInstancia();

    @FXML
    private Button btnVoltar2;

    @FXML
    private Label textoOnibusSelecionado;

    @FXML
    public ImageView imagem;

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
    void volatrLinha2(ActionEvent event) throws Exception {
        abrirTela(event,  "Linhas.fxml",  "app.css");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        switch(onibus.numero) {
            case "016":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 016"); 
                break;
            case "051":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 051");
                break;
            
        }
    }

}
