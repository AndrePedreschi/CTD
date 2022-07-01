package CarrinhoCompras;

public class Fechado implements Estados{

    private CarrinhoCompras carrinhoCompras;

    public Fechado(CarrinhoCompras carrinhoCompras){
        this.carrinhoCompras = carrinhoCompras;
    }


    @Override
    public void adicionarProduto(Produto produto) {
        throw new IllegalStateException("Não pode mais adicionar produtos ao carrinho de compras!");
    }

    @Override
    public void cancelarCarrinho() {
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
    }

    @Override
    public void voltarEstado() {
        throw new IllegalStateException("Pagamento já foi realizado, não pode mais retornar a fase de pagamento!");
    }

    @Override
    public void proximoEstado() {
        carrinhoCompras.removeProduto();
        System.out.println("Compra finalizada, retornando a fase de carrinho vazio!");
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));

    }
}
