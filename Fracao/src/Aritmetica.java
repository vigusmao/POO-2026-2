public class Aritmetica {

    public static int calcularMdc(int x, int y) {
        int resto = x % y;
        while (resto > 0) {
            x = y;
            y = resto;
            resto = x % y;
        }
        return y;
    }

    public static int calcularMmc(int x, int y) {
        return x * y / calcularMdc(x, y);
    }
}
