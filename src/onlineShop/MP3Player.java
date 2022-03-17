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
public class MP3Player extends Electronics{

    
    private String color;

    public MP3Player(String color, double regularPrice, String manufacturer) {
        super(regularPrice, manufacturer);
          
        this.color = color;
    }
    
    
    @Override
    public double computeSalePrice() {
        return regularPrice * 0.9;
    }

    @Override
    public double computeSpecialCustomerPrice() {
        return this.computeSalePrice() - 15;
    }
    
}
