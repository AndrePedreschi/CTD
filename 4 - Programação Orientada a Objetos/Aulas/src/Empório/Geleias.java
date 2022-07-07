package Empório;

public class Geleias extends Produtos{

    public Geleias(String nome, Double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void realizarVenda(Integer qtd) {
        super.realizarVenda(qtd);
    }
}
