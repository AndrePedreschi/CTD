package Aula13_Consulta_Transacoes_BancosDeDados;

public class Conta {
    private int id;
    private String nome;
    private String numConta;
    private Double saldo;

    public Conta(int id, String nome, String numConta, Double saldo) {
        this.id = id;
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String teste) {
        this.nome = teste;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public double aumentarSaldo(double valor){
        this.saldo +=valor;
        return this.saldo;
    }
}
