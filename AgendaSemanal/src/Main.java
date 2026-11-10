import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<DiaDaSemana> diasDisponiveis = new ArrayList<>();
        diasDisponiveis.add(DiaDaSemana.SEG);
        diasDisponiveis.add(DiaDaSemana.QUA);
        diasDisponiveis.add(DiaDaSemana.SAB);

        AgendaSemanal minhaAgenda = new AgendaSemanal(
                diasDisponiveis);
        try {
            minhaAgenda.agendar(DiaDaSemana.TER, "ir ao médico");
            System.out.println("Ok, marcado");
        } catch (DiaIndisponivelException e) {
            System.out.println("Dia não disponível");
        }

        try {
            minhaAgenda.agendar(DiaDaSemana.QUA, "ir ao médico");
        } catch (DiaIndisponivelException e) {
            System.out.println("Dia não disponível");
        }

        try {
            minhaAgenda.agendar(DiaDaSemana.SAB, "ir ao médico");
        } catch (DiaIndisponivelException e) {
            System.out.println("Dia não disponível");
        }
    }
}