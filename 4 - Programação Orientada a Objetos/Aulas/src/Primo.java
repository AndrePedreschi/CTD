import java.util.Scanner;

public class Primo {

 /*       public static void main(String[] args) {
            // write your code here
            Scanner scanner = new Scanner(System.in);
            System.out.println("Informe um valor: ");
            int valor = scanner.nextInt();

            if (valor >= 2 && ehPrimo(valor)) {
                System.out.println("É primo");
            } else {
                System.out.println("Não é primo");
            }
        }

        public static boolean ehPrimo(int valor) {
            boolean primo = true;
            for (int i = 2; i < valor; i++) {
                if (valor % i == 0) {
                    primo = false;
                    break;


                }
            }
            return primo;

        }

  */


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor:");
        int valor = scanner.nextInt();

        if (ehPrimo(valor)) {
            System.out.println("o valor " + valor + " é primo");
        } else {
            System.out.println("o valor " + valor + " não é primo");
        }
    }

    public static boolean ehPrimo(int valor) {
        if (valor < 2) return false;

        boolean primo = true;
        for (int i=2; i<valor; i++) {
            if (valor % i == 0) {
                primo = false;
                break;
            }
        }

        return primo;
    }







}
