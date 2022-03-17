/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onlineShop;

/**
 *
 * @author alumno
 */
abstract public class Electronics extends Product{


    private String manufacturer;
    
    public Electronics(double regularPrice,String manufacturer) {
        super(regularPrice);
        
        this.manufacturer = manufacturer;
    }
    
    //abstract public double computeSalePrice();
    
    
    
    
}
