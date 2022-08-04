package Mesa04;

public class GerenciadorLote extends Gerenciador{


    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getLote()>=1000 && artigo.getLote()<=2000){
            this.getSeguinte().verificar(artigo);
        }else {
            System.out.println("Artigo "+artigo.getNome()+" fora dos padrões de qualidade");
        }
    }
}
