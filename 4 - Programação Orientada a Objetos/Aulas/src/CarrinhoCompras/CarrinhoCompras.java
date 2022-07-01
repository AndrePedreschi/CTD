package CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras{
    private Estados estado;
    private List<Produto> produtos;

    public CarrinhoCompras(){
        this.produtos = new ArrayList<Produto>();
        this.estado=new Vazio(this);
    }

    public void setEstado(Estados estado) {
        this.estado = estado;
    }


    public List<Produto> getProdutos() {
        return produtos;
    }
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    public void removeProduto() {
        produtos.clear();
    }



    public void adicionarProduto(Produto produto) {
       estado.adicionarProduto(produto);
    }
    public void cancelarCarrinho() {
        estado.cancelarCarrinho();
    }
    public void voltarEstado() {
        estado.voltarEstado();
    }
    public void proximoEstado() {
        estado.proximoEstado();
    }


}
