package Mesa08;

import java.util.Date;

public class Hoteis {
    Date dataEntrada;
    Date dataSaída;
    private String cidade;

    public Hoteis(Date dataEntrada, Date dataSaída, String cidade) {
        this.dataEntrada = dataEntrada;
        this.dataSaída = dataSaída;
        this.cidade = cidade;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(Date dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public Date getDataSaída() {
        return dataSaída;
    }

    public void setDataSaída(Date dataSaída) {
        this.dataSaída = dataSaída;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
