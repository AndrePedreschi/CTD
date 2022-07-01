package CarrinhoCompras;

public interface Estados {
    void adicionarProduto (Produto produto);
    void cancelarCarrinho();
    void voltarEstado();
    void proximoEstado();

}
