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
public class Movie {
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS   = 2;
    
    private String _title;
    private int    _priceCode;
    private int   _daysRented;
    int renterPoints = 0;
    double thisamt = 0;
    int flag=0;
    
    Regular_movie regular_movie = new Regular_movie();
    New_release_movie new_release_movie = new New_release_movie();
    Childrens_movie children_movie = new Childrens_movie();
    
    //constructor of Movie class
    public Movie(String title, int priceCode, int daysRented) {
        _title = title;
        _priceCode = priceCode;
        _daysRented = daysRented;
    }
    
    public Movie(String title,int priceCode)
    {
        _title = title;
        _priceCode = priceCode;
    }
    
    //method to get the price code of movie
    public int getPriceCode() {
        return _priceCode;
    }

    //method to get the title of movie
    public String getTitle() {
        return _title;
    }
    
    //method to get the no. of days movie is rented
    public int getDaysRented() {
        return _daysRented;
    }
    
    //method to calculate the rental of a particular movies
    public double movie_rent() {
               
        if(getPriceCode() == REGULAR)                                   //condition check whether the movie is regular
        {
            thisamt += regular_movie.rent(getDaysRented()); 
        }
        
        else if(getPriceCode() == NEW_RELEASE)                         //condition check whether the movie is new release
        {   
            flag++;
            thisamt += new_release_movie.rent(getDaysRented()); 
        }
        
        else if(getPriceCode() == CHILDRENS)                            //condition check whether the movie is childrens
        {
            thisamt += children_movie.rent(getDaysRented());           
        }
        
       calfrequentpoints(); 
       
       printResultRent();
       
       return thisamt;
    }
    
    //method to calculate the amount of a particular movies for buying
    public double movie_buy() {
               
        if(getPriceCode() == REGULAR)                                   //condition check whether the movie is regular
        {
            thisamt += regular_movie.buy(); 
        }
        
        else if(getPriceCode() == NEW_RELEASE)                         //condition check whether the movie is new release
        {
            thisamt += new_release_movie.buy(); 
        }
        
        else if(getPriceCode() == CHILDRENS)                            //condition check whether the movie is childrens
        {
            thisamt += children_movie.buy();           
        } 
       
       printResultBuy();
       
       return thisamt;
    }
    
    //method to calculate the frequent renter points
    public void calfrequentpoints(){
        
       RenterPointsStrategy rps =  new RenterPointsStrategy();
       renterPoints = rps.calfrequentpoints(this);
        
    }
    
    //method to print the details of a particular movie in XML format for rental
    public void printResultRent(){
        
       String result = "<movie title>" + "\t" +  getTitle() + "\t" + "</movie title>" + "\n";
               
               result +=  "<movie rent cost>" + "\t" + "$" + String.valueOf(thisamt) + "\t" + "</movie rent cost>" + "\n";
               
               result +=  "<renter points>" + "\t" + String.valueOf(renterPoints) + "\t" + "</renter points>" + "\n";
       
        System.out.println(result);
    }

    //method to print the details of a particular movie in XML format for buying
    public void printResultBuy()
    {
         String result = "<movie title>" + "\t" +  getTitle() + "\t" + "</movie title>" + "\n";
               
               result +=  "<movie buy cost>" + "\t" + "$" + String.valueOf(thisamt) + "\t" + "</movie buy cost>" + "\n";
       
        System.out.println(result);
        
    }
    
}
