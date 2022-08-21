package Mesa08;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ApiVoo {
    public String buscarVoo(LocalDate dataPartida, LocalDate dataRetorno, String origem, String destino){
        List<String> companhias = Arrays.asList("TAM", "Gol", "Azul");
        Random r = new Random();
        return companhias.get(r.nextInt(companhias.size()));
    }
}
