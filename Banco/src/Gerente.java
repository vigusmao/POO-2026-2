import java.util.ArrayList;

public class Gerente extends Pessoa {
    private int matricula;
    private int salario;
    protected String agencia;


//    private ContaCorrente[] minhasContas;
//    private int quantContas = 0;
    private ArrayList<ContaCorrente> minhasContas;

    public Gerente(String nome, long cpf, int matricula) {
        super(nome, cpf); // chamando o construtor de Pessoa
        this.matricula = matricula;
        this.salario = 4000;
//        this.minhasContas = new ContaCorrente[4];
        this.minhasContas = new ArrayList<>();
    }

    public void adicionarConta(ContaCorrente novaConta) {
//        if (quantContas > this.minhasContas.length) {
//            // overflow
//        }
//        this.minhasContas[quantContas] = novaConta;
//        quantContas++;
        this.minhasContas.add(novaConta);
    }

    public int getQuantContas() {
//        return this.quantContas;
        return this.minhasContas.size();
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
