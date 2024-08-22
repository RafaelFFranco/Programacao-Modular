import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner leitor = new Scanner(System.in);
        StringBuilder fraseInvertida = new StringBuilder();

        System.out.println("Digite uma frase:");
        String palavra = leitor.nextLine();
        leitor.close();

        char[] arrayChar = palavra.toCharArray();
        int fim = palavra.length();

        // for para percorrer arraychar do final ao começo 
        for (int i = palavra.length() - 1; i >= 0; i--) {

            if (arrayChar[i] == ' ' || i == 0) {

                // se i == 0, então inicio = i. Se não, inicio = i + 1 para voltar o espaço;
                int inicio = (i == 0) ? i : (i + 1);

                // adicionar palavra para stringbuilder fraseInvertida;
                fraseInvertida.append(palavra.substring(inicio, fim));

                // colocar espaço entre as palavras;
                if (i != 0) {
                    fraseInvertida.append(" ");
                }

                fim = i;
            }
        }
        // print fraseInvertida
        System.out.println(fraseInvertida);
    }

}
