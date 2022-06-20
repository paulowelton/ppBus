package modelo;

public class Comentario{
    private String nome;
    private String comentario;
    private boolean gostou;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getComentario(){
        return this.comentario;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    public boolean getGostou(){
        return this.gostou;
    }
    public void setGostou(boolean gostou){
        this.gostou = gostou;
    }
}