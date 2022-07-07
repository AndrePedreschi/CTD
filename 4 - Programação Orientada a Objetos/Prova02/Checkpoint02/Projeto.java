package Checkpoint02;

import java.time.LocalDate;


public abstract class Projeto {
    private String endereco;
    private LocalDate dataInicio;
    private LocalDate dataTerminoPrevisto;
    private LocalDate dataTerminoReal;
    private Number numIdent;
    private String nome;
    private String cidade;
    private Status status;

    public Projeto(String endereco, LocalDate dataInicio, LocalDate dataTerminoPrevisto, LocalDate dataTerminoReal, Number numIdent, String nome, String cidade, Status status) {
        this.endereco = endereco;
        this.dataInicio = dataInicio;
        this.dataTerminoPrevisto = dataTerminoPrevisto;
        this.dataTerminoReal = dataTerminoReal;
        this.numIdent = numIdent;
        this.nome = nome;
        this.cidade = cidade;
        this.status = status;
    }


    public void terminoData(){
        if(this.dataTerminoPrevisto.isEqual(this.dataTerminoReal) && this.status.getDescricao() == "Acabado"){
            System.out.println("Projeto terminou na data correta!");
        }else{
            System.out.println("Projeto não terminou na data prevista");
        }

    }
}
