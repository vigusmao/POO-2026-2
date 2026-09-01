public class Pessoa {

    private String nome;
    private final long cpf;

    public Pessoa(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String novoNome) {
        if (novoNome.length() > 30) {
            throw new RuntimeException("Nome muito grande!!!")
        }
        this.nome = nome;
    }

    public void casar(Pessoa conjuge) {
        // ToDo IMPLEMENT ME
    }
}
