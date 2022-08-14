package Mesa08;

import java.util.Date;

public class FacadeTurismo implements IFacadeTurismo{
    //armazenam nas variáveis uma instância de cada uma delas
    private ApiHoteis apiHoteis;
    private ApiVoos apiVoos;

    //construtor que vai criar as minhas instâncias


    /*public FacadeTurismo() {
        apiHoteis = new ApiHoteis();
        apiVoos = new ApiVoos();
    }

     */

    @Override
    public String buscar(Date dataEntrada, Date dataSaida, String localDestino) {
        return null;
    }
}
