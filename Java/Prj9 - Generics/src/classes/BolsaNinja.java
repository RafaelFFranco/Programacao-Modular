package classes;


import java.util.ArrayList;
import java.util.List;


public class BolsaNinja<T> {

    //Inicializar Array generico
    private List<T> itens;

    //Construtor
    public BolsaNinja() {
        this.itens = new ArrayList<>();
    }

    //Colocar itens no Array
    public void addItem(T item) {
        itens.add(item);
    }

    //Mostrar lista
    public void getItens() {
        for (T item : itens) {
            System.out.println(item);
        }
    }


}


