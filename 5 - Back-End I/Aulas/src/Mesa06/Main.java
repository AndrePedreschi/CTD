package Mesa06;


public class Main {
    public static void main(String[] args) {
        try {
            SerieProxy serieProxy = new SerieProxy();
            String link = serieProxy.pedeSerie("StrangerThings");
            System.out.println(link);
            link = serieProxy.pedeSerie("PeakyBlinders");
            System.out.println(link);
            link = serieProxy.pedeSerie("TheBoys");
            System.out.println(link);
            link = serieProxy.pedeSerie("PousandonoAmor");
            System.out.println(link);
            link = serieProxy.pedeSerie("Bridgerton");
            System.out.println(link);
            link = serieProxy.pedeSerie("Ozark");
            System.out.println(link);


        } catch (SerieNaoHabilitadaExcepition e) {
            System.out.println(e.getMessage());
        }
    }
}
