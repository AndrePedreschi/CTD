package Orcamento;

import java.util.List;

public class Finalizado implements Estados{
    private Reparo reparo;
    public Finalizado(Reparo reparo){
        this.reparo = reparo;
    }



    @Override
    public void valorOrcamentos(double valor) {
        throw new IllegalStateException("Você não pode mudar o valor");
    }

    @Override
    public void mudarEndereco(String edereco) {
        throw new IllegalStateException("Você não pode mudar o endereço");
    }

    @Override
    public void mudarEstado() {
    throw new IllegalStateException("Acabou, você não pode mudar o estado");
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Você não pode mudar a soma das peças");
    }
}
