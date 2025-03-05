package assignment1;

import java.util.Random;
/**
 * class GeneralCoin represents a coin that can be flipped.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */


public class GeneralCoin
{
    private String sideUp;
    private Random gen; 

    /**
     * Constructor for objects of class GeneralCoin
     */
    public GeneralCoin()
    {
        gen = new Random();  // initialize gen with a new Random object (only do this once)
        
        /*Write your code here*/
        // randomly set sideUp to either "heads" or "tails" 
        //   based on the outcome of gen.nextInt(2)
        //
        //  for example, if (gen.nextInt(2) is 0, then set sideUp to "heads"
        //               otherwise, set sideUp to "tails"
        
        
    }

    /*Write your methods here*/
    // add methods to getSideUp, setSideUp, and toss the coin


    // Note that the toss() method is a void method that simply changes the value of sideUp 
    // to "heads" or "tails" based on the results of gen.nextInt(2),  
    // similarly to what's happening in the GeneralCoin constructor. 

}
