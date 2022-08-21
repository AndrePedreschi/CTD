package Mesa06;

/*public class SerieProxy implements ISerie {

    private int qtdViews;

    public SerieProxy() {

        this.qtdViews = 0;
    }

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }




    @Override
    public String getSerie(String nome) {

    }


}

 */


//_ProxyPattern;

public class SerieProxy {
    private int qtdViews;

    public SerieProxy() {
        this.qtdViews = 0;
    }

    public String pedeSerie(String nome) throws SerieNaoHabilitadaExcepition {
        if (this.qtdViews > 4) {
            throw new SerieNaoHabilitadaExcepition("Excede o número de reproduções permitidas");

        }
        this.qtdViews++;
        Serie serie = new Serie();

        return serie.getSerie(nome);


    }
}
