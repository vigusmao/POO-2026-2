public abstract class Animal {

    String nome;

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

    public abstract String emitirSom(int volume);

    public String toString() {
        return this.getClass().getSimpleName() +
                " " + nome;
    }
}
