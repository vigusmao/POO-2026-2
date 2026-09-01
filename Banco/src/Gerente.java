public class Gerente extends Pessoa {
    private int matricula;
    private int salario;

    public Gerente(String nome, long cpf, int matricula) {
        super(nome, cpf); // chamando o construtor de Pessoa
        this.matricula = matricula;
        this.salario = 4000;
    }
}
