package Aula12;

public class Assistente extends Funcionario{
    private String matricula;

    public Assistente(String nome, Double salario, String matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public void addAumento(Double valor) {

    }

    @Override
    public void ganhoAnual() {

    }

    @Override
    public void exibeDados() {


    }
}
