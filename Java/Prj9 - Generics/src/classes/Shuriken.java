package classes;

public class Shuriken {
   private int quantidade;


    //Construtor
    public Shuriken(int quantidade) {
        this.quantidade = quantidade;
    }

    //Getter
    public int getQuantidade(){
        return quantidade;
    }

    @Override
    public String toString() {
        return "Quantidade de Shurikens: " + quantidade;
    }
}
