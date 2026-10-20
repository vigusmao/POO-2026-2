import java.util.*;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {
        Cachorro x = new Cachorro(5);
        Cachorro y = new Cachorro(5);
        Cachorro z = x;
        z.setIdade(6);
        y = z;
//        z = y;

        System.out.println("x==y ? " + (x==y));
        System.out.println("x.equals(y) ? " + (x.equals(y)));
        System.out.println("z==x ? " + (z==x));
        System.out.println("z.equals(x) ? " + (z.equals(x)));

        Set<Cachorro> matilha = new HashSet<>();
        matilha.add(x);

        System.out.println("matilha.contains(x) ? " + matilha.contains(x));
        System.out.println("matilha.contains(y) ? " + matilha.contains(y));
        System.out.println("matilha.contains(z) ? " + matilha.contains(z));

        hashSetVersusArrayList();

    }

    static void hashSetVersusArrayList() {
        Collection<Integer> conjunto;
        Collection<Integer> lista;

        final int N = 400_000;
        conjunto = new HashSet<>();
        lista = new ArrayList<>();
        while (conjunto.size() < N) {
            int numero = random.nextInt(1_000_000);
            if (conjunto.add(numero)) {  // true se ADICIONOU; false se já estava lá
                lista.add(numero);
            }
        }

        long startLista = System.currentTimeMillis();
        int resLista = testarPerformance(lista);
        double duracaoLista = (System.currentTimeMillis() - startLista) / 1000.0;

        long startConjunto = System.currentTimeMillis();
        int resConjunto = testarPerformance(conjunto);
        double duracaoConjunto = (System.currentTimeMillis() - startConjunto) / 1000.0;

        System.out.printf("lista --> %d (tempo = %.6f sec)\n", resLista, duracaoLista);
        System.out.printf("conjunto --> %d (tempo = %.6f sec)", resConjunto, duracaoConjunto);
    }

    static int testarPerformance(Collection<Integer> colecao) {
        final int N_BUSCAS = 10_000;
        int count = 0;
        for (int i = 1; i <= N_BUSCAS; i++) {
            if (colecao.contains(i)) {
                count++;
            }
        }
        return count;
    }
}