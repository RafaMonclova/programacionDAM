/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author alumno
 */
public class actividad5 {
    
    public static void main(String[] args){
        
        
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
        
        
        
    }
    
    public static void methodA(){
        
        System.out.println("ENter methodA()");
        
        try{
            System.out.println(1 / 0);
        }
        finally{
            System.out.println("Finally in methodA()");
        }
        
        System.out.println("Exit methodA()");
        
    }
    
    
    
    
    
    
}
