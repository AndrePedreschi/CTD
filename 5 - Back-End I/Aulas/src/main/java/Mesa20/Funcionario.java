package Mesa20;

import java.io.Serializable;

public class Funcionario implements Serializable{

    private String nome;
    private String sobrenome;
    private String cpf;
    private Double salario;

    public Funcionario(String nome, String sobrenome, String cpf, Double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return nome + ';'+
                sobrenome + ';'+
                cpf + ';'+
                salario;
    }
}
