package model;

public class Perro extends Animal{

    public Perro(String nombre, int edad, double peso, double tamanio){
        super(nombre, edad, peso, tamanio);
    }


    @Override
    public void hacerSonido(){
        System.out.println("Guau");
    }
}
