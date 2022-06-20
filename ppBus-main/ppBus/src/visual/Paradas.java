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
import controle.ParadasC;
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

    ImageView imagem;
    
    Image paradas;

    private void mostrarParadas(String img){
        paradas =  new Image(getClass().getResourceAsStream("paradasimgs/" + img), 647, 7000, false, false);
        imagem.setImage(paradas);
    }

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
                this.mostrarParadas("016.jpg");
                break;
            case "051":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 051");
                this.mostrarParadas("051.jpg");
                break;
            case "092":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 092");
                this.mostrarParadas("092.jpg");
                break;
            case "055":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 055");
                this.mostrarParadas("055.jpg");
                break;
            case "706":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 706");
                this.mostrarParadas("706.jpg");
                break;
            case "101":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 101");
                this.mostrarParadas("101.jpg");
                break;
            case "070":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 070");
                this.mostrarParadas("070.jpg");
                break;
            case "711":
                textoOnibusSelecionado.setText("O ônibus selecionado foi o 711");
                this.mostrarParadas("711.jpg");
                break;
        }
    }

}
