package Empório;

public class Vinhos extends Produtos{

    public Vinhos(String nome, Double preco, Integer quantidade) {
        super(nome, preco, quantidade);
    }

    @Override
    public void realizarVenda(Integer qtd) {
        super.realizarVenda(qtd);
    }
}
