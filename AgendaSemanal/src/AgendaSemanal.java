import java.util.*;

public class AgendaSemanal {

    private Map<DiaDaSemana,
                List<String>> compromissosPorDia;
    private Set<DiaDaSemana> diasDisponiveis;

    public AgendaSemanal(Collection<DiaDaSemana> diasDisponiveis) {
        this.diasDisponiveis = new HashSet(diasDisponiveis); // composição
        this.compromissosPorDia = new HashMap<>();
    }

    public void agendar(DiaDaSemana dia, String descricao) throws DiaIndisponivelException {
        if (!this.diasDisponiveis.contains(dia)) {
            throw new DiaIndisponivelException();
        }
        if (!dia.ehDiaUtil()) {
            System.out.println("Vai ser mais caro!!!");
        }
        List<String> compromissosDoDia = this.compromissosPorDia.get(dia);
        if (compromissosDoDia == null) {
            compromissosDoDia = new ArrayList<>();
            this.compromissosPorDia.put(dia,
                    compromissosDoDia);
        }
        compromissosDoDia.add(descricao);
        System.out.println("Ok, marcado para " + dia);
    }

    public int getQuantCOmpromissos(DiaDaSemana dia) {
        List<String> compromissosDoDia = this.compromissosPorDia.get(dia);
        return compromissosDoDia == null ? 0 : compromissosDoDia.size();
    }
}
