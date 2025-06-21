import model.Animal;
import model.Gato;
import model.Perro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Animal leia = new Gato("Leia", 4, 6.50, 10);
        Animal johnny = new Perro("Johnny", 10, 50, 50);
        Animal donato = new Gato("Donato", 5,5.6,13);


        System.out.println(leia.mostrarDatos());
        leia.hacerSonido();

        System.out.println(johnny.mostrarDatos());
        johnny.hacerSonido();

        System.out.println(donato.mostrarDatos());
        donato.hacerSonido();
    }
}