public enum DiaDaSemana {
    SEG(true, "segunda-feira"),
    TER(true, "terça-feira"),
    QUA(true, "quarta"),
    QUI(true, "quinta"),
    SEX(true, "sexta"),
    SAB(false, "sabado"),
    DOM(false, "domingo");

    private boolean diaUtil;
    private String nomeBonitinho;

    DiaDaSemana(boolean diaUtil, String nomeBonitinho) {
        this.diaUtil = diaUtil;
        this.nomeBonitinho = nomeBonitinho;
    }

    public boolean ehDiaUtil() {
        return this.diaUtil;
    }

    @Override
    public String toString() {
        return this.nomeBonitinho;
    }
}
