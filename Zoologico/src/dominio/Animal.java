package dominio;

import java.util.Objects;

public abstract class Animal {

    private String nome;
    private long cpfDoDono;

//    public dominio.Animal() {
//        this("Bicho sem nome");
//    }

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

//    @Override
//    public boolean equals(Object outro) {
//        if (outro == null) {
//            return false;
//        if (outro == this) {
//            return true;
//        }
//        if (outro.getClass() != this.getClass()) {
//            return false;
//        }
//        dominio.Animal o = (dominio.Animal) outro;  // type cast seguro
//        return o.cpfDoDono == this.cpfDoDono &&
//                o.nome.equals(this.nome);
//    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return cpfDoDono == animal.cpfDoDono && Objects.equals(nome, animal.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfDoDono, nome);
    }
}
