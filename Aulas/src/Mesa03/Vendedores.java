package Mesa03;
//validdação que usa propriedades de subclasse apenas
//Classe abstrata Vendedor - aqui vai o Template Method
public abstract class Vendedores {

    protected String nome;
    protected int vendas = 0;
    protected int pontos_por_venda;

    public void vender(int qtdVendas){
        this.vendas+=qtdVendas;
        System.out.println(this.nome+" realizou "+qtdVendas+" vendas...");
    }

    public abstract int calcularPontos();

    public String mostrarCategoria(){
        int pontosVendedor = calcularPontos();
        return this.nome+" tem um total de "+pontosVendedor+" pontos e categoriza como "+getNomeCategoria(pontosVendedor);
    }

    //Recebo os pontos e informo uma categorização
    private String getNomeCategoria(int pontosVendedor){
        if(pontosVendedor<20){
            return "Vendedor Novato";
        }else if (pontosVendedor<31){
            return "Vendedor Aprendiz";
        }else if(pontosVendedor<41){
            return "Vendedor Bom";
        }else{
            return "Vendedor Mestre";
        }
    }
}
