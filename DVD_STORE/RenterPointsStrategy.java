/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierental5;

import static movierental5.Movie.NEW_RELEASE;

/**
 *
 * @author bhatu
 */
public class RenterPointsStrategy {
    
     int renterPoints=0;
    
     public int calfrequentpoints(Movie Movie){
         
         switch(Movie.getPriceCode())
         {
             case 0 : 
                 Childrens_renterpointsStrategy c_rps = new Childrens_renterpointsStrategy();
                 renterPoints = c_rps.rent_points(Movie);
             case 1 :
                 new_release_renterpointsStrategy n_rps = new new_release_renterpointsStrategy();
                 renterPoints = n_rps.rent_points(Movie);
             case 2 :
                 regular_renterpointsStrategy r_rps = new regular_renterpointsStrategy(); 
                 renterPoints = r_rps.rent_points(Movie);
         }
        return renterPoints;
     }
    
}
