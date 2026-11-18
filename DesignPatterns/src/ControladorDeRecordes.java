public class ControladorDeRecordes implements ListenerPontuacao {

    public ControladorDeRecordes() {
        MotorJogo motor = MotorJogo.getInstance();
        motor.addListenerPontuacao(this);
    }

    @Override
    public void onMudancaPontuacao(Jogador jogador, int pontos) {
       // verifica se o jogador informado
       // conquistou a maior pontuação de sua vida;
       // se for esse o caso, dá um prêmio pro cara

    }
}
