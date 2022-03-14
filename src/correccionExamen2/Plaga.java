/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package correccionExamen2;

/**
 *
 * @author alumno
 */
public class Plaga {
    
    int [][] campo;
    
    public Plaga(){  
        campo = new int [4][4];   
        for(int i = 0;i<campo.length;i++){
            for(int j = 0;j<campo[i].length;j++){
                campo[i][j] = (int)((Math.random()*8)+1);
            }
            
        }
    }
    
    boolean eliminado(){
        
        boolean estaEliminada=true;
        
        for(int i = 0;i<campo.length;i++){
            for(int j = 0;j<campo[i].length;j++){
                if(campo[i][j] != 0){       
                    estaEliminada = false;    
                }
            }
        }
        
        return estaEliminada;
        
    }
    
    public void mostrar(){
        
        for(int i = 0;i<campo.length;i++){
            for(int j = 0;j<campo[i].length;j++){
                System.out.print(campo[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public void glifosato(){
        
        int potencia = (int)((Math.random() * 3)+1);
        int posicionX = (int)(Math.random() * 4);
        int posicionY = (int)(Math.random() * 4);
        
        System.out.println("p "+potencia+"x "+posicionX+"y "+posicionY);
        
        
        
        /*
        switch(potencia){
            
            case 3:
                for(int i = posicionX-2;i<posicionX+2;i++){
                    for(int j = posicionY-2;j<posicionY+2;j++){  
                        if(i>=0 && i<campo.length && j>=0 && j<campo[i].length){
                            
                            campo[i][j]--; 
                        }        
                    }
                }
            
            case 2:
                for(int i = posicionX-1;i<posicionX+1;i++){
                    for(int j = posicionY-1;j<posicionY+1;j++){  
                        if(i>=0 && i<campo.length && j>=0 && j<campo[i].length){
                            
                            campo[i][j]--; 
                        }        
                    }
                }
                
            case 1:
                if(campo[posicionY][posicionX] > 0)
                    campo[posicionY][posicionX]--;
             
            
        }
        */
        
    }
    
    public static void main(String[] args){
        
        Plaga p = new Plaga();
        
        while(!p.eliminado()){
            p.glifosato();
            p.mostrar();
        }
        
    }
    
    
}
