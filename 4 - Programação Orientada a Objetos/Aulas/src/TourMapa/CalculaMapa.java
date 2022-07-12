package TourMapa;

public class CalculaMapa {

    public static void main(String[] args) {


        Automovel carro = new Automovel();
        Bicicleta caloi = new Bicicleta();
        Caminhando soNoPezinho = new Caminhando();

        Distancia rota1 = new Distancia(-23.596105, -23.599145, -46.742710, -46.743412);

        CalculaTempo calcularTempo = new CalculaTempo(carro);

        System.out.println("O tempo gasto é de "+ calcularTempo.valorTempo(rota1));


        System.out.println(carro.calcularTempo(rota1));
        System.out.println(caloi.calcularTempo(rota1));
        System.out.println(soNoPezinho.calcularTempo(rota1));



    }
}
