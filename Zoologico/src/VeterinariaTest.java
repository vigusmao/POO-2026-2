import dominio.Animal;
import dominio.Cachorro;
import dominio.Gato;
import dominio.Veterinaria;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VeterinariaTest {
    private Veterinaria vet;
    private Cachorro dog;
    private Gato cat1;
    private Gato cat2;

    @Before  // roda antes de cada teste
    public void setUp() {
        vet = new Veterinaria();

        dog = new Cachorro("dog1");
        dog.setCpfDoDono(1234);

        cat1 = new Gato("cat1");
        cat1.setCpfDoDono(5678);

        cat2 = new Gato("cat2");
        cat2.setCpfDoDono(111);
    }

    public void testarOrdemAtendimento() {
        vet.cuidar(dog);
        vet.cuidar(cat2);
        vet.cuidar(cat1);
        vet.cuidar(dog);

        assertEquals(dog, vet.obterAnimalAtendido(1));
        assertEquals(dog, vet.obterAnimalAtendido(4));
        assertEquals(cat1, vet.obterAnimalAtendido(3));
    }

    @Test
    public void testarPetsDoCliente() {
        dog.setCpfDoDono(111);
        vet.cuidar(dog);

        ArrayList<Animal> bichosDoCliente = vet.obterPetsDoCliente(111);
        assertEquals(1, bichosDoCliente.size());
        assertTrue(bichosDoCliente.contains(dog));

        cat1.setCpfDoDono(3765327);
        vet.cuidar(cat1);

        cat2.setCpfDoDono(111);  // outro bicho do mesmo dono
        vet.cuidar(cat2);

        vet.cuidar(dog);  // cuidou de novo do bicho de cliente que já existia
        vet.cuidar(dog);  // cuidou de novo do bicho de cliente que já existia
        vet.cuidar(dog);  // cuidou de novo do bicho de cliente que já existia
        vet.cuidar(dog);  // cuidou de novo do bicho de cliente que já existia
        vet.cuidar(dog);  // cuidou de novo do bicho de cliente que já existia

        Cachorro x = dog;
        vet.cuidar(x);

        Cachorro y = new Cachorro("dog1");
        y.setCpfDoDono(111);
        vet.cuidar(y);

        bichosDoCliente = vet.obterPetsDoCliente(111);
        assertEquals(2, bichosDoCliente.size());
        assertTrue(bichosDoCliente.contains(dog));
        assertTrue(bichosDoCliente.contains(cat2));


        assertFalse(bichosDoCliente.contains(cat1));
    }
}