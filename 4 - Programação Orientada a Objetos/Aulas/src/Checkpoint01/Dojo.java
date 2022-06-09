package Checkpoint01;

import java.util.List;

public class Dojo {
    private String nome;
    private String endereco;
    private Double valorAluguel;
    private Double custoTotal;
    private Double custoFuncionarios;
    private List<Funcionarios> funcionario;
    private List<Alunos> alunos;

    public Dojo(String nome, String endereco, Double valorAluguel, Double custoTotal, Double custoFuncionarios, List<Funcionarios> funcionario, List<Alunos> alunos) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;
        this.custoTotal = custoTotal;
        this.custoFuncionarios = custoFuncionarios;
        this.funcionario = funcionario;
        this.alunos = alunos;
    }

    public double calcularDustoTotal(){
        return this.custoTotal = valorAluguel+ custoFuncionarios;
    }


}
