package Mesa04;

public class ProcessaQuality {

    public static void main(String[] args) {
        CheckQuality processo = new CheckQuality();

        processo.verificar(new Artigo("Paçoca",900, 900, "OK"));
        processo.verificar(new Artigo("Pé de moleque",1200, 900, "OK"));
        processo.verificar(new Artigo("Doce de Batata",1200, 1250, "OK"));
        processo.verificar(new Artigo("Doce de Abóbora",1200, 1250, "saudável"));
        processo.verificar(new Artigo("Pé de moça",1200, 1250, "quase saudável"));

    }
}
