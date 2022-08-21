package Mesa07;

import java.util.HashMap;
import java.util.Map;

public class ArvoreFactory {

    private static Map<String, Arvore> cores = new HashMap<>();


    public Arvore plantar(String categoria){

        if (!cores.containsKey(categoria)){
            cores.put(categoria, new Arvore(categoria));
            System.out.println("Arvore "+categoria+" adicionada");
            return cores.get(categoria);
        }
        System.out.println("Arvore "+categoria+" já existente");
        return  cores.get(categoria);
    }
}
