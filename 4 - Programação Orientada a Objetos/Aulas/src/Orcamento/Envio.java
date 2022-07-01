package Orcamento;

import java.util.List;

public class Envio implements Estados{


    @Override
    public void valorOrcamentos(double valor) {
        throw new IllegalStateException("Orçamento já foi informado");
    }

    @Override
    public void mudarEndereco(String edereco) {
        reparo.setEndereco(endereco);
    }

    @Override
    public void mudarEstado() {
      reparo.setEstado(new Finalizado(reparo));
    }

    @Override
    public void somaPecaReposicao(List<PecaReposicao> pecas) {
        throw new IllegalStateException("Soma de peças já realizada");
    }
}
