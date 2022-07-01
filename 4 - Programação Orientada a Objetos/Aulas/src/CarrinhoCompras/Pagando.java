package CarrinhoCompras;

public class Pagando implements Estados{

    private CarrinhoCompras carrinhoCompras;

    public Pagando(CarrinhoCompras carrinhoCompras){
        this.carrinhoCompras = carrinhoCompras;
    }


    @Override
    public void adicionarProduto(Produto produto) {
        throw new IllegalStateException("Voce não pode mai adicionar produtos ao carrino de compras!");

    }

    @Override
    public void cancelarCarrinho() {
        carrinhoCompras.removeProduto();
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
    }

    @Override
    public void voltarEstado() {
        carrinhoCompras.setEstado(new Carregando(carrinhoCompras));
    }

    @Override
    public void proximoEstado() {
        System.out.println("Indo para Compra fechada!");
        carrinhoCompras.setEstado(new Fechado(carrinhoCompras));
    }
}
