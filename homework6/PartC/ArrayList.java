package homework6.PartC;

import java.util.Arrays;
/**
   A class that implements the ADT list by using an array.
   The list is never full.
   @author Frank M. Carrano
   @version 3.0
*/
public class ArrayList
{
    private Object[] myArray;   // array of list entries
    private int mySize;
    private static final int DEFAULT_INITIAL_CAPACITY = 25;  

    // public methods:  
    public ArrayList()
    {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor

    public ArrayList(int initialCapacity)
    {
       mySize = 0;   
       myArray  = new Object[initialCapacity];
    } // end constructor
  
    
    public void add(Object newEntry)
    {
        myArray[mySize] = newEntry;
        mySize++;
    } // end     add
   

    /** Converts all the data in the bag into one big String
        @return a very long String of objects contained in bag */
    public String toString()
    {   
        int k;
        String result = "";
        for (k=0; k<mySize; k++)
          if (k<mySize-1)
            result += myArray[k] + ", "; // up to item before last
          else
            result += myArray[k];  // the last item
        return result;
    }     
  
    /** Add your assigned method here */

    public void swapWithEnd(int position){

        if(mySize > 0) {

            int index = position - 1;

            int lastIndex = mySize -1;

            Object temp = myArray[index];

            myArray[index] = myArray[lastIndex];

            myArray[lastIndex] = temp;

        }
    }
} // end AList

