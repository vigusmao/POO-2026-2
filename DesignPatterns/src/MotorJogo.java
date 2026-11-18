import java.util.HashSet;
import java.util.Set;

// singleton
public class MotorJogo {

    Set<ListenerPontuacao> listenersPontuacao;

    private static MotorJogo instance;

    private MotorJogo() {
        listenersPontuacao = new HashSet<>();
    }

    public static MotorJogo getInstance() {
        if (instance == null) {
            instance = new MotorJogo();
        }
        return instance;
    }

    public void addListenerPontuacao(ListenerPontuacao listener) {
        this.listenersPontuacao.add(listener);
    }

    public void jogar() {

        while (true) {
            // verifica condições
            // recebe comandos via rede
            // loga coisas
            // atualiza dados

            // ...

            // AQUI O EVENTO `mudança de pontuação` SERÁ PRODUZIDO,
            // pois haverá mudança nos pontos do Jogador fulano
            // (precisa notificar os observadores)
//
            Jogador fulano = new Jogador();
            fulano.setPontuacao(810);

            // itera pelos listeners, notificando um por um
            for (ListenerPontuacao listener : this.listenersPontuacao) {
                listener.onMudancaPontuacao(fulano, 810);
            }
        }
    }
}
