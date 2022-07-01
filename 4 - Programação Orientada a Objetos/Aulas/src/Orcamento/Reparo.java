package Orcamento;

public class Reparo {
    private String nome;
    private double custo;
    private String endereco;
    private Estados estado;

    public Reparo(String nome){
        this.estado = new Orcamento(this);
        this.nome = nome;
        this.custo=0;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getCusto() {
        return custo;
    }


    public void setEstado(Estados estado) {
        this.estado = estado;
    }
}
