import classes.BolsaNinja;
import classes.Kunai;
import classes.Pergaminho;
import classes.Shuriken;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();

        bolsaNinja.addItem(new Shuriken(3));
        bolsaNinja.addItem(new Kunai("Kunai Explosiva"));
        bolsaNinja.addItem(new Pergaminho("Invocação do Sapo"));

        System.out.println("Itens da Bolsa Ninja");

        bolsaNinja.getItens();

    }
}