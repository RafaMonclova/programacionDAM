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
 public class Book extends Product{

    
    protected String publisher;
    protected int yearPublished;

    public Book(String publisher, int yearPublished, double regularPrice) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
    
    
    
    @Override
    public double computeSalePrice(){
        return regularPrice * 0.5;
    }

    @Override
    public double computeSpecialCustomerPrice() {
        return this.computeSalePrice() - 2;
    }
    
    
    
}
