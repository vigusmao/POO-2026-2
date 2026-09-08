public class Gerente extends Pessoa {
    private int matricula;
    private int salario;
    protected String agencia;

    public Gerente(String nome, long cpf, int matricula) {
        super(nome, cpf); // chamando o construtor de Pessoa
        this.matricula = matricula;
        this.salario = 4000;
    }

    public void setSalario(int novoSalario) {
        if (novoSalario < salario) {
            throw new RuntimeException("valor invalido");
        }
        salario = novoSalario;
    }

    @Override
    public String getNome() {
        return "Sr/a. " + nome;
    }

    public int getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return getNome() +
                " (gerente na agência " +
                agencia + ")";
    }
}
