package Aula12;

public class Teste {
    public static void main(String[] args) {
        Tecnico tecnico1 = new Tecnico("Renata", 3500.00,"0123219",1000.00);
        tecnico1.exibeDados();

        Tecnico tecnico2 = new Tecnico("Tabata", 2500.00,"0123220",0.0);
        tecnico2.exibeDados();


        Administrativo administrativo1 = new Administrativo("Kleber",2000.0,"0259734",true, 0.4);
        administrativo1.exibeDados();

        Administrativo administrativo2 = new Administrativo("Karen",2750.0,"0259745",false, 0.4);
        administrativo2.addAumento(700.0);
        administrativo2.exibeDados();

    }



}
