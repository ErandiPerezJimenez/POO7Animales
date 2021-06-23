package Zoologico;

public class AnimalAereo extends Animal {

    private int numeroAlas;

    public AnimalAereo(int numeroAlas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numeroAlas = numeroAlas;
    }

    public int getNumeroAlas() {
        return numeroAlas;
    }

    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    public void volar() {
        System.out.println("El colibri vuela muy rapido");
    }

    @Override
    public void comer() {
        System.out.println("Los colibris comen flores y algunos insectos pequeños");
    }

    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }

}

