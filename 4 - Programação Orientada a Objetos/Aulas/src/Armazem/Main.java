package Armazem;

public class Main {
    public static void main(String[] args) {
        Armazem armazemPeruibe = new Armazem();
        ProdutoFactory pf = ProdutoFactory.getInstance();

        Produto bolaFut1 = pf.criarProduto(17.0, "FUTEBOL");
        System.out.println(bolaFut1.calcularEspaco());
        Produto bolaFut2 = pf.criarProduto(17.0, "FUTEBOL");
        System.out.println(bolaFut2.calcularEspaco());
        Produto bolaFut3 = pf.criarProduto(17.0, "FUTEBOL");
        System.out.println(bolaFut3.calcularEspaco());
        Produto bolaFut4 = pf.criarProduto(17.0, "FUTEBOL");
        System.out.println(bolaFut4.calcularEspaco());
        Produto bolaFut5 = pf.criarProduto(17.0, "FUTEBOL");
        System.out.println(bolaFut5.calcularEspaco());

        Produto bolaTenis1 = pf.criarProduto(0.025, "BOLATENIS");
        System.out.println(bolaTenis1.calcularEspaco());
        Produto bolaTenis2 = pf.criarProduto(0.025, "BOLATENIS");
        System.out.println(bolaTenis2.calcularEspaco());
        Produto bolaTenis3 = pf.criarProduto(0.025, "BOLATENIS");
        System.out.println(bolaTenis3.calcularEspaco());
        Produto bolaTenis4 = pf.criarProduto(0.025, "BOLATENIS");
        System.out.println(bolaTenis4.calcularEspaco());
        Produto bolaTenis5 = pf.criarProduto(0.025, "BOLATENIS");
        System.out.println(bolaTenis5.calcularEspaco());

        Produto caixa1= pf.criarProduto(0.35, "CAIXA10X10");
        System.out.println(caixa1.calcularEspaco());
        Produto caixa2 = pf.criarProduto(0.35, "CAIXA10X10");
        System.out.println(caixa2.calcularEspaco());
        Produto caixa3 = pf.criarProduto(0.35, "CAIXA10X10");
        System.out.println(caixa3.calcularEspaco());
        Produto caixa4 = pf.criarProduto(0.35, "CAIXA10X10");
        System.out.println(caixa4.calcularEspaco());
        Produto caixa5 = pf.criarProduto(0.35, "CAIXA10X10");
        System.out.println(caixa5.calcularEspaco());

        /*
        Produto erro = pf.criarProduto(90.5, "Pandorinha");
        System.out.println(erro.calcularEspaco());
         */

        armazemPeruibe.addProduto(bolaFut1);
        armazemPeruibe.addProduto(bolaFut2);
        armazemPeruibe.addProduto(bolaFut3);
        armazemPeruibe.addProduto(bolaFut4);
        armazemPeruibe.addProduto(bolaFut5);

        armazemPeruibe.addProduto(bolaTenis1);
        armazemPeruibe.addProduto(bolaTenis2);
        armazemPeruibe.addProduto(bolaTenis3);
        armazemPeruibe.addProduto(bolaTenis4);
        armazemPeruibe.addProduto(bolaTenis5);

        armazemPeruibe.addProduto(caixa1);
        armazemPeruibe.addProduto(caixa2);
        armazemPeruibe.addProduto(caixa3);
        armazemPeruibe.addProduto(caixa4);
        armazemPeruibe.addProduto(caixa5);

        armazemPeruibe.calcularEspacoNecessario();
    }
}
