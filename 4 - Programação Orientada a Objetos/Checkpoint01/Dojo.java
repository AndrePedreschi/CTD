package Checkpoint01;

import java.util.ArrayList;
import java.util.List;

public class Dojo {
    private String nome;
    private String endereco;
    private Double valorAluguel;


    private List<Alunos> alunos;


    private Double balanco;
    private Double totalTaxaDojo =0.0;

    //construtor
    public Dojo(String nome, String endereco, Double valorAluguel) {
        this.nome = nome;
        this.endereco = endereco;
        this.valorAluguel = valorAluguel;

        this.alunos = new ArrayList<Alunos>();

    }
    //getter e setters
    public Double getTotalTaxaDojo() {
        return totalTaxaDojo;
    }
    public void setTotalTaxaDjo(Double totalTaxaDjo) {
        this.totalTaxaDojo = totalTaxaDjo;
    }
    public String getNome() { return nome; }

    //metodos alunos
    public List<Alunos> getAlunos() {
        return alunos;
    }
    public void addAluno(Alunos aluno){
        alunos.add(aluno);
    }



    public Double getBalanco() {
        calcularBalancoo();
        return balanco;
    }

    public Double calcularBalancoo(){
        return balanco = this.totalTaxaDojo-this.valorAluguel;
    }


}
