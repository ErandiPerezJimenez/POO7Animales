
package Zoologico;


public class AnimalTerrestre extends Animal{
    private int numeroPatas;

    public AnimalTerrestre(int numeroPatas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }
           
    public void correr(){
        System.out.println("El perro corre muy rapido");
    }
    @Override
    public void comer(){
        System.out.println("El perro come croquetas y pollo");
    }

    @Override
    public String toString() {
        return super.toString()+ "AnimalTerrestre{" + "numeroPatas=" + numeroPatas + '}';
    }
    
}

