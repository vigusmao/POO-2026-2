import java.util.Objects;

public class Cachorro {

    private int idade;

    public Cachorro(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cachorro cachorro = (Cachorro) o;
        return idade == cachorro.idade;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idade);
    }
}
