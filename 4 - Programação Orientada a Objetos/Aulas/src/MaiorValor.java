import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro valor:");
        int val1 = scanner.nextInt();
        System.out.println("Informe o segundo valor:");
        int val2 = scanner.nextInt();
        System.out.println("Informe o terceiro valor:");
        int val3 = scanner.nextInt();

        Integer maiorValor = maiorValor(val1, val2, val3);

        if (maiorValor == null) {
            System.out.println("Os valores são iguais");
        } else {
            System.out.println("O maior valor é: " + maiorValor);
        }
    }

    private static Integer maiorValor(int val1, int val2, int val3) {
        if ((val1 == val2) && (val2 == val3)) return null;

        if (val1 > val2 && val1 > val3) {
            return val1;
        } else if (val2 > val3) {
            return val2;
        }

        return val3;
    }
}
