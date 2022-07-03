package Armazem;

public class ProdutoFactory {
    private static ProdutoFactory instance;

    private  ProdutoFactory(){};

    public Produto criarProduto(Double peso, String tipo){
        if(tipo.equals("CAIXA10X10")){
            return new Caixa(peso);
        }else if(tipo.equals("FUTEBOL")){
            return  new Bola(peso,11);
        }else if (tipo.equals("BOLATENIS")){
            return new Bola(peso, 0.32);
        }else{
            throw new RuntimeException("O tipo não existe");
        }
    };

    public static ProdutoFactory getInstance(){
        if(instance==null){
            instance = new ProdutoFactory();
        }
        return instance;
    }


}
