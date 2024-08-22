
import java.util.Scanner;

public class App {

    private static float calcularMedia(float salarioCidade, int populacao){
        return salarioCidade / populacao;
    }
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int populacao;
        float salarioTotal = 0;
        float salario;

        System.out.println("População Cidade:");
        populacao = scan.nextInt();

        for(int i = 0; i < populacao; i++){
            System.out.println("Salário:");
             salario = scan.nextFloat();
             salarioTotal += salario;
        }

        float media = calcularMedia(salarioTotal,populacao);
        System.out.println("A média do salário da população é: R$" + media);

        scan.close();
    }
}
