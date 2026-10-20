public class SaldoInsuficienteException extends Exception { // checked exception!

    private float valorFaltante;

    public SaldoInsuficienteException(float valorFaltante) {
        this.valorFaltante = valorFaltante;
    }

    public float getValorFaltante() {
        return valorFaltante;
    }

}
