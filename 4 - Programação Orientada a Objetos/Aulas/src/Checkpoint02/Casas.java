package Checkpoint02;

import java.time.LocalDate;

public class Casas extends Projeto{

    private Double tamTerreno;
    private Integer numBanheiro;
    private Integer numQuartos;

    public Casas(String endereco, LocalDate dataInicio, LocalDate dataTerminoPrevisto, LocalDate dataTerminoReal, Number numIdent, String nome, String cidade, Status status, Double tamTerreno, Integer numBanheiro, Integer numQuartos) {
        super(endereco, dataInicio, dataTerminoPrevisto, dataTerminoReal, numIdent, nome, cidade, status);
        this.tamTerreno = tamTerreno;
        this.numBanheiro = numBanheiro;
        this.numQuartos = numQuartos;
    }

    @Override
    public void terminoData() {
        super.terminoData();
    }
}
