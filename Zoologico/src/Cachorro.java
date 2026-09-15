public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom(int volume) {
        return "AUAUAUAU (com volume " + volume + " dB)";
    }

    // quero também um overload (direito meu!!!)
    public String emitirSom() {
        return emitirSom(20);
    }

    public void morder() {
        System.out.println("Mordendo alguém aleatório");
    }


}
