package listas;

 


//Pila: el ultimo en entrar es el primero en salir

import java.util.*;



public class Ej8_movimiento{  	
	int nPasos;
	String direccion;
	
	Ej8_movimiento(int pasos, String darMovimiento){
		nPasos = pasos;
		direccion = darMovimiento;
	}
	String getDireccion(){
		return direccion;
	}
	int getPasos(){
		return nPasos;
	}	
	
	void invertirDireccion(){
		if (direccion.equals("Izquierda")){
			direccion = "Derecha";
		}else if (direccion.equals("Derecha")){
			direccion = "Izquierda";
		}else if (direccion.equals("Arriba")){
			direccion = "Abajo";
		}else{
			direccion = "Arriba";
		}
	}	
	String devolverInversa(){
		if (direccion.equals("Izquierda")){
			return  "Derecha";
		}else if (direccion.equals("Derecha")){
			return "Izquierda";
		}else if (direccion.equals("Arriba")){
			return "Abajo";
		}else{
			return "Arriba";
		}
	}	
		
	
     public static void main(String[] args) {

	}
} 
