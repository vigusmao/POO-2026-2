import dominio.Animal;
import dominio.Cachorro;
import dominio.Gato;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Random random = new Random();

    public static Animal obterAnimal() {
        if (random.nextFloat() < 0.5) {
            return new Gato("sem nome");
        }
        return new Cachorro("caozinho");
    }

    public static void main(String[] args) {

        Animal c = obterAnimal();
        Gato g = (Gato) c;
        System.out.println(g.emitirSom(10));
//        testarArrayList();
//        testarHashSet();
//        testarHashMap();
//
//        dominio.Veterinaria petFeliz = new dominio.Veterinaria();
//
//        dominio.Cachorro cao = new dominio.Cachorro("Cãozinho Xuxo");
//        dominio.Dalmata toto = new dominio.Dalmata("Toto", 5);
//        dominio.Gato rex = new dominio.Gato("Rex");
//
//          dominio.Animal bichoGenerico;
////        bichoGenerico = new dominio.Animal();  // falharia na compilação
//          bichoGenerico = new dominio.Cachorro("qualquer");
//
////        bichoGenerico.dormir();  // funciona
////        bichoGenerico.emitirSom(10);  // funciona
////        bichoGenerico.morder();  // não funciona; do meu ponto de vista, é um dominio.Animal
//
//        petFeliz.cuidar(cao);
//        petFeliz.cuidar(toto);
//        petFeliz.cuidar(rex);
    }

    public static void testarArrayList() {

        ArrayList<Animal> bichos = new ArrayList<>();

        // adiciona N cachorros ao array
        int N = 64000;
        for (int i = 1; i <= N; i++) {
            Cachorro cachorro = new Cachorro("dominio.Cachorro " + i);
            cachorro.setCpfDoDono(random.nextInt(1000000));
            bichos.add(cachorro);
        }

        long inicio = System.currentTimeMillis();
        // executa 10000 buscas
        int contCachorrosEncontrados = 0;
        for (int cpf = 1; cpf <= 10000; cpf++) {
            if (procurarBichoPorCpfDoDono(bichos, cpf)) {
                contCachorrosEncontrados++;
            }
        }
        long tempoTotalEmMillis = System.currentTimeMillis() - inicio;

        System.out.println("tamanho do array = " + N);
        System.out.println("encontrados: " + contCachorrosEncontrados);
        System.out.println("tempo (segundos): " +
                (1.0 * tempoTotalEmMillis / 1000));
    }

    public static void testarHashMap() {

        HashMap<Long, Animal> bichoPorCpfDoDono = new HashMap<>();

        // adiciona N cachorros ao array
        int N = 64000;
        for (int i = 1; i <= N; i++) {
            Cachorro cachorro = new Cachorro("dominio.Cachorro " + i);
            long cpfDoDono = random.nextInt(1000000);
            cachorro.setCpfDoDono(cpfDoDono);
            bichoPorCpfDoDono.put(cpfDoDono, cachorro);
        }

        long inicio = System.currentTimeMillis();
        // executa 10000 buscas
        int contCachorrosEncontrados = 0;
        for (int cpf = 1; cpf <= 10000; cpf++) {
            if (procurarBichoPorCpfDoDono(bichoPorCpfDoDono, cpf)) {
                contCachorrosEncontrados++;
            }
        }
        long tempoTotalEmMillis = System.currentTimeMillis() - inicio;

        System.out.println("tamanho do array = " + N);
        System.out.println("encontrados: " + contCachorrosEncontrados);
        System.out.println("tempo (segundos): " +
                (1.0 * tempoTotalEmMillis / 1000));
    }

    public static boolean procurarBichoPorCpfDoDono(
            ArrayList<Animal> bichos, long cpfDesejado) {

//        for (int i = 0; i < bichos.size(); i++) {
//            dominio.Animal bicho = bichos.get(i);
//            if (bicho.getCpfDoDono() == cpfDesejado) {
//                return true;
//            }
//        }
        // outro jeito de se fazer a iteração pelo ArrayList completo


        for (Animal bicho : bichos) {
            if (bicho.getCpfDoDono() == cpfDesejado) {
                return true;
            }
        }
        return false;
    }

    // overload
    public static boolean procurarBichoPorCpfDoDono(
            HashMap<Long, Animal> mapaDeBichos, long cpfDesejado) {

        return mapaDeBichos.get(cpfDesejado) != null;
    }


}