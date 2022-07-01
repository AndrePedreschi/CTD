package CarrinhoCompras;

public class Main {

    public static void main(String[] args) {
        CarrinhoCompras carrinhoCompras = new CarrinhoCompras();
        //Inicia em vazio
        //Vai para Carregando
        carrinhoCompras.proximoEstado();

        carrinhoCompras.adicionarProduto(new Produto("Paçoca",2.25));
        carrinhoCompras.adicionarProduto(new Produto("Doce de leite",1.00));
        carrinhoCompras.adicionarProduto(new Produto("Doce de batata",0.75));
        carrinhoCompras.adicionarProduto(new Produto("Doce de abóbora",0.75));
        carrinhoCompras.adicionarProduto(new Produto("Pé de moleque",1.50));
        carrinhoCompras.adicionarProduto(new Produto("Pé de moça",1.75));
        carrinhoCompras.adicionarProduto(new Produto("Pamonha",5.00));

        System.out.println(carrinhoCompras.getProdutos());

        //Vai para Pagando
        carrinhoCompras.proximoEstado();
        //Vai para Fechado
        carrinhoCompras.proximoEstado();
        //Volta ao início com o carrinho vazio
        carrinhoCompras.proximoEstado();

        //Confirmação que o carrinho está vazio mesmo
        System.out.println(carrinhoCompras.getProdutos());
    }
}
