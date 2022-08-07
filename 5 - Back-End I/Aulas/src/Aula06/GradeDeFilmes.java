package Aula06;

public class GradeDeFilmes implements IGradeDeFilmes{


    @Override
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException {
        Filme f = null;

        switch (nomeDoFilme)
        {
            case "The White Tiger":
                f = new Filme("The White Tiger", "ARG", "www.wtiger.com");
                break;
            case "His Houser":
                f = new Filme("His Houser", "BRA", "www.hhouser.com");
                break;
            case "Over The Moon":
                f = new Filme("Over The Moon", "COL", "www.oomoon.com");
                break;
            case "SuperBad":
                f = new Filme ("SuperBad", "ARG", "www.sbad.com");
                break;
            case "The Babysitter":
                f = new Filme ("The Babysitter", "COL", "www.babys.com");
                break;
        }
        return f;
    }
}
