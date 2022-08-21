package Mesa07;

import java.util.Objects;

public class Arvore {
    private String categoria;
    private int altura;
    private int largura;
    private String cor;

    public Arvore(String categoria) {
        this.categoria = categoria;


        if(Objects.equals(this.categoria, "Ornamental")){
            this.altura = 200;
            this.largura = 400;
            this.cor = "verde";
        }
        if(Objects.equals(this.categoria, "Frutífera")){
            this.altura = 500;
            this.largura = 300;
            this.cor = "vermelho";
        }
        if(Objects.equals(this.categoria, "Florífera")){
            this.altura = 100;
            this.largura = 200;
            this.cor = "azul";
        }


    }


    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getLargura() {
        return largura;
    }

    public void setLargura(int largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }




}
