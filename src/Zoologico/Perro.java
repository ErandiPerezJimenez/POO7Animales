package Zoologico;

public class Perro extends AnimalTerrestre {

    private String colorCollar;

    public Perro(int numeroPatas, String nombre, String origen, String color) {
        super(numeroPatas, nombre, origen, color);
    }

    public String getColorCollar() {
        return colorCollar;
    }

    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }

    public void hacerTrucos() {
        System.out.println("Se hace el muerto y saluda con la patita");
    }

    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }

}
