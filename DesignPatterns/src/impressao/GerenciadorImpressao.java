package impressao;

import java.util.ArrayList;
import java.util.List;

// Design Pattern: Singleton
public class GerenciadorImpressao {

    private static GerenciadorImpressao singleton;

    private final List<Impressora> impressoras;
    private final ImpressoraFactory factory;

    private GerenciadorImpressao() {
        factory = new ImpressoraFactory();
        impressoras = new ArrayList<>();

        Impressora jatoDeTinta1 = new Impressora();
        Impressora matricial1 = new Impressora();
        impressoras.add(jatoDeTinta1);
        impressoras.add(matricial1);
    }

    public ImpressoraFactory getImpressoraFactory() {
        return factory;
    }

    public static GerenciadorImpressao getInstance() {
        //  lazy instantiation no atributo `singleton`
        if (singleton == null) {
            singleton = new GerenciadorImpressao();
        }
        return singleton;
    }
}
