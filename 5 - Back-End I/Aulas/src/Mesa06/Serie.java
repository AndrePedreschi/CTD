package Mesa06;

public class Serie implements ISerie{

    public Serie() {
    }

    @Override
    public String getSerie(String nome) {
        return "www."+nome+".com";
    }
}
