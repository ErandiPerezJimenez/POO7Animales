package Zoologico;

public class Ballena extends AnimalAcuatico {

    private int largo;

    public Ballena(int numeroAletas, String nombre, String origen, String color, int largo) {
        super(numeroAletas, nombre, origen, color);
        this.largo = largo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void pelearConPinocho() {
        System.out.println("Se comio a pinocho :(");
    }

    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
}
