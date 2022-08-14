package Mesa08;

import java.util.Date;

public class Voos {
    Date dataPartida;
    Date dataRetorno;
    private String origim;
    private String destino;

    public Voos(Date dataPartida, Date dataRetorno, String origim, String destino) {
        this.dataPartida = dataPartida;
        this.dataRetorno = dataRetorno;
        this.origim = origim;
        this.destino = destino;
    }

    public Date getDataPartida() {
        return dataPartida;
    }

    public void setDataPartida(Date dataPartida) {
        this.dataPartida = dataPartida;
    }

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public String getOrigim() {
        return origim;
    }

    public void setOrigim(String origim) {
        this.origim = origim;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
