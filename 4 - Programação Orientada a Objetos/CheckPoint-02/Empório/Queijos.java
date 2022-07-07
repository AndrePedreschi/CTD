package Empório;

public class Queijos extends Produtos{

    public Queijos(String nome, Double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void realizarVenda(Integer qtd) {
        super.realizarVenda(qtd);
    }
}
