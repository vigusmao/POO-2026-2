public class GerenteGeral extends Gerente {

    private int bonus;

    public GerenteGeral(String nome,
                        long cpf,
                        int matricula,
                        String agencia) {

        super(nome, cpf, matricula);  // chama o construtor da classe mãe
        this.agencia = agencia;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus <= 0) {
            throw new RuntimeException("bonus tem que ser positivo");
        }
        this.bonus = bonus;
    }

    @Override
    public int getSalario() {
        return super.getSalario() * (1 + bonus/100);
    }
}
