/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;


public class CostoPersonal {
 
	static double costoDelPersonal (Trabajador trabajadores [ ] ) {
		double costoFinal = 0;
		
            for (Trabajador trabajador : trabajadores) {
                costoFinal += trabajador.coste();
            }
		return costoFinal ;
	}
}