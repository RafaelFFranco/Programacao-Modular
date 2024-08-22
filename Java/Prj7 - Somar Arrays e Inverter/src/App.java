import java.util.Scanner;

public class App {
    public static int[] somarArrays(int arrayA[], int arrayB[]) {
        int arrayC[] = new int[arrayA.length];

        for (int i = 0; i < arrayA.length; i++) {
            arrayC[i] = arrayA[i] + arrayB[i];
        }

        return arrayC;
    }

    public static void setArray(int arrayA[]) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("Digite valor " + (i + 1) + " do Array: ");
            arrayA[i] = scan.nextInt();
        }
    }

    public static void inverterArray(int arrayA[]) {
        for (int i = arrayA.length - 1; i >= 0; i--) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int tamanho;

        System.out.println("Tamanho array: ");
        tamanho = scan.nextInt();

        int arrayUm[] = new int[tamanho];
        int arrayDois[] = new int[tamanho];
        int arrayTres[];

        setArray(arrayUm);
        System.out.println("Array 2");
        setArray(arrayDois);

        arrayTres = somarArrays(arrayUm, arrayDois);

        System.out.println("Array somado invertido: ");
        inverterArray(arrayTres);

        scan.close();
    }
}
