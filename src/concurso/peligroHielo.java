package concurso;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//package concurso;

import java.util.Scanner;

/**
 *
 * @author rafa
 */
public class peligroHielo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n; 
        int contadorPeligro;
        boolean ultimoAviso;
        
        while(true){
            
            n = sc.nextInt();
            
            if(n == 0){
                break;
            }
            
            contadorPeligro = 0;
            ultimoAviso = true;
            
            for (int i = 0; i < n; i++) {
                
                int num = sc.nextInt();
                if (ultimoAviso && num <= 4) {
                    contadorPeligro++;
                    ultimoAviso = false;
                }
                else if (num > 6) ultimoAviso = true;
                
            }
            
            System.out.println(contadorPeligro);
            
        }
        
        
    }
    
}
