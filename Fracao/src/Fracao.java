public class Fracao {

    private final int numerador;  // não-negativo!
    private final int denominador;  // positivo
    private final boolean sinal;  // true para positivo ou zero; false para negativo

    public Fracao(int numerador, int denominador, boolean sinal) {
        if (numerador < 0) {
            throw new RuntimeException("Numerador tem que ser não-negativo!");
        }
        if (denominador <= 0) {
            throw new RuntimeException("Denominador precisa ser positivo!");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        this.sinal = sinal;
    }

    // overload (sobrecarga) de construtor
    public Fracao(int numerador, int denominador) {
        // desvia para o outro construtor
        this(Math.abs(numerador),
                Math.abs(denominador),
                numerador * denominador >= 0);
    }

    public Fracao(int x) {
        // desvia para o outro construtor,
        // respeitando o "DRY principle"
        this(x, 1);
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public boolean getSinal() {
        return sinal;
    }

    public Fracao somar(Fracao outra) {
        int mmc = Aritmetica.calcularMmc(this.denominador, outra.denominador);
        int numResultado =
                this.numerador * (mmc / this.denominador) * (this.sinal ? 1 : -1) +
                outra.numerador * (mmc / outra.denominador) * (outra.sinal ? 1 : -1);
        int denomResultado = mmc;
        // ... calcular o resultado e criar umanova Fracao para ser retornada
        Fracao resultado = new Fracao(numResultado, denomResultado);
        return resultado.getFracaoIrredutivel();
    }

    public double getValorNumerico() {
        return (sinal ? 1.0 : -1.0) * numerador / denominador;
    }

    public Fracao getFracaoIrredutivel() {
        int mdc = Aritmetica.calcularMdc(
                numerador, denominador);
        return new Fracao(
                numerador / mdc,
                denominador / mdc,
                sinal);
    }

    public Fracao multiplicar(Fracao outra, boolean simplificar) {
        int numResultado = this.numerador * outra.numerador;
        int denomResultado = this.denominador * outra.denominador;
        boolean sinalResultado = (this.sinal == outra.sinal);
        Fracao resultado = new Fracao(
                numResultado, denomResultado, sinalResultado);
        return simplificar ? resultado.getFracaoIrredutivel()
                           : resultado;
    }

    // overload
    public Fracao multiplicar(Fracao outra) {
        return multiplicar(outra, false);
    }

    @Override
    public String toString() {
        if (numerador == 0) {
            return "0";
        }
        return (sinal ? "" : "-") +
                numerador +
                (denominador > 1 ? "/" + denominador : "");
    }
}
