package Trem;

public class Main {
    public static void main(String[] args) {
        Trem mariaFumaca = new Trem();
        Locomotiva locomotiva = new Locomotiva();
        Vagao vagao1 = new Vagao();
        Vagao vagao2 = new Vagao();
        Vagao vagao3 = new Vagao();
        Vagao vagao4 = new Vagao();
        Vagao vagao5 = new Vagao();


        System.out.println(locomotiva.getAreaTotal());
        System.out.println(vagao1.getAreaTotal());


        mariaFumaca.addItens(locomotiva);
        mariaFumaca.addItens(vagao1);
        mariaFumaca.addItens(vagao2);
        mariaFumaca.addItens(vagao3);
        mariaFumaca.addItens(vagao4);
        mariaFumaca.addItens(vagao5);

        mariaFumaca.calcularArea();



    }

}
