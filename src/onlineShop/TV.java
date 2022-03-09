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
public class TV extends Electronics{

    private int size;

    public TV(int size, double regularPrice, String manufacturer) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
     
    
    @Override
    public double computeSalePrice() {
        return regularPrice * 0.8;
    }

    @Override
    public double computeSpecialCustomerPrice() {
        return this.computeSalePrice() - 100;
    }
    
}
