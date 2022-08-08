package Mesa05;

public class Usuario {
    private int id;
    private String tipo;

    public Usuario(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
