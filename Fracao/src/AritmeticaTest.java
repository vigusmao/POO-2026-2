import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AritmeticaTest {

    @Test
    public void testarMdc() {
        assertEquals(4,
                Aritmetica.calcularMdc(8, 4));
        assertEquals(4,
                Aritmetica.calcularMdc(4, 8));
        assertEquals(1,
                Aritmetica.calcularMdc(8, 25));
        assertEquals(709,
                Aritmetica.calcularMdc(709, 709));
    }

    @Test
    public void testarMmc() {
        assertEquals(30,
                Aritmetica.calcularMmc(10, 30));
        assertEquals(52,
                Aritmetica.calcularMmc(52, 52));
    }
}