package Aula12;

public abstract class Funcionario {
    private String nome;
    private Double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public abstract void addAumento(Double valor);
    public abstract void ganhoAnual();
    public abstract void exibeDados();


}
