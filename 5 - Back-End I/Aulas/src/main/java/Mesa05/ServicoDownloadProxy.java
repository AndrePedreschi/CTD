package Mesa05;

import java.util.Objects;

public class ServicoDownloadProxy implements Spotify{

    @Override
    public void baixarMusica(String tipo, int Id, String nomeMusica) {
        if (Objects.equals(tipo, "Premium")){
            ServicoDownload servicoDownload = new ServicoDownload();
            servicoDownload.baixarMusica(tipo, Id, nomeMusica);
            System.out.println("Download da música: "+nomeMusica+" iniciado");
        }else {
            System.out.println("Usuário "+Id+" não autorizado a baixar a música");
        }
    }
}
