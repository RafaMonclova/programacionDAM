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
abstract public class Product {
    
    protected double regularPrice;

    public Product(double regularPrice) {
       
        this.regularPrice = regularPrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
    
    abstract public double computeSalePrice();
    abstract public double computeSpecialCustomerPrice();
    
    
}
