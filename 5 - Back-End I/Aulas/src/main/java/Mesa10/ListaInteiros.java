package Mesa10;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class ListaInteiros {

    private static final Logger logger = Logger.getLogger(ListaInteiros.class);
    private List<Integer> listaInteiros = new ArrayList<>();
    public ListaInteiros() {
        this.listaInteiros = listaInteiros;
    }

    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    public void getSize() throws Exception{

        if (listaInteiros.size() <= 0) {
            logger.error("O comprimento da lista é menor ou igual a zero");
            throw new Exception();
        }else if (listaInteiros.size() >= 10) {
            logger.info("O comprimento da lista é maior que 10");
        } else if (listaInteiros.size() >= 5) {
            logger.info("O comprimento da lista é maior que 5");
        }

        System.out.println("A lista tem exatos "+listaInteiros.size()+" itens");
    }

    public void getAverage(){
        int conta=0;
        for( Integer listaInteiros: listaInteiros){
            conta += listaInteiros;
        }
        conta= conta/listaInteiros.size();
        logger.info("A média dos números da lista é " + conta);
    }

    public void addNumeros(Integer item){
        listaInteiros.add(item);
    }
}
