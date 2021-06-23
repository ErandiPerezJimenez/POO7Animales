
package Zoologico;


public class AnimalAcuatico extends Animal {
    private int numeroAletas;

    public AnimalAcuatico() {
    }
     

    public AnimalAcuatico(int numeroAletas, String nombre, String origen, String color) {
        super(nombre, origen, color);
        this.numeroAletas = numeroAletas;
        
        
    }

    public int getNumeroAletas() {
        return numeroAletas;
    }

    public void setNumeroAletas(int numeroAletas) {
        this.numeroAletas = numeroAletas;
    }
    
    @Override
    public void comer() {
        System.out.println("La ballena come peces");
    }
    public void nadar(){
        System.out.println("La ballena nada mucho en verano");
    }

    @Override
    public String toString() {
        return super.toString()+"AnimalAcuatico{" + "numeroAletas=" + numeroAletas + '}';
    }
    
    
}
