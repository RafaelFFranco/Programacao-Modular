import java.util.Scanner;

public class App {

    public static int[] ordenarVetor(int trio[]){
        int maiorNumero = 0;
        int menorNumero = 0;
        int numeroMedio = 0;
        

        for(int i = 0; i < trio.length; i++){
            maiorNumero = trio[0];
            if (trio[i]> maiorNumero) {
                maiorNumero = trio[i];
            }
        }
        for(int i = 0; i < trio.length; i++){
            menorNumero = trio[0];
            if (trio[i]< menorNumero) {
                menorNumero = trio[i];
            }
        }
        for(int i = 0; i < trio.length; i++){
            if (trio[i] != menorNumero || trio[i] != maiorNumero) {
                trio[i] = numeroMedio;
            }
        }

        int vetorOrdenado[] = {menorNumero, numeroMedio, maiorNumero}; 

        return vetorOrdenado;
    }
    public static void main(String[] args) throws Exception {
        String vetorNumerosString [] = new String[3];
        Scanner scan = new Scanner(System.in);
        String numeros;

        System.out.println("Insira 3 números: ");
        numeros = scan.nextLine();

        vetorNumerosString = numeros.split(" ");
        
        System.out.println(vetorNumerosString);

        

    }
}
