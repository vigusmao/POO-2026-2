public abstract class Animal {

    String nome;
    long cpfDoDono;

    public Animal() {
        this("Bicho sem nome");
    }

    public Animal(String nome) {
        this.nome = nome;
    }

    public void dormir() {
        System.out.println("Fechando os olhos...");
        System.out.println("Zzzzz...");
    }

    public long getCpfDoDono() {
        return cpfDoDono;
    }

    public void setCpfDoDono(long cpfDoDono) {
        this.cpfDoDono = cpfDoDono;
    }

    public abstract String emitirSom(int volume);

    public String toString() {
        return this.getClass().getSimpleName() +
                " " + nome;
    }
}
