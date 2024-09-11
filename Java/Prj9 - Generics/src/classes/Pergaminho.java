package classes;

public class Pergaminho {
   private String tipo;

    //Construtor
   public Pergaminho(String tipo){
       this.tipo = tipo;
   }

    //getter
    public String getTipo() {
        return tipo;
    }


    @Override
    public String toString() {
        return "Pergaminho: " + tipo;
    }
}
