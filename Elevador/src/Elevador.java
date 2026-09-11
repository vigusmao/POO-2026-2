import java.util.ArrayList;

public abstract class Elevador {

    /**
     * Retorna o histórico com todas as paradas efetuadas pelo
     * elevador desde a sua criação.
     *
     * @return Um ArrayList contendo a sequência de paradas que foram
     * realizadas.
     */
    public ArrayList<Integer> getParadasEfetuadas() {
        return null;  // ToDo IMPLEMENT ME!!
    }

    /**
     * Acrescenta uma solicitação de parada ao final da lista de solicitações.
     *
     * @param andar o andar desejado
     */
    public void solicitarParada(int andar) {
        // ToDo IMPLEMENT ME!!
    }

    /**
     * Se o elevador encontrava-se parado, faz com que
     * ele se ponha em movimento e comece a
     * atender as solicitações de paradas em andares,
     * sempre a partir da primeira solicitação feita; após
     * atender a primeira solicitação, deve usar a lógica
     * implementada pelas subclasses
     * para decidir qual a próxima parada, e a próxima,
     * sucessivamente, até não ter mais solicitações para atender.
     *
     * Se o elevador já estava em movimento, nada acontece.
     */
    public void mover() {
        // ToDo IMPLEMENT ME!!
    }

    /**
     * Vai para o andar informado como parâmetro. Ao chegar lá,
     * decide qual será a próxima parada e chama novamente o irPara, passando
     * como parâmetro essa próxima parada. Se não houver mais paradas solicitadas,
     * fica parado.
     *
     * @param andar O próximo destino.
     */
    private void irPara(int andar) {
        // ToDo IMPLEMENT ME!!
    }

    public int getAndarCorrente() {
        return 0;  // ToDo IMPLEMENT ME!!
    }

    /** Decide qual será a próxima parada, baseado no andar corrente,
     *  no sentido do movimento, e na lista de solicitações.
     *
     * Cada subclasse deve implementar a sua lógica.
     *
     * @return o próximo andar em que o elevador deverá parar
     */
    protected abstract int decidirProximaParada();
}
