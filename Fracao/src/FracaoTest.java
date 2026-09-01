import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FracaoTest {

    @Test
    public void testarSoma() {
        // 2/5 + 1/5 = 3/5
        Fracao x = new Fracao(2, 5);
        Fracao y = new Fracao(1, 5);
        Fracao z = x.somar(y);
        assertEquals(3, z.getNumerador());
        assertEquals(5, z.getDenominador());
        assertTrue(z.getSinal());

        // 1/2 + 1/3 = 5/6
        x = new Fracao(1, 2);
        y = new Fracao(1, 3);
        z = x.somar(y);
        assertEquals(5, z.getNumerador());
        assertEquals(6, z.getDenominador());
        assertTrue(z.getSinal());

        // 1/6 + 1/6 = 1/3
        x = new Fracao(1, 6);
        z = x.somar(x);
        assertEquals(1, z.getNumerador());
        assertEquals(3, z.getDenominador());
        assertTrue(z.getSinal());
    }


    @Test
    public void testarMultiplicacao() {
        // (2/7) * (-2/3) = -4/21
        Fracao x = new Fracao(2, 7);
        Fracao y = new Fracao(-2, 3);
        Fracao z = x.multiplicar(y);
        assertEquals(4, z.getNumerador());
        assertEquals(21, z.getDenominador());
        assertFalse(z.getSinal());

        // (2/7) * (5/2) = 10/14 (ou 5/7 simplificado)
        x = new Fracao(2, 7);
        y = new Fracao(5, 2);
        z = x.multiplicar(y, true);
        assertEquals(5, z.getNumerador());
        assertEquals(7, z.getDenominador());
        assertTrue(z.getSinal());

        z = x.multiplicar(y);
        assertEquals(10, z.getNumerador());
        assertEquals(14, z.getDenominador());
        assertTrue(z.getSinal());

    }

    @Test
    public void testarFracaoIrredutivel() {
        // 32/24 = 4/3
        Fracao x = new Fracao(32, 24);
        Fracao z = x.getFracaoIrredutivel();
        assertEquals(4, z.getNumerador());
        assertEquals(3, z.getDenominador());
        assertTrue(z.getSinal());

        // -5/15 = -1/3
        x = new Fracao(-5, 15);
        z = x.getFracaoIrredutivel();
        assertEquals(1, z.getNumerador());
        assertEquals(3, z.getDenominador());
        assertFalse(z.getSinal());
    }

    @Test
    public void testarValorNumerico() {
        assertEquals(0.5, new Fracao(1, 2).getValorNumerico());
        assertEquals(0.01, new Fracao(1, 100).getValorNumerico());
        assertEquals(-0.25, new Fracao(2, -8).getValorNumerico());
    }

    @Test
    public void testarToString() {
        Fracao doisNonos = new Fracao(2, 9);
        assertEquals("2/9", doisNonos.toString());

        // daqui pra frente vamos chamar o toString() diretamente após o new

        assertEquals("-2/9", (new Fracao(-2, 9)).toString());
        assertEquals("-2/9", (new Fracao(2, -9)).toString());
        assertEquals("2/9", (new Fracao(-2, -9)).toString());

        assertEquals("0", (new Fracao(0, 9)).toString());
        assertEquals("15", (new Fracao(15, 1)).toString());
        assertEquals("-15", (new Fracao(15, -1)).toString());

        assertEquals("20/40", (new Fracao(20, 40)).toString());
        assertEquals("40/20", (new Fracao(40, 20)).toString());
    }

}