import impressao.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GerenciadorImpressao meuGerenciador = GerenciadorImpressao.getInstance();

        ImpressoraFactory impressoraFactory = meuGerenciador.getImpressoraFactory();
        Impressora novaImpressora = impressoraFactory.createImpressora(false);
        // novaImpressora poderá ser impressao.ImpressoraJatoDeTinta, impressao.ImpressoraLaser, etc.
        // dependendo do "estado da computação"

//        Impressora minhaJato = new ImpressoraMatricial();  // --  ISSO FALHA A COMPILAÇÃO!!
    }
}