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
public class Main {
    
    public static void main(String[] args){
        
        
        Product[] pa = new Product[7];
        
        pa[0] = new TV(30,1000,"SAMSUNG");
        pa[1] = new TV(50,2000,"SONY");
        pa[2] = new MP3Player("Blue",250,"Apple");
        pa[3] = new Book("Sun Press",1992,34);
        pa[4] = new Book("Korea Press",1986,15);
        pa[5] = new Camera(2600,"Canon");
        pa[6] = new Camera(300, "Nikon");
        
        double totalRegularPrice = 0;
        double totalSalePrice = 0;
        double SpecilTotal=0;
        for(int i = 0;i<pa.length;i++){
            
            totalRegularPrice += pa[i].getRegularPrice();
            totalSalePrice += pa[i].computeSalePrice();
            SpecilTotal+=pa[i].computeSpecialCustomerPrice();
                    
            System.out.println("Item number "+i);
            System.out.println("Type "+pa[i].getClass());
            System.out.println("Regular Price "+ pa[i].getRegularPrice());
            System.out.println("Sale Price "+ pa[i].computeSalePrice());
            System.out.println("Special Customer Price "+pa[i].computeSpecialCustomerPrice());
            
            
            
        }
        
        System.out.println("TOTAL REGULAR PRICE: "+totalRegularPrice);
        System.out.println("TOTAL SALE PRICE: "+totalSalePrice);
        System.out.println("TOTAL Special Customer Price: "+SpecilTotal);
        
     
}
    
  
}
