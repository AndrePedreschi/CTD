package Prova1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HotelServiceTest {

    HotelService  hotelService;

    @BeforeEach
    void doBefore(){
        hotelService = new HotelService(new HotelDAOH2(new ConfiguracaoJDBC()));
    }
    @Test
    public void registrarNovaFilial(){
        Hotel hotel1 = new Hotel("Filial 1","Rua do pelourinho",1976,"Bahia","Salvador",false);
        hotelService.salvar(hotel1);
        assertTrue(hotel1.getId()!=null);

        Hotel hotel2 = new Hotel("Filial 2","Rua dos mistérios",26,"São Paulo","São Paulo",true);
        hotelService.salvar(hotel2);
        assertTrue(hotel2.getId()!=null);

        Hotel hotel3 = new Hotel("Filial 3","Rua dos amores",96,"Extrema","Minas Gerais",true);
        hotelService.salvar(hotel3);
        assertTrue(hotel3.getId()!=null);

        Hotel hotel4 = new Hotel("Filial 4","Travessa maneira ",1896,"São Paulo","São Paulo",false);
        hotelService.salvar(hotel4);
        assertTrue(hotel4.getId()!=null);

        Hotel hotel5 = new Hotel("Filial 5","Hadok Lobo",176,"Santo André","São Paulo",false);
        hotelService.salvar(hotel5);
        assertTrue(hotel5.getId()!=null);

    }
}
