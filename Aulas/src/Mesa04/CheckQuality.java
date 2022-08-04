package Mesa04;

public class CheckQuality {

    Gerenciador inicial;
    public CheckQuality(){
        this.inicial = new GerenciadorLote();
        Gerenciador peso = new GerenciadorPeso();
        Gerenciador embalagem = new GerenciadorEmbalagem();
        Gerenciador artigoOk = new GerenciadorArtigoOk();

        inicial.setSeguinte(peso);
        peso.setSeguinte(embalagem);
        embalagem.setSeguinte(artigoOk);
    }

    public void verificar(Artigo artigo){ inicial.verificar(artigo);}


}
