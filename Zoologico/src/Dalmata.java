public class Dalmata extends Cachorro {

    int poder;

    public Dalmata(String nome, int poder) {
        super(nome);
        this.poder = poder;
    }

    public void vigiar() {
        // ........
    }

    @Override  // era totalmente opcional aqui!!
    public String emitirSom(int volume) {
        return "Grrrrrr!!!" +
                super.emitirSom(volume);
    }

    // overload acrescentado um parâmetro
    public void dormir(int tempoEmMinutos) {
        System.out.println("Dormindo por " +
                tempoEmMinutos + " minutos");
    }
}
