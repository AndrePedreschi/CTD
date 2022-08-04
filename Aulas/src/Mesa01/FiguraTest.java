package Mesa01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FiguraTest {

    Circulo circulo1, circulo2;
    Quadrado quadrado1, quadrado2;

    @BeforeEach
    void doBefore() {
        circulo1 = new Circulo(2.0);
        circulo2 = new Circulo(5.0);
        quadrado1 = new Quadrado(4.0);
        quadrado2 = new Quadrado(6.0);
    }

    @Test
    void testarCirculo() {

        System.out.println(circulo1.calcularPerimetro());
        System.out.println(circulo2.calcularPerimetro());

    }

    @Test
    void testarQuadrado() {
        System.out.println(quadrado1.calcularPerimetro());
        System.out.println(quadrado2.calcularPerimetro());
    }
}
