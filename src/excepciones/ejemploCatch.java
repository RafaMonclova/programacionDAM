/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class ejemploCatch {

    public static void main(String[] args) {
        try{
            //El fichero debe estar en la raiz del proyecto
            Scanner in = new Scanner(new File("test.in"));
            while(in.hasNext()){
                System.out.println(in.nextLine());
            }
            
            
            
        }catch(FileNotFoundException ex){
            ex.printStackTrace();
            }
    
    
    }
}
