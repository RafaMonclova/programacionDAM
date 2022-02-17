/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lostests;

public class Voto {
    
    String Comprobar(int edad){
        if(edad>18){
            return ("puedes votar");
        }else{
            return ("NO puedes votar");
            
        }
    }
    public static void main(String[] args){
        //TODO coda application logic here
        Voto v = new Voto();
        v.Comprobar(18);
        
    }
    
}