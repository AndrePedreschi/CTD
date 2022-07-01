package CarrinhoCompras;

public class Produto {
    private String descricao;
    private Double preco;

    public Produto(String descricao, Double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }


    public String getDescricao() {
        return descricao;
    }

    public Double getPreco() {
        return preco;
    }


    @Override
    public String toString() {
        return "Produto{" +
                "descricao='" + descricao + '\'' +
                ", preco=" + preco +
                '}'+"\n";
    }
}
