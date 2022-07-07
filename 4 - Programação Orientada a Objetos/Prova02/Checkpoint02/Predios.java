package Checkpoint02;

import java.time.LocalDate;
import java.util.Date;

public class Predios extends Projeto implements Comparable<Predios>{
    private Integer numAndares;
    private Integer numAptosAndar;

    public Predios(String endereco, LocalDate dataInicio, LocalDate dataTerminoPrevisto, LocalDate dataTerminoReal, Number numIdent, String nome, String cidade, Status status, Integer numAndares, Integer numAptosAndar) {
        super(endereco, dataInicio, dataTerminoPrevisto, dataTerminoReal, numIdent, nome, cidade, status);
        this.numAndares = numAndares;
        this.numAptosAndar = numAptosAndar;
    }

    public Integer getNumAndares() {
        return numAndares;
    }

    public Integer getNumAptosAndar() {
        return numAptosAndar;
    }



    public void arranhaCeu(){
        if(this.getNumAndares() >= 15){
            System.out.println("O prédio é um Arranha-céu");
        }else{
            System.out.println("O prédio não é um arranha-céu");
        }
    }
    @Override
    public void terminoData() {
        super.terminoData();
    }

    @Override
    public int compareTo(Predios o) {

        if(this.getNumAndares()*this.getNumAptosAndar() > o.getNumAndares()*o.getNumAptosAndar()) return 1;
        if(this.getNumAndares()*this.getNumAptosAndar() < o.getNumAndares()*o.getNumAptosAndar()) return -1;

        return 0;
    }
}
