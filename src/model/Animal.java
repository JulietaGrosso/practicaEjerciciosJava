package model;

public class Animal {
    private String nombre;
    private int edad;
    private double peso;
    private double tamanio;

    public Animal(String nombre, int edad, double peso, double tamanio){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getPeso(){
        return peso;
    }
    public double getTamanio(){
        return tamanio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }


    public String mostrarDatos(){
        return "Nombre: " + this.nombre + "  " +
                "Edad: " + this.edad + "  " +
                "Peso: " + this.peso + "  " +
                "Tamaño: " + this.tamanio;
    }

    public void hacerSonido(){
        System.out.println("...");
    }



}
