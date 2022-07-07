package Empório;

import java.util.Set;
import java.util.TreeSet;

public class Emporio {
    private Set<Produtos> produto= new TreeSet<>();

    public void addProdutos(Produtos produtos){produto.add(produtos);}


    public void listaArmazem(){
        System.out.println(produto.toString());

    }

}
