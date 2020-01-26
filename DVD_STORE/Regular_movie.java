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
public class Regular_movie implements Rent_buy{
     //method to calculate the regular movie rental
    @Override
    public double rent(int daysRented) {
        
        double base_price_rental = 2.0;
        double penalty_price = 1.5;
        int duration_days = 2;
        double thisamt = 0;
        
        //calculation of rental for regular movie
        thisamt += base_price_rental;
        if(daysRented > duration_days)
        {
            thisamt +=  (daysRented - duration_days) * penalty_price;
        }
        
        return thisamt;
    }

    //method to calculate the regualr movie price for buying
    @Override
    public double buy() {
        
        double price_buy = 8.0;
        
        return price_buy;
    }
    
}
