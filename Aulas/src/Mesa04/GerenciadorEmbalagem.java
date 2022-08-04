package Mesa04;

public class GerenciadorEmbalagem extends Gerenciador{

    @Override
    public void verificar(Artigo artigo) {
        if (artigo.getEmbalagem()=="saudável" || artigo.getEmbalagem()=="quase saudável"){
            this.getSeguinte().verificar(artigo);
        }else {
            System.out.println("Artigo "+artigo.getNome()+" fora dos padrões de qualidade");
        }
    }
}
