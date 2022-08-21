package Mesa08;



import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        FacadeTurismo ft = new FacadeTurismo();

        Viagem v1 = new Viagem(LocalDate.of(2022, 12, 22), LocalDate.of(2022, 12, 29), "Foz do Iguaçu", "Salvador");
        Viagem v2 = new Viagem(LocalDate.of(2022, 01, 03), LocalDate.of(2022, 01, 10), "Foz do Iguaçu", "Curitiba");

        System.out.println(ft.buscar(v1));
        System.out.println(ft.buscar(v2));
    }
}
