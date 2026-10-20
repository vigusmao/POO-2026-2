import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Random random = new Random();

    public static void a() {
        System.out.println("a: executando a()...");
        System.out.println("a: vou chamar o b");
        int retornoDeB = b();
        System.out.println("a: recebi de b valor de retorno = " + retornoDeB);
        System.out.println("a: cheguei ao fim");
    }

    public static int b() {
        System.out.println("executando b()...");
        while (true) {
            try {
                System.out.println("b: Começando meu try...");
                System.out.println("Vou chamar o c()");
                c();
                System.out.println("b: Legal! Não tomei exceção, vou sair do while");
                break;
            } catch (ValorGrandeException e) {
                System.out.println("b: Tomei exceção vinda do c!!!!");
            } finally {
                System.out.println("b: Entrei no finally!!!");
            }
        }
        System.out.println("b: Vou retornar 5;");
        return 5;
    }

    public static void c() throws ValorGrandeException {
        System.out.println("c: Executando c()...");
        int x = 10;
        if (random.nextFloat() < 0.5) {  // condição qualquer
            System.out.println("c: Vou lançar ValorGrandeException");
            throw new ValorGrandeException();
        }
        System.out.println("c: cheguei no final limpinho");
    }

    public static void main(String[] args) {
        System.out.println("main: vou chamar o a()");
        a();
        System.out.println("main: terminou a execução do a()");
        System.out.println("main: Tchau!!!!");
    }

}