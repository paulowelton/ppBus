package visual;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import modelo.Comentario;
import controle.ComentariosC;

public class Avaliacao {
    private Parent root;
    private Stage tela;
    private Scene cena;

    private ComentariosC controle = new ComentariosC();
    @FXML
    private Button btnE;

    @FXML
    private Button btnIntroducao;

    @FXML
    private RadioButton btnN;

    @FXML
    private Label btnO;

    @FXML
    private RadioButton btnS;

    @FXML
    private Button btnVoltar3;

    @FXML
    private TextField campoN;

    @FXML
    private TextArea campoS;

    @FXML
    private ToggleGroup gostou;
    
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
    void VoltarIntroducao(ActionEvent event) throws Exception{
        abrirTela(event, "Introducao.fxml", "app.css");
    }

    @FXML
    void VoltarLinhas(ActionEvent event)throws Exception {
        abrirTela(event, "Linhas.fxml", "app.css");
    }

    @FXML
    void click(ActionEvent event) {
        boolean gostou;
        Comentario com = new Comentario();
        com.setNome(campoN.getText());
        com.setComentario(campoS.getText());
        if(btnS.isSelected()){
            com.setGostou(true);
            gostou = true;
        }else{
            com.setGostou(false);
            gostou = false;
        }
        if(controle.adicionar(com)){
            if(gostou == true){
                Alert janelinha = new Alert(AlertType.INFORMATION);
            janelinha.setContentText("Obrigado pelo seu comentário! Estaremos sempre ao seu dispor!");
            janelinha.show();
            }
            if(gostou == false){
                Alert janelinha = new Alert(AlertType.INFORMATION);
            janelinha.setContentText("Lamentamos por isso! Estaremos tentando melhorar ao máximo para você.");
            janelinha.show();
            }
            campoN.setText("");
            campoS.setText("");
            btnS.setSelected(false);
            btnN.setSelected(false);
        }

    }

}
