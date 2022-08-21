package Aula08_Facade_Pattern;

public class FacadeDesconto implements IFacadeDesconto{
    //armazenam nas variáveis uma instância de cada uma delas
    private ApiCartao apiCartao;
    private ApiProduto apiProduto;
    private ApiQuantidade apiQuantidade;

    //construtor que vai criar as minhas instâncias
    public FacadeDesconto(){
        apiCartao = new ApiCartao();
        apiProduto = new ApiProduto();
        apiQuantidade = new ApiQuantidade();
    }

    //simplifica os descontos
    @Override
    public int desconto(Cartao cartao, Produto produto, int quantidade){
        int desconto = 0;
        desconto= desconto+apiQuantidade.desconto(quantidade);
        desconto=desconto+apiProduto.desconto(produto);
        desconto=desconto+ apiCartao.desconto(cartao);
        return desconto;
    }



}
