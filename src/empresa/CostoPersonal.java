/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;


public class CostoPersonal {
 
	static float costoDelPersonal (Trabajador trabajadores [ ] ) {
		float costoFinal = 0;
		
            for (Trabajador trabajador : trabajadores) {
                if (trabajador.getTipoTrabajador( )==Trabajador.DIRECTOR || trabajador.getTipoTrabajador( )==Trabajador.SUBDIRECTOR){
                    costoFinal += trabajador.getNomina( );
                }
                else
                {
                    costoFinal += trabajador.getNomina( ) + (trabajador.getHorasExtras( ) * 20);
                }
            }
		return costoFinal ;
	}
}