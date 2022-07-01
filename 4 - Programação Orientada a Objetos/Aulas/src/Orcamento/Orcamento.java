package Orcamento;

import java.util.List;

public class Orcamento implements Estados{

    private Reparo reparo;
    public Orcamento(Reparo reparo){
        this.reparo = reparo;
    }
    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Você precisa estar no estado de reparo");
    }

    @Override
    public void mudarEndereco(String endereco) {
        throw new IllegalStateException("Você não pode mudar o endereço");
    }

    @Override
    public void valorOrcamentos(double valor) {
    this.reparo.setCusto(valor);
    }

    @Override
    public void mudarEstado() {
        reparo.setEstado(new Reparacao(reparo));
    }
}
