package CarrinhoCompras;

public class Vazio implements Estados{

    private CarrinhoCompras carrinhoCompras;

    public Vazio(CarrinhoCompras carrinhoCompras){
        this.carrinhoCompras = carrinhoCompras;
    }



    @Override
    public void adicionarProduto(Produto produto) {
        throw new IllegalStateException("Vá para o proximo estado para adicionar os produtos ao carrinho!");
    }

    @Override
    public void cancelarCarrinho() {
        carrinhoCompras.removeProduto();
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
    }

    @Override
    public void voltarEstado() {
        throw new IllegalStateException("Vá para o próximo estado ou cancele a compra!");
    }

    @Override
    public void proximoEstado() {
        System.out.println("Indo para Carregando!");
        carrinhoCompras.setEstado(new Carregando(carrinhoCompras));

    }
}
