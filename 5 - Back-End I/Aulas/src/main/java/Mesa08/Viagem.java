package Mesa08;
import java.time.LocalDate;

public class Viagem {

    private LocalDate dataPartida;
    private LocalDate dataRetorno;
    private String origem;
    private String destino;
    private String companhia;
    private String hotel;

    public Viagem(LocalDate dataPartida, LocalDate dataRetorno, String origem, String destino) {
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.origem = origem;
        this.destino = destino;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public LocalDate getDataPartida() {
        return dataPartida;
    }

    public LocalDate getDataRetorno() {
        return dataRetorno;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Viagem{" +
                "dataPartida=" + dataPartida +
                ", dataRetorno=" + dataRetorno +
                ", origem='" + origem + '\'' +
                ", destino='" + destino + '\'' +
                ", companhia='" + companhia + '\'' +
                ", hotel='" + hotel + '\'' +
                '}';
    }
}