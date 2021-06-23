package Zoologico;

public class Pajaro extends AnimalAereo {

    private String tipoPico;

    public Pajaro(int numeroAlas, String nombre, String origen, String color) {
        super(numeroAlas, nombre, origen, color);
    }

    public String getTipoPico() {
        return tipoPico;
    }

    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }

    public void recolectarRamas() {
        System.out.println("El colibri recolecta ramas para hacer su nido");
    }

    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }

}
