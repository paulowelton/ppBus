package modelo;

public class Onibus {
    private static Onibus instancia = null;

    public static Onibus getInstancia() {
        if(instancia == null) {
            instancia = new Onibus();
        }
        return instancia;
    }

    public String numero = null;
}
