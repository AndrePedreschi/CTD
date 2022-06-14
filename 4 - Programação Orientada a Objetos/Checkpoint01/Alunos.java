package Checkpoint01;



public class Alunos {
    private String nome;
    private String nomeGuerra;
    private String email;
    private String telefone;
    private String modalidade;
    private int numeroModalidade;
    private Double taxaDojo;
    private Boolean atestadoMadicoValido;

    public Alunos(String nome, String nomeGuerra, String email, String telefone, String modalidade, int numeroModalidade, Boolean atestadoMadicoValido) {
        this.nome = nome;
        this.nomeGuerra = nomeGuerra;
        this.email = email;
        this.telefone = telefone;
        this.modalidade = modalidade;
        this.numeroModalidade = numeroModalidade;
        this.atestadoMadicoValido = atestadoMadicoValido;
    }

    public Double calcularTaxaDojo(){
        return this.taxaDojo = numeroModalidade * 175.00;
    }



    @Override
    public String toString(){
        return "Aluno: " + nome + "\n" +
                "Nome de guerra: " + nomeGuerra + "\n" +
                "Email: "+ email +"\n"+
                "Telefone: "+telefone +"\n"+
                "Faz as seguintes atividades: "+ modalidade +"\n"+
                "Taxa Dojo do Aluno: "+ taxaDojo +"\n"+
                "Atestado médico em dia: "+ atestadoMadicoValido +"\n"+
                "\n";
    }
}
