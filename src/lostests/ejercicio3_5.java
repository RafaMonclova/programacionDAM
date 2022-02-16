/*
 El siguiente código nos ha fallado cuando 011 en decimal es -3
en lugar de 3 pasa el depurador identifica el error y corrígelo.

 */
package lostests;
import java.util.*;

public class ejercicio3_5 {
    public static void main(String[] args) {			
    String binStr;
    int binStrLen;
    int dec=0;
    boolean invalid =false;		
    System.out.println("Ingresa una cadena binaria: ");
    Scanner sc = new Scanner(System.in);			
    binStr = sc.nextLine();
    binStrLen = binStr.length();			
    int number = 0;
    int exp=binStrLen;			
    for (int pos=0; pos < binStrLen; ++pos){				
        char binChar = binStr.charAt(pos);
        exp--;
        if (binChar == '1') {
            number += Math.pow(2, exp);	// ERROR, number vale 0 y al restarle se queda negativo: 		
            }                           //number -= Math.pow(2, exp);	
        else if (binChar == '0') {
        continue;			
        } 
        else {
        invalid = true;
        break;
        }
    }			
    if (!invalid)
        System.out.println(binStr + " en decimal es " + number);
    else
        System.out.println("Entrada invlida");
    } 
}
