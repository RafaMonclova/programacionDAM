package listas;

/* 
2. Crea una aplicación con dos listas (ArrayList) de 100 números aleatorios del 1 al 1000 
   y cree una tercera que en cada posición tendrá el mayor número de las dos anteriores.
*/

//Pila: el ultimoen entrar es el primero en salir

import java.util.*;

//saber si es palindrome

public class Ej8_recorrido{  	
	
	Stack <Ej8_movimiento> camino = new Stack<Ej8_movimiento>();
	
	void setCamino(Ej8_movimiento UnMovimiento){
		camino.push(UnMovimiento);
	}	
	
     public static void main(String[] args) {
		Ej8_recorrido miRecorrido = new Ej8_recorrido();
		miRecorrido.setCamino(new Ej8_movimiento(5, "Izquierda"));
		miRecorrido.setCamino(new Ej8_movimiento(6, "Abajo"));
		miRecorrido.setCamino(new Ej8_movimiento(7, "Derecha"));
		miRecorrido.setCamino(new Ej8_movimiento(7, "Arriba"));
		miRecorrido.camino.push(new Ej8_movimiento(7, "Arriba"));
		
		
		//miRecorrido.camino.peek().invertirDireccion();		
		//System.out.println(miRecorrido.camino.peek().getDireccion());
		
		while(!miRecorrido.camino.isEmpty()){
				Ej8_movimiento actual=miRecorrido.camino.pop();
				System.out.print("" + actual.getPasos()+",");
				System.out.println(actual.devolverInversa());
			}	
	}
} 
