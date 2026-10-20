package dominio;

import java.util.ArrayList;
import java.util.HashMap;

public class Veterinaria {

    private HashMap<Long, ArrayList<Animal>> bichosPorCpfDoDono;


    public Veterinaria() {
        this.bichosPorCpfDoDono = new HashMap<Long, ArrayList<Animal>>();
    }

    public void cuidar(Animal bicho) {
        System.out.println("Cuidando do " + bicho);
        bicho.dormir();
        System.out.println("5 minutos depois...");
        System.out.println(bicho.emitirSom(30));
        bicho.emitirSom(10);  // pelo polimorfismo, cada bicho específico emitirá o som
        // do seu jeitinho particular (múltiplas formas)

        long cpfDoCliente = bicho.getCpfDoDono();
        ArrayList<Animal> bichosDesseCliente =
                bichosPorCpfDoDono.get(cpfDoCliente);

        if (bichosDesseCliente == null) {
            bichosDesseCliente = new ArrayList<Animal>();
            bichosPorCpfDoDono.put(cpfDoCliente, bichosDesseCliente);
        }

        if (!bichosDesseCliente.contains(bicho)) {
            bichosDesseCliente.add(bicho);
        }
    }

    public Animal obterAnimalAtendido(int ordemAtendimento) {
        return null;  // ToDo IMPLEMENT ME!!!!
    }

    public ArrayList<Animal> obterPetsDoCliente(long cpfDoCliente) {
        return bichosPorCpfDoDono.get(cpfDoCliente);
    }

}
