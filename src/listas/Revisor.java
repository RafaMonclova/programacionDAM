package listas;

/* 
2. Crea una aplicación con dos listas (ArrayList) de 100 números aleatorios del 1 al 1000 
   y cree una tercera que en cada posición tendrá el mayor número de las dos anteriores.
*/

//Pila: el ultimoen entrar es el primero en salir

import java.util.*;


public class Revisor{  	
	
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				 
		Set <String> palabrasDiccionario = new LinkedHashSet<>();	
		Set <String> palabrasFraseintroducida = new LinkedHashSet<>();			
		
		//System.out.println("Introduce una frase: ");
		String frase = "qultura vizarro ir amor ola paradima jitano zer dar resiliencia rae balla cojer";
		String[] partes = frase.split(" ");	
		
		for (int i = 0; i < partes.length; i++){
			palabrasFraseintroducida.add(partes[i]);
		}			
		
		while(sc.hasNextLine()) {
			String linea = sc.nextLine();
			palabrasDiccionario.add(linea);
		}	
/*		
		List<String> palabrasErroneas = new ArrayList<String>();
		
		for (String palabra: palabrasFraseintroducida){
			if (!palabrasDiccionario.contains(palabra)){
				palabrasErroneas.add(palabra);
			}
		}		
		System.out.println("Las palabras erroneas son: " + palabrasErroneas);	
*/		
		palabrasFraseintroducida.removeAll(palabrasDiccionario);
				System.out.println("Las palabras erroneas son: " + palabrasFraseintroducida);

			
	}
} 
