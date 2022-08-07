package Aula06;

public interface IGradeDeFilmes {
    public Filme getFilme(String nomeDoFilme) throws FilmeNaoHabilitadoException;
}
