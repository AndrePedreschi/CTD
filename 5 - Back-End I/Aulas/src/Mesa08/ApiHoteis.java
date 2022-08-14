package Mesa08;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ApiHoteis {


    List<String> hoteis = Arrays.asList();

    public ApiHoteis(List<String> hoteis) {
        this.hoteis = hoteis;
        hoteis.add(1,"Hotel1");
        hoteis.add(2,"Hotel2");
        hoteis.add(3,"Hotel3");

        /*hoteis.getHoteis(r.nextInt(hoteis.size()));

         */
    }


    public List<String> getHoteis() {
        return hoteis;
    }

    public void setHoteis(List<String> hoteis) {
        this.hoteis = hoteis;
    }

    Random r = new Random();








}
