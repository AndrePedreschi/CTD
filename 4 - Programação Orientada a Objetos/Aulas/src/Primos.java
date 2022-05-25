import java.util.Scanner;
public class Primos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("informe a quantidade de numeros primos: ");
        int input = scan.nextInt();

        Primo primo = new Primo();
        int contador = 0;
        int contador2=0;
        String string = "";


        while(contador < input){
            if (primo.ehPrimo(contador2)){
                string=string.concat(contador2+", ");
                contador++;
            }
            contador2++;
        }

        System.out.println(string);

    }

}
