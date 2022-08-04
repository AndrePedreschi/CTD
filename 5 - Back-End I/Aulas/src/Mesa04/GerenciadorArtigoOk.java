package Mesa04;

public class GerenciadorArtigoOk extends Gerenciador{


    @Override
    public void verificar(Artigo artigo) {
        System.out.println("Artigo "+artigo.getNome()+" passou nos testes de qualidade");
    }
}
