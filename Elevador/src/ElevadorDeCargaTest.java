import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ElevadorDeCargaTest {

    @Test
    public void testarSequenciaDeParadas() {
        ElevadorDeCarga elevador = new ElevadorDeCarga(10);

        elevador.solicitarParada(4);
        elevador.solicitarParada(2);
        elevador.solicitarParada(8);
        elevador.solicitarParada(6);

        elevador.mover();

        ArrayList<Integer> paradasEfetuadas = elevador.getParadasEfetuadas();
        assertEquals(4, paradasEfetuadas.size());
        assertEquals(4, paradasEfetuadas.get(0).intValue());
        assertEquals(2, paradasEfetuadas.get(1).intValue());
        assertEquals(8, paradasEfetuadas.get(2).intValue());
        assertEquals(6, paradasEfetuadas.get(3).intValue());
        assertEquals(6, elevador.getAndarCorrente());
    }
}