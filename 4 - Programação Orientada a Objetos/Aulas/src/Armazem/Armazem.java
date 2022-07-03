package Armazem;

import java.util.ArrayList;
import java.util.List;

public class Armazem {
    private double volume;
    private List<Produto> produtos = new ArrayList<Produto>();

    public void addProduto(Produto produto){
        produtos.add(produto);
    }
    public void calcularEspacoNecessario(){
        for (Produto produto: produtos){
            volume += produto.calcularEspaco();
        }

        System.out.println("O volume necessário ocupar no armazém é de "+volume+"cm³");
    };




}
