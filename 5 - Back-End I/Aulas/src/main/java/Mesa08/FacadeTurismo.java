package Mesa08;

public class FacadeTurismo implements IFacadeTurismo{
    //armazenam nas variáveis uma instância de cada uma delas
    private ApiHotel apiHotel;
    private ApiVoo apiVoo;

    //construtor que vai criar as minhas instâncias


    public FacadeTurismo() {
        apiHotel = new ApiHotel();
        apiVoo = new ApiVoo();
    }



    @Override
    public Viagem buscar(Viagem viagem) {
        viagem.setCompanhia(apiVoo.buscarVoo(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getOrigem(), viagem.getDestino()));
        viagem.setHotel(apiHotel.buscarHotel(viagem.getDataPartida(), viagem.getDataRetorno(), viagem.getDestino()));
        return viagem;
    }
}
