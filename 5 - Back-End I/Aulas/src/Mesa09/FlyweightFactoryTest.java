package Mesa09;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FlyweightFactoryTest {
    @Test
    void getRoupas(){
        Roupa roupa1 = FlyweightFactory.obterRoupa("m","calça", true, true);

        /*assertEquals(FlyweightFactory.listaTamnhoM.getTamanho(),"m");

         */
    }
}
