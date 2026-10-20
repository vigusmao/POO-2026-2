package dominio;

import java.util.ArrayList;

public class Cachorro extends Animal {

    // inner class
    public class DonoETempo {
        String nomeDoDone;
        int mesesComEsseDono;
    }

    private ArrayList<DonoETempo> historico;

    public String getHistorico() {
        String resultado = "";
        for (DonoETempo dt : historico) {
            resultado += dt;
        }
        return resultado;
    }

    private String raca;

    public Cachorro(String nome) {
//        super(nome);
        this(nome, "Vira-Lata");
        System.out.println("sdflkhfc");
    }

    public Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }

    @Override
    public String emitirSom(int volume) {
        return "AUAUAUAU (com volume " + volume + " dB)";
    }

    // quero também um overload (direito meu!!!)
    public String emitirSom() {
        return emitirSom(20);
    }

    public void morder() {
        System.out.println("Mordendo alguém aleatório");
    }


}
