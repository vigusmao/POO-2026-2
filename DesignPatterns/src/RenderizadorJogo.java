public class RenderizadorJogo implements ListenerPontuacao {

    public RenderizadorJogo() {
        MotorJogo motor = MotorJogo.getInstance();
        motor.addListenerPontuacao(this);
    }

    public void desenharTela() {

    }

    // ...

    @Override
    public void onMudancaPontuacao(Jogador jogador, int pontos) {
        // trata o evento de mudança de pontuação
        // para o jogador que está sendo informado
    }
}
