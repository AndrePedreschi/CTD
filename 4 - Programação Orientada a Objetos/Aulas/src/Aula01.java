public class Aula01 {
    public static void main(String[] args) {
        // write your code here


        for(int i = 1; i<=5; i++){
            System.out.println("Olá");
        }

        int num1=10;
        int num2=5;

        int num3= num1%num2;

        if(num3==0){
            System.out.println("o Numero "+num1+" e divisivel pelo numero "+num2);
        }else{
            System.out.println("o Numero "+num1+" nao e divisivel pelo numero "+num2);
        }

        String nome = "andre";
        nome = nome.toUpperCase();
        System.out.println(nome);


        /* Exercício 1 */
        String texto1="oi";
        String texto2="Oi";
        if(texto1.equals(texto2)){
            System.out.println("Os textos são iguais");
        }else{
            System.out.println("Os textos são diferentes");
        }

        /* exercício 2 */
        int num4=4;
        int num5=6;

        if(num4>num5){
            System.out.println(num4+" é maior que "+ num5);
        }else if(num4<num5){
            System.out.println(num5+" é maior que "+ num4);
        }else{
            System.out.println("Os dois números são iguais");
        }
    }
}
