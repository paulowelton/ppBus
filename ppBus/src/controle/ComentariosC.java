package controle;
import java.util.ArrayList;
import modelo.Comentario;

public class ComentariosC {
    private ArrayList<Comentario> lista = new ArrayList<Comentario>();

    public boolean adicionar(Comentario comentario){
        lista.add(comentario);
        mostrarComentarios();
        return true;
    }
    public void mostrarComentarios(){
        for(int i = 0; i < lista.size(); i++){
            System.out.println("Nome da pessoa: " + lista.get(i).getNome());
            System.out.println("Comentário que a pessoa deixou: " + lista.get(i).getComentario());
            System.out.println("Esse fela gostou? " + lista.get(i).getGostou());
        }
    }
}
