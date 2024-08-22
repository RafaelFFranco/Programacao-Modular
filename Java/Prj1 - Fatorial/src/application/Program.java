package application;

import java.util.Scanner;

public class Program {
    public static int Fatorial(int numero){
        int fatorial = 1;
        for(int i = 1; i<=numero; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] array = new int[15];

        for(int i = 0; i < 15; i++){
            System.out.println("Digite um valor:");
            array[i] = Integer.parseInt(leitor.nextLine());
        }

        for(int j = 0; j < 15; j++ ){
            array[j] = Fatorial(j);
            System.out.println(array[j]);
        }

    }
}
