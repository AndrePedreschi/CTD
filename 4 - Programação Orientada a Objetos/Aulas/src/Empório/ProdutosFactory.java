package Empório;

public class ProdutosFactory {
    private static ProdutosFactory instance;

    private ProdutosFactory(){};

    public Produtos criarProduto(String tipo, String nome, Double preco, Integer quantidade){
        if (tipo.equals("VINHO")){
            return new Vinhos(nome, preco, quantidade);
        } else if (tipo.equals("QUEIJO")){
            return  new Queijos(nome, preco, quantidade);
        }else if(tipo.equals("GELEIA")){
            return new Geleias(nome, preco, quantidade);
        }else{
            throw new RuntimeException("O tipo não existe");
        }
    }

    public static ProdutosFactory getInstance(){
        if (instance==null){
            instance = new ProdutosFactory();
        }
        return instance;
    }

}
