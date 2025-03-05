package assignment1;

/**
 * Write a description of class CoinApp here.
 * 
 * @author Robert Cruz
 * @version 03/04/2025
 */
public class CoinApp
{
    // these two variables are declared static to assist with zyLab testing
    static int countHeadsA = 0;   // do not change 
    static int countHeadsB = 0;   //  or move declaration
    
    public static void main(String [] args)
    {
        /******************** Prob 2b) ****************************************
        // Write a program that tosses two GeneralCoin coins 50 times each. 
        // Record and report how many times each coin lands heads up. 
        // Also report which coin landed heads up most often.
        //
        //  use the following to get started
        
        GeneralCoin a = new GeneralCoin();
        GeneralCoin b = new GeneralCoin();
        
        a.toss(); 
        b.toss();
        
        System.out.println("Coin a is " + a.getSideUp() 
                           + " and Coin b is " + b.getSideUp());
        
        // Now add statements to toss both coins 50 times,
        //  count the number of times each coin came up heads
        //  print the results, and print which coin had more heads
        
        
        // continue...
                           
                           
        //******************** END Prob 2b) ****************************************/
        
    }
}
