package Aula12;

public class Administrativo extends Assistente{
    private Boolean turnoNoite=false;
    private Double adicionalNoturno;

    public Administrativo(String nome, Double salario, String matricula, Boolean turnoNoite, Double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turnoNoite=turnoNoite;
        this.adicionalNoturno=adicionalNoturno;
    }

    public Boolean getTurnoNoite() {
        return turnoNoite;
    }

    @Override
    public void addAumento(Double valor) {
        //super.addAumento(valor);
        this.setSalario(this.getSalario()+valor);
    }

    @Override
    public void ganhoAnual() {
        //super.ganhoAnual();
        if (this.turnoNoite){
            System.out.printf("O ganho anual é R$ %.2f%n", (getSalario()*(1.0+adicionalNoturno))*12, " reais. ");
            System.out.println("\n");
        }else {

            System.out.printf("O ganho anual é R$ %.2f%n", getSalario()*12, " reais. \n");
            System.out.println("\n");
        }

    }

    @Override
    public void exibeDados() {
        //super.exibeDados();

        System.out.println(
                "Cargo: Assistente Administrativo \n"+
                "Nome: " + getNome() + "\n" +
                "Salario: "+getSalario()+"\n"+
                "Trabalha no turno da noite: "+getTurnoNoite()+"\n"+
                "Matricula: "+getMatricula());
        ganhoAnual();
    }
}
