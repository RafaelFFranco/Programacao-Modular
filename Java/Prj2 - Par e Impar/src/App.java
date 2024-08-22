
import java.util.Scanner;


public class App {
    public static boolean EPar(int numero){
        boolean resultado;
        if (numero % 2 == 0) {
            resultado = true;
        }else{
            resultado = false;
        }
        return resultado;
    }

    public static void main(String[] args){

        int array[] = new int[5];
        int arrayParImpar[] = new int[2];
        int tamanho = array.length;
        Scanner leitor = new Scanner(System.in);

        for(int i = 0; i < tamanho; i++){
            System.out.println("Digite um valor:");
            array[i] = Integer.parseInt(leitor.nextLine());
        }

        for(int j = 0; j < tamanho; j++){
            
            if (EPar(array[j]) == true) {
                arrayParImpar[0] += 1;
            }else{
                arrayParImpar[1] += 1;
            }
        }
        
        System.out.println("Quantidade de números pares: " + arrayParImpar[0]);
        System.out.println("Quantidade de números ímpares: " + arrayParImpar[1]);
        
    }
}
