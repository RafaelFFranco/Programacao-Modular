package entidades;

import java.time.LocalDate;

public class Funcionario {
    private String nome;
    private String sexo;
    private LocalDate dataNascimento;

    //Construtor
    public Funcionario(String nome, String sexo, LocalDate dataNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    // Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }


    public String getSexo(){
        return sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }


    public LocalDate getDataNascimento(){
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }
}


