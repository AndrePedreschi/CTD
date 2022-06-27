package Checkpoint02;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Casas casa1 = new Casas(
                "Rua dos amores, nºXX",
                LocalDate.of(2021,1,5), LocalDate.of(2022,12,20), LocalDate.of(2022,12,20),
                12345,
                "Enpreendimento Real Park",
                "São Lourenço",
                Status.ACABADO,
                1200.35,
                5,
                7);

        /*casa1.terminoData();*/




        Predios predio1 = new Predios(
                "Rua Tamarutaca, nº1922",
                LocalDate.of(2020,4,22),
                LocalDate.of(2022,1,25),
                LocalDate.of(2022, 5, 22),
                17356,
                "Emprendimento Estação Vila Sônia",
                "São Paulo",
                Status.CONSTRUCAO,
                25,
                22);

                /*predio1.arranhaCeu();
                predio1.terminoData();

                 */


        Predios predio2 = new Predios(
                "Rua dos Pinhais, Nº25",
                LocalDate.of(2022,4,22),
                LocalDate.of(2024,3,30),
                LocalDate.of(2022, 4, 22),
                17389,
                "Emprendimento Águia Dourada",
                "Jundiaí",
                Status.CALCULANDO,
                25,
                22);

                predio2.arranhaCeu();
                predio2.terminoData();




                if(predio1.compareTo(predio2)>0){
                    System.out.println("O Prédio 1 é maior que o prédio 2!");
                }else if(predio1.compareTo(predio2)<0){
                    System.out.println("O Prédio 2 é maior que o prédio 1!");
                }else {
                    System.out.println("Os dois prédios são do mesmo tamanho");
                }



    }

}
