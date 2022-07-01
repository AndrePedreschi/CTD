package Orcamento;

import java.util.List;

public class Reparacao implements Estados{
    @Override
    public void valorOrcamentos(double valor) {
        throw new IllegalStateException("Valor já foi informado");
    }

    @Override
    public void mudarEndereco(String edereco) {

    }

    @Override
    public void mudarEstado() {

    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        double soma =0;
        for (PecaReposicao peca:pecas){
            soma+= peca.getValor();
        }
        reparo.setCusto(reparo);
    }
}
