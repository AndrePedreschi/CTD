package Prova1;



public class Hotel {
    private Integer id;
    private String nomeFilial;
    private String rua;
    private Integer numero;
    private String cidade;
    private String estado;
    private boolean cincoEstrelas;

    public Hotel(Integer id, String nomeFilial, String rua, Integer numero, String cidade, String estado, boolean cincoEstrelas) {
        this.id = id;
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Hotel(String nomeFilial, String rua, Integer numero, String cidade, String estado, boolean cincoEstrelas) {
        this.nomeFilial = nomeFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cincoEstrelas = cincoEstrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeFilial() {
        return nomeFilial;
    }

    public void setNomeFilial(String nomeFilial) {
        this.nomeFilial = nomeFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isCincoEstrelas() {
        return cincoEstrelas;
    }

    public void setCincoEstrelas(boolean cincoEstrelas) {
        this.cincoEstrelas = cincoEstrelas;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "id=" + id +
                ", nomeFilial='" + nomeFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cincoEstrelas=" + cincoEstrelas +
                '}';
    }
}




