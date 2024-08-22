package application;


import entidades.CadastroFuncionarios;
import java.util.Scanner;



public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int escolha;

        CadastroFuncionarios cadastro = new CadastroFuncionarios();  
      


       do{
        System.out.println("Sistema de Funcionários");
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Listar Funcionários");
        System.out.println("0 - Sair");
        escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                cadastro.cadastroFuncionario();
                break;
            case 2:
                cadastro.listarFuncionarios();
                break;
            case 0:
            System.out.println("Saindo...");
                break;
            default:
            System.out.println("Opção inválida!");
                break;
        }

       }while(escolha != 0);

       scanner.close();
    }
}
