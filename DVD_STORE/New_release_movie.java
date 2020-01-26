/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental5;

/**
 *
 * @author bhatu
 */
public class New_release_movie implements Rent_buy{
     //method to calculate the rental of new release movie
    @Override
    public double rent(int daysRented) {
        double base_price_rental = 3.0;
        double thisamt = 0;
        
            //calculation of rental for new release movie
            thisamt += daysRented * base_price_rental;
            
        return thisamt;
    }

    //method to calculate the price of new release movie for buying
    @Override
    public double buy() {
        double price_buy = 10.0;
        
        return price_buy;
    }
   
    
}
