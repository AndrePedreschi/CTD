package CarrinhoCompras;

public class Carregando implements Estados {

    private CarrinhoCompras carrinhoCompras;

    public Carregando(CarrinhoCompras carrinhoCompras){
        this.carrinhoCompras = carrinhoCompras;
    }





    @Override
    public void adicionarProduto(Produto produto) {
        carrinhoCompras.addProduto(produto);
        System.out.println(produto + " adicionado com sucesso ao carrino de compras!");
    }

    @Override
    public void cancelarCarrinho() {
        carrinhoCompras.removeProduto();
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
    }

    @Override
    public void voltarEstado() {
        carrinhoCompras.removeProduto();
        carrinhoCompras.setEstado(new Vazio(carrinhoCompras));
    }

    @Override
    public void proximoEstado() {
        System.out.println("Indo para Pagando!");
        carrinhoCompras.setEstado(new Pagando(carrinhoCompras));
    }
}
