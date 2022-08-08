package Mesa05;

import org.junit.jupiter.api.Test;

public class UsuarioTest {

    @Test
    public void baixar(){
        Usuario user1 = new Usuario(12345, "Premium");
        Usuario user2 = new Usuario(67890, "Free");

        Spotify spotify = new ServicoDownloadProxy();

        spotify.baixarMusica(user1.getTipo(), user1.getId(), "We are the champions");
        spotify.baixarMusica(user2.getTipo(), user2.getId(), "We are the champions");


    }
}
