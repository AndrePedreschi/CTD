package Mesa07;

public class Main {
    public static void main(String[] args) {
        ArvoreFactory arvore = new ArvoreFactory();

        for (int i = 0; i<500000; i++){

           Arvore verde = arvore.plantar("Ornamental");
           Arvore vermelho = arvore.plantar("Frutífera");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}

/*Rafael Vasconcelos
  Caroline Machado
  Mateus Praxedes
  Ruggiero Silveira Stello
  André Pedreschi
 */
