package Aula10_Logger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{

        //Alternativa para configurar o log4j.properties
        BasicConfigurator.configure();

        Leao leao = new Leao("Simba", 8, true);
        leao.correr();
        leao.eMaiorQue10();

        Leao leao2 = new Leao("Mufasa", 11, true);
        leao2.correr();


        try{
            leao2.eMaiorQue10();
        }catch (Exception e){
            logger.error("A idade do leão "+leao2.getNome()+" está incorreta", e);
        }


    }
}
