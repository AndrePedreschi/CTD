package Mesa10;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Aula10_Logger.Main.class);
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();

        ListaInteiros lista1 = new ListaInteiros();
        //lista1.getSize();

        lista1.addNumeros(1);
        lista1.addNumeros(2);
        lista1.addNumeros(3);
        lista1.addNumeros(4);
        lista1.addNumeros(5);
        lista1.addNumeros(6);
        lista1.getSize();
        lista1.getAverage();

        lista1.addNumeros(7);
        lista1.addNumeros(8);
        lista1.addNumeros(9);
        lista1.addNumeros(10);
        lista1.addNumeros(11);
        lista1.getSize();
        lista1.getAverage();

    }
}
