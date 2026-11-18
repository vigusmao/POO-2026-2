package impressao;

// Design Pattern: Object Factory
public class ImpressoraFactory {
    int contImpressorasLaserCriadas = 0;

    public Impressora createImpressora(boolean maisBrataPossivel) {
        if (maisBrataPossivel) {
            return new ImpressoraMatricial();
        }
        if (contImpressorasLaserCriadas >= 3) {
            return new ImpressoraJatoDeTinta();
        }
        contImpressorasLaserCriadas++;
        return new ImpressoraLaser();
    }
}
