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
public class Customer {
    private String _name;
    private int _age;
    static double totalAmount = 0;
    static int frequentRenterPoints = 0;
    static int flag=0;

    //main megthod of class Customer
    public static void main(String[] args) {
        

        //Customer Object with parameter customer's name and cutsomer's age
    	Customer c1 = new Customer("Customer1",21);
        
        //movie object with parameter title of movie, type of movie and no. of days rented
        Movie m1 = new Movie("Movie1",0,6); 
        totalAmount += m1.movie_rent();
        frequentRenterPoints += m1.renterPoints;
        flag+=m1.flag;
        
    	Movie m2 = new Movie("Movie2",1,2);
        totalAmount += m2.movie_rent();
        frequentRenterPoints += m2.renterPoints;
        flag+=m2.flag;
        
        Movie m3 = new Movie("Movie3",1,4); 
        totalAmount += m3.movie_rent();
        frequentRenterPoints += m3.renterPoints;
        flag+=m3.flag;         
        
        Movie m4 = new Movie("Movie4",1,5); 
        totalAmount += m4.movie_rent();
        frequentRenterPoints += m4.renterPoints;
        flag+=m4.flag;
        
        Movie m5 = new Movie("Movie5",2,4); 
        totalAmount += m5.movie_rent();
        frequentRenterPoints += m5.renterPoints;
        flag+=m5.flag;
        
        Movie m6 = new Movie("Movie6",2,4); 
        totalAmount += m6.movie_rent();
        frequentRenterPoints += m6.renterPoints;
        flag+=m6.flag;
        
        
        c1.print();  
    }

    //constructor of Customer class
    public Customer (String name,int age) {
        _name = name;
        _age = age;
    }


    //method to get he name of the customer
    public String getName() {
        return _name;
    }

  
    
    //method to print the details in XML format
    public void print(){
        String result = "";
        
        result += "<name>" + "\t" + getName() + "\t" + "</name>" + "\n";
        
        result += "<total amount>" + "\t" + "$" + String.valueOf(totalAmount) + "\t" + "</total amount>" + "\n";
        
        result += "<total renter points>" + "\t" + String.valueOf(frequentRenterPoints) + "\t" + "</total renter points>" + "\n\n";
        
        if(frequentRenterPoints > 9)
               {
                   result += "<Offer>" + "\t\t" + "YOU GET A FREE MOVIE RENTAL" + "\t" + "</Offer>" + "\n\n";
               }
        
        if(_age > 17 && _age < 23 && flag > 1)
        {
            result += "<Offer>" + "\t\t" + "AS YOUR AGE IS BETWEEN 18-22 AND RENTING MORE THAN ONE NEW RELEASE MOVIE SO YOUR TOTAL RENTER POINTS GETS DOUBLED" + "\t" + "</Offer>" + "\n";
            
            result += "<Updated Renter Points>" + "\t\t" + String.valueOf(2*frequentRenterPoints) + "\t" + "</Updated Renter Points>";
        }
        
        System.out.println(result);
    }
    
}
