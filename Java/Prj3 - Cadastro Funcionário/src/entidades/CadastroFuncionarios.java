package entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadastroFuncionarios {
    private List<Funcionario> funcionarios = new ArrayList<>();

    public void cadastroFuncionario() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome:");
        String nome = scanner.nextLine();

        System.out.println("Sexo:");
        String sexo = scanner.nextLine();

        System.out.println("Data de nascimento (DD-MM-AAAA):");
        String data = scanner.nextLine();
        LocalDate dataDeNascimento = LocalDate.parse(data);
    
        Funcionario funcionario = new Funcionario(nome, sexo, dataDeNascimento);
        funcionarios.add(funcionario);    

        scanner.close();
    }

    public void listarFuncionarios(){
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
        } else {
            for (Funcionario f : funcionarios) {
                System.out.println(f);
            }
        }
    }



}
