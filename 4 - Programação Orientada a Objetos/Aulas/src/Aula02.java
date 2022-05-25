import java.util.Scanner;

public class Aula02 {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome: ");
        String nome = scanner.next();
        System.out.println("Digite o sobrenome: ");
        String sobrenome = scanner.next();
        String iniciais = String.valueOf(nome.charAt(0)) + sobrenome.charAt(0);

        System.out.println("Digite o seu dia de nascimento");
        int dia = scanner.nextInt();
        System.out.println("Digite o mês do seu nascimento");
        int mes = scanner.nextInt();
        System.out.println("Digite o ano do seu nascimento");
        int ano = scanner.nextInt();


        System.out.println("Seu nome é: " + nome + " " + iniciais + " " + sobrenome);
        System.out.println("Minha data de nascimento: " + dia + "/" + String.format("%02d", mes) + "/" + ano);







    /*public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);

        System.out.println("Entre com um numero ");
        int num = scan.nextInt();

        for(int i = 1;i<=num;i++) {

            boolean primo = true;

            for(int j = 2;j<i;j++) {

                if(i%j == 0) {
                    primo = false;
                }

                if(primo) {
                    System.out.println(i);
                }
            }

        }
    }

}*/

/*
            System.out.println("Entre com um numero ");
            int numero = scan.nextInt();


            private static boolean ehPrimo(int numero) {
                for (int j = 2; j < numero; j++) {
                    if (numero % j == 0)
                        return false;
                }
                return true;
            }
        }
}

 */
    }
}
