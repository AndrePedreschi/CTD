//package jonathas;

public class Arcade {

//nave, nave inimiga, asteróide.

//Eles são todos objetos gráficos que ocupam uma posição no espaço (x, y)
//e à medida que se movem ocupam uma nova localização,

//As naves têm uma
// velocidade e uma
// direção.

//A direção pode ser ‘N’, 'S', 'L', 'O', (sul, norte, leste ou oeste).

//Os asteroides podem ir para qualquer posição,
// independentemente de sua direção atual.

    //O problema é para resolver o movimento, não é necessário resolver outra operação.
//Embora, para usar no futuro, seja necessário sobrescrever toString, hashCode e equals, tanto na nave
//quanto no asteroide.

    public static void main(String[] args) {


    class Objeto {
        private int posx;
        private int posy;
        private char direcao;

        public Objeto(int x, int y, char direcao) {
            this.posx = x;
            this.posy = y;
            this.direcao = direcao;
        }

        public void setDirecao(char direcao) {
            this.direcao = direcao;
        }

        public void irA(int x, int y, char direcao) {
            this.posx = x;
            this.posy = y;
            this.direcao = direcao;
        }

    }



    class Nave extends Objeto {
        private double velocidade;
        private int vida;

        public Nave(int x, int y, char direcao, double velocidade) {
            super(x, y, direcao);
            this.velocidade = velocidade;
            this.vida = 100;
        }

        public void girar(char direcao){
            super.setDirecao(direcao);
        }
        public void restaVida(int valor){
            this.vida = vida;
        }

    }



    class Asteroid extends Objeto{
        private int danos ;

        public Asteroid(int x, int y, char direcao, int danos) {
            super(x, y, direcao);
            this.danos = danos;
        }

    }
}

}