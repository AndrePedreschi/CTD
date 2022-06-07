public class Main {
//import model.Client;
    public static void main(String[] args) {

        Cliente cliente = new Cliente(1, "Pedro");
        cliente.aumentarDivida(10.52);
        cliente.pagarDivida(10.52);
        cliente.pagarDivida(10.52);
        cliente.setDivida(5.0);

        System.out.println("Sua dívida é de "+ cliente.getDivida());

















    }


}
