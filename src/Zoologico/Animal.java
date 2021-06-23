package Zoologico;

public class Animal {
    private String nombre,origen,color;
    public Animal() {
    }
    public Animal(String nombre, String origen, String color) {
        this.nombre = nombre;
        this.origen = origen;
        this.color = color;
    }
    public String getNombre() {
        return nombre;
    }
    public String getOrigen() {
        return origen;
    }
    public String getColor() {
        return color;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void sonido(String sonido) {
        System.out.println("Sonido:"+sonido); 
    }
    public void comer() {
        System.out.println("Este animal come");
    }
    @Override
    public String toString() {
        return super.toString()+ "Animal{" + "nombre=" + nombre +
                ", origen=" + origen + ", color=" + color + '}';
    }
}
