
package herencia;

/**
 *
 * @author rafa
 */
public class PruebaPersona {
    
    
    public static void main(String[] args){
        
        Directivo dir = new Directivo("LUIS","PEREZ","87654321","23/02/2022",2000,23,5,500,700,"Jefe de planta");
        Programador prog = new Programador("RAFA","MONCLOVA","12345678","25/02/2022",1200,12,7);
        
        dir.imprimirNomina();
        prog.pedirVacaciones();
        prog.pedirAumento();
        prog.imprimirNomina();
        
    }
    
}
