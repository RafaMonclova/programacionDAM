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
public class Camera extends Electronics{

    public Camera(double regularPrice, String manufacturer) {
        super(regularPrice, manufacturer);
    }

    
    @Override
    public double computeSalePrice() {
        return regularPrice * 0.7;
    }

    @Override
    public double computeSpecialCustomerPrice() {//resta un 10%
        return this.computeSalePrice() - (this.computeSalePrice()*10/100);
    }
    
}
