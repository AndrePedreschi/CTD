package Mesa09;

import Aula09.Triangulo;

import java.util.HashMap;

public class FlyweightFactory {
    public static final HashMap<String, Roupa> listaTamnhoXs = new HashMap<>();
    public static final HashMap<String, Roupa> listaTamnhoS = new HashMap<>();
    public static final HashMap<String, Roupa> listaTamnhoM = new HashMap<>();
    public static final HashMap<String, Roupa> listaRoupasImportadas = new HashMap<>();
    public static final HashMap<String, Roupa> listaRoupasEmMasCondicoes = new HashMap<>();
    public static final HashMap<String, Roupa> listaRoupas = new HashMap<>();

    public static Roupa obterRoupa(String tamanho, String tipo, boolean eNovo, boolean importada){
        Roupa xs = listaTamnhoXs.get(tamanho);
        Roupa s = listaTamnhoS.get(tamanho);
        Roupa m = listaTamnhoM.get(tamanho);
        Roupa importada1 = listaRoupasImportadas.get(importada);
        Roupa maCondicoes = listaRoupasEmMasCondicoes.get(eNovo);

        if(xs==null){
            xs = new Roupa(tamanho, tipo,eNovo,importada);
            listaTamnhoXs.put(tamanho, xs);
        }else{
            return xs;
        }

        if(s==null){
            s = new Roupa(tamanho, tipo,eNovo,importada);
            listaTamnhoS.put(tamanho, s);
        }else{
            return s;
        }

        if(m==null){
            m = new Roupa(tamanho, tipo,eNovo,importada);
            listaTamnhoM.put(tamanho, m);
        }else{
            return m;
        }

        if(importada1==null){
            importada1 = new Roupa(tamanho, tipo,eNovo,importada);
            listaRoupasImportadas.put(String.valueOf(importada), importada1);
        }else{
            return importada1;
        }

        if(maCondicoes==null){
            maCondicoes = new Roupa(tamanho, tipo,eNovo,importada);
            listaRoupasEmMasCondicoes.put(String.valueOf(eNovo), maCondicoes);
        }else{
            return maCondicoes;
        }
        return null;
    }
}
