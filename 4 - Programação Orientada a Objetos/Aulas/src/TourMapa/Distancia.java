package TourMapa;



public class Distancia {

    private double distancia;
    private double latitude1;
    private double latitude2;
    private double longitude1;
    private double longitude2;

    public Distancia(double latitude1, double latitude2, double longitude1, double longitude2) {
        this.latitude1 = latitude1;
        this.latitude2 = latitude2;
        this.longitude1 = longitude1;
        this.longitude2 = longitude2;

        calculaDistancia();
    }

    public double getDistancia() {
        return distancia;
    }

    public double calculaDistancia(){
        distancia = Math.abs(latitude1-latitude2)+ Math.abs(longitude1-longitude2);
        return distancia;

    }

}
