package modelo;

public class Comentario{
    private String nome;
    private String comentario;
    private boolean gostou;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getComentario(){
        return comentario;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public boolean getGostou(){
        return gostou;
    }
    public void setGostou(boolean gostou){
        this.gostou = gostou;
    }
}