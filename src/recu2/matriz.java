/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recu2;

/**
 *
 * @author RAFAEL MONCLOVA SUANO
 */
public class matriz {
    
    public static void main(String[] args){
        
        String[][] matriz = new String[10][10];
        

        
        String c1 = "A"+(int)(Math.random()*4)+1;
        String c2 = "B"+(int)(Math.random()*4)+1;
        String c3 = "C"+(int)(Math.random()*4)+1;
        String c4 = "D"+(int)(Math.random()*4)+1;
        String c5 = "E"+(int)(Math.random()*4)+1;
        

        matriz[(int)(Math.random()*9)+1][(int)(Math.random()*9)+1] = c1;
        matriz[(int)(Math.random()*9)+1][(int)(Math.random()*9)+1] = c2;
        matriz[(int)(Math.random()*9)+1][(int)(Math.random()*9)+1] = c3;
        matriz[(int)(Math.random()*9)+1][(int)(Math.random()*9)+1] = c4;
        matriz[(int)(Math.random()*9)+1][(int)(Math.random()*9)+1] = c5;

        
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                
                if(matriz[i][j].substring(0).equals("1")){
                    
                    int tiradaAleatoria = (int)(Math.random()*5)+2;
                    
                    if((j+tiradaAleatoria) < matriz.length){
                        matriz[i][j] = matriz[i][j+tiradaAleatoria];
                    }
                    
                    
                    
                }
                
                if(matriz[i][j].substring(0).equals("2")){
                    int tiradaAleatoria = (int)(Math.random()*5)+2;
                    if((j-tiradaAleatoria) > matriz.length){
                        matriz[i][j] = matriz[i][j-tiradaAleatoria];
                    }
                    
                    
                }
                
                if(matriz[i][j].substring(0).equals("3")){
                    int tiradaAleatoria = (int)(Math.random()*5)+2;
                    if((i-tiradaAleatoria) > matriz.length){
                        matriz[i][j] = matriz[i-tiradaAleatoria][j];
                    }
                    
                    
                }
                
                if(matriz[i][j].substring(0).equals("4")){
                    int tiradaAleatoria = (int)(Math.random()*5)+2;
                    if(i+tiradaAleatoria < matriz.length){
                        matriz[i][j] = matriz[i+tiradaAleatoria][j];
                    }
                    
                    
                }
                
            }
            System.out.println();
        }
        
    
        
        
        
    }
    
    
}
