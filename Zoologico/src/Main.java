//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Veterinaria petFeliz = new Veterinaria();

        Cachorro cao = new Cachorro("Cãozinho Xuxo");
        Dalmata toto = new Dalmata("Toto", 5);
        Gato rex = new Gato("Rex");

          Animal bichoGenerico;
//        bichoGenerico = new Animal();  // falharia na compilação
          bichoGenerico = new Cachorro("qualquer");

//        bichoGenerico.dormir();  // funciona
//        bichoGenerico.emitirSom(10);  // funciona
//        bichoGenerico.morder();  // não funciona; do meu ponto de vista, é um Animal

        petFeliz.cuidar(cao);
        petFeliz.cuidar(toto);
        petFeliz.cuidar(rex);

    }
}