package homework6;

import java.util.*;

/**
 * Tester App for Stack Classes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackTester
{
    public static void main(String [] args){
        
        /****************** 1 make an array based stack **********************
        StackArray st = new StackArray();       

        System.out.println("1 Empty stack ? " + st.isEmpty() );
        
        System.out.println("1 StackArray st = " + st);
        //****************** end 1 **********************/
        /****************** 2 add items **********************

        st.push("ball");
        st.push("cap");
        st.push("mitt");
        st.push("cleats");
        System.out.println("2 Stack st = " + st);
        System.out.println("2 Stack st contains " + st.size() + " elements");  
        
        //****************** end 2 **********************/
        /****************** 3 examine and remove items **********************
        
        System.out.println("3 top of stack = "+ st.peek());
        
        while( !st.isEmpty())
            System.out.println( st.pop());
        
        //****************** end 3 **********************/
        //****************** 4 make an linked node based stack **********************
        StackLink st = new StackLink();       

        System.out.println("4 Empty stack ? " + st.isEmpty() );
        
        System.out.println("4 StackLink st = " + st);
        //****************** end 4 **********************/
        //****************** 5 add items **********************

        st.push("ball");
        st.push("cap");
        st.push("mitt");
        st.push("cleats");
        System.out.println("5 Stack st = " + st);
        System.out.println("5 Stack st contains " + st.size() + " elements");  
        
        //****************** end 5 **********************/
        //****************** 6 examine and remove items **********************
        
        System.out.println("6 top of stack = "+ st.peek());
        
        while( !st.isEmpty())
            System.out.println( st.pop());
        
        //****************** end 6 **********************/
    }
    
}
