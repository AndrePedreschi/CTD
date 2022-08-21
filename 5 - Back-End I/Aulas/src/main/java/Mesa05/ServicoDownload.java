package Mesa05;

public class ServicoDownload implements Spotify{

    @Override
    public void baixarMusica(String tipo, int Id, String nomeMusica) {
        System.out.println("Usuário "+Id+" autorizado a baixar a música");

    }
}
