package Zoologico;

public class main {

    public static void main(String[] args) {

        Ballena animal = new Ballena(4, "Perlita", "Fondo de Bikini", "Gris", 15);
        animal.setNumeroAletas(3);
        animal.getNumeroAletas();
        System.out.println(animal.toString());
        animal.comer();
        animal.pelearConPinocho();

        System.out.println("**********************************************");

        Perro perro1 = new Perro(4, "Eva", "Calle", "Negro");
        perro1.setColorCollar("Morado");
        perro1.getColorCollar();
        System.out.println(perro1.toString());
        perro1.hacerTrucos();
        perro1.comer();
        
        System.out.println("**********************************************");
        
        Pajaro pajaro = new Pajaro(2, "Colibri", "Canada", "Azul y Rojo");
        pajaro.setTipoPico("Puntiagudo");
        pajaro.getTipoPico();
        System.out.println(pajaro.toString());
        pajaro.volar();
        pajaro.recolectarRamas();
        pajaro.comer();

    }
}
