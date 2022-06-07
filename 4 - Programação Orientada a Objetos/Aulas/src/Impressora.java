import java.time.LocalDate;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private LocalDate dataFabricacao;
    private int folhasDisponiveis;

    public Impressora(
            String modelo,
            String tipoConexao,
            LocalDate dataFabricacao
    ) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = 0;
    }

    public Impressora(
            String modelo,
            String tipoConexao,
            LocalDate dataFabricacao,
            int folhasDisponiveis
    ) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.dataFabricacao = dataFabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public int getFolhasDisponiveis() {
        return folhasDisponiveis;
    }

    public void setFolhasDisponiveis(int folhasDisponiveis) {
        this.folhasDisponiveis = folhasDisponiveis;
    }

    private boolean temPapel() {
        return this.folhasDisponiveis > 0;
    }

    public void imprimir(String texto) {
        if (temPapel()) {
            System.out.println("Imprimiu " + texto);
            folhasDisponiveis--;
        } else {
            System.out.println("Não tem papel");
        }
    }










    public static void main(String[] args) {
        Impressora impressoraSemPapel = new Impressora(
                "HP",
                "Sem fio",
                // Pode também ser usado:
                // LocalDate.of(2022, 5, 25),
                // LocalDate.of(2022, Month.MAY, 25),
                // LocalDate.parse("2022-05-25"),
                // LocalDate.parse("25/05/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                // LocalDate.now() -> data corrente
                LocalDate.parse("2022-05-25")
        );

        Impressora impressoraComPapel = new Impressora(
                "Epson",
                "Sem fio",
                LocalDate.now(),
                10
        );

        impressoraSemPapel.setFolhasDisponiveis(2);
        impressoraSemPapel.imprimir("teste");
        impressoraComPapel.imprimir("teste2");
    }
}