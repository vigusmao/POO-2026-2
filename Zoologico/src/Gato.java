public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String emitirSom(int volume) {
        return "MIAU!!!";
    }
}
