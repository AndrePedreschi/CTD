package Orcamento;

import java.util.List;

public interface Estados {
    void valorOrcamentos(double valor);
    void somaPecaReposicao(List<PecaReposicao> pecas);
    void mudarEndereco(String edereco);
    void mudarEstado();
}
