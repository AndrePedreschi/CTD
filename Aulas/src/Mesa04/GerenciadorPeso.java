package Mesa04;

public class GerenciadorPeso extends Gerenciador{


    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getPeso()>= 1200 && artigo.getPeso()<=1300){
            this.getSeguinte().verificar(artigo);
        }else {
            System.out.println("Artigo "+artigo.getNome()+" fora dos padrões de qualidade");
        }
    }
}
