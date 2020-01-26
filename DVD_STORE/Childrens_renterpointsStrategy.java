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
public class Childrens_renterpointsStrategy {
            
    
    public int rent_points(Movie Movie)
    {
        int renterpoints =0;
        if(Movie.getDaysRented() > 5)
        {
            renterpoints+=2;
        }
        else
        {
            renterpoints+=1;
        }
        return renterpoints;
    }
    
}
