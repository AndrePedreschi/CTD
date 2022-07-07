package Empório;

public abstract class Produtos implements Comparable<Produtos> {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produtos(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void realizarVenda(Integer qtd) {
        if (qtd > this.quantidade) {
            System.out.println("Temos apenas " + getQuantidade() + " itens no estoque!");
            throw new RuntimeException("Não pode vender mais do que tem no estoque");
        } else {
            setQuantidade(quantidade-qtd);
            System.out.println("Estoque de "+nome+" atualizado para "+ getQuantidade() + " itens");
        }
    }

    @Override
    public String toString() {
        return  "nome='" + nome  + ", quantidade=" + quantidade + '\n';
    }

    @Override
    public int compareTo(Produtos o) {
        if(this.quantidade> o.quantidade) return 1;
        if(this.quantidade<o.quantidade) return -1;
        return 0;
    }


}
