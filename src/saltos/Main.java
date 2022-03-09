/*
Crea una
clase principal con 3 saltadores registra 2 saltos aleatorios para cada uno y
muestra los saltadores por orden y a continuación los records.


 */
package saltos;

/**
 *
 * @author robertruhe
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Saltador saltador1 = new Saltador("Pepe", 20);
        Saltador saltador2 = new Saltador("Antonio", 25);
        Saltador saltador3 = new Saltador("Juan", 30);
        saltador1.registrarSalto((int)(Math.random()*10 + 1));
        saltador1.registrarSalto((int)(Math.random()*10 + 1));
        saltador2.registrarSalto((int)(Math.random()*10 + 1));
        saltador2.registrarSalto((int)(Math.random()*10 + 1));
        saltador3.registrarSalto((int)(Math.random()*10 + 1));
        saltador3.registrarSalto((int)(Math.random()*10 + 1));
        System.out.println(Saltador.getRecords());
    }
   
}
