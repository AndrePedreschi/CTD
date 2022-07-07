package Checkpoint02;

enum Status {
    CALCULANDO("Calculando"),
    CONSTRUCAO("Construção"),
    ACABADO("Acabado");

    private String descricao;

    Status(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

}
