public class Veterinaria {

    public void cuidar(Animal bicho) {
        System.out.println("Cuidando do " + bicho);
        bicho.dormir();
        System.out.println("5 minutos depois...");
        System.out.println(bicho.emitirSom(30));
        bicho.emitirSom(10);  // pelo polimorfismo, cada bicho específico emitirá o som
                                     // do seu jeitinho particular (múltiplas formas)
    }


}
