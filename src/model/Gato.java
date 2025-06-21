package model;

public class Gato extends Animal{

    public Gato(String nombre, int edad, double peso, double tamanio){
        super(nombre,edad,peso,tamanio);
    }



    @Override
    public void hacerSonido(){
        System.out.println("Miau");
    }
}
