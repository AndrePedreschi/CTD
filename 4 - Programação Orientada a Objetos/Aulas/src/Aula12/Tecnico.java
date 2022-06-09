package Aula12;

public class Tecnico extends Assistente{
    private Double bonus;


    public Tecnico(String nome, Double salario, String matricula, Double bonus) {
        super(nome, salario, matricula);
        this.bonus=bonus;

    }

    public Double getBonus() {
        return bonus;
    }

    @Override
    public void addAumento(Double valor) {
        //super.addAumento();
    this.setSalario(this.getSalario()+valor);

    }

    @Override
    public void ganhoAnual() {
        //super.ganhoAnual();

        System.out.printf("O ganho anual é R$ %.2f%n", (getSalario() + bonus)*12, " reais. \n");
        System.out.println("\n");
    }

    @Override
    public void exibeDados() {
        //super.exibeDados();

        System.out.println( "Cargo: Assistente Técnico \n"+
                            "Nome: " + getNome() + "\n" +
                            "Salario: "+getSalario()+"\n"+
                            "Bonus: "+getBonus()+"\n"+
                            "Matricula: "+getMatricula());
        ganhoAnual();

    }
}
