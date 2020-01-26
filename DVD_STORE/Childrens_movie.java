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
public class Childrens_movie implements Rent_buy{
    //method to calculate rental of childrens type of movie
    @Override
    public double rent(int daysRented) {
        
        double base_price_rental = 1.5;
        double penalty_price = 1.5;
        int duration_days = 3;
        double thisamt = 0;
        
        thisamt += base_price_rental;
            if(daysRented > duration_days)
            {
               thisamt +=  (daysRented - duration_days) * penalty_price;
            }

            return thisamt;
    }

    //method to buy the childrens movie
    @Override
    public double buy() {
        double price_buy = 7.0;
        
        return price_buy;
    }
    
    
    
}
