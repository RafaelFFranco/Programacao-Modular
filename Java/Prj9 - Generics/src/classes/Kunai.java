package classes;

public class Kunai {
   private String tipo;


   //Construtor
    public Kunai(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return tipo;
    }

    @Override
    public String toString() {
        return "Kunai do tipo: " + tipo;
    }
}
