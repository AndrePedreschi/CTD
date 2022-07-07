package Empório;

public class Main {
    public static void main(String[] args) {
        Emporio Emporio_Sao_Luiz = new Emporio();
        ProdutosFactory pf_Matriz = ProdutosFactory.getInstance();

        //criar produtos do armazem
        Produtos vinho1 = pf_Matriz.criarProduto("VINHO", "Vinho Gato Negro", 145.35, 30);
        Produtos queijo1 = pf_Matriz.criarProduto("QUEIJO","Queijo Canastra", 42.50, 25);
        Produtos geleia1 = pf_Matriz.criarProduto("GELEIA","Geléia Turma da Mônica", 10.70, 40);

        //teste do erro de RuntimeException
        //Produtos testeErroQueijo = pf_Matriz.criarProduto("keijo","Queijo de teste de tipo errado", 125.50, 1000);

        //adicionar produtos no armazem
        Emporio_Sao_Luiz.addProdutos(vinho1);
        Emporio_Sao_Luiz.addProdutos(queijo1);
        Emporio_Sao_Luiz.addProdutos((geleia1));

        //verificar quantidade de cada produto no armazém, lista ordenada pela quantidade de cada produto
        Emporio_Sao_Luiz.listaArmazem();

        //realiza a vende de um produto e diminuí ele na quantidade do armazem
        vinho1.realizarVenda(10);
        queijo1.realizarVenda(15);
        geleia1.realizarVenda(5);

        Emporio_Sao_Luiz.listaArmazem();



    }
}
