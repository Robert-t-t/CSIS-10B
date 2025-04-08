package homework6;

import java.util.Arrays;

/**
 * Implements Stack using an Array
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StackArray
{
    private Object [] array; // object array we store items in  
    private int top;        // the cell where the current top of stack is located
    private static final int DEFAULT_CAPACITY = 10;


    public StackArray(){

        array = new Object [DEFAULT_CAPACITY];
        top = -1;
    }
    
    
    
    /** 
     * Pushes a new item onto top of stack
     * @param item the item to add to the stack
     */
    public void push(Object item){

        if(top + 1 == array.length){
            array = Arrays.copyOf(array, 2 * array.length);
        }

        top++;
        array[top] = item;
    }

    /** 
     *  Pops an item off the top of stack
     *  @return the top item
     */
    public Object pop(){

        Object topItem = array[top];

        array[top] = null;
        top--;

        return topItem;
    }
    
    /** 
     *  Returns the top item from stack without removing
     *  @return the top item
     */
    public Object peek(){return array[top];}

    /**
     * Checks for empty stack
     * @return true iff stack is empty
     */
    public boolean isEmpty(){

        return top == -1;
    }
    
    /** 
     * Gets the number of items in the stack
     * @return the number of items in stack
     */
    public int size(){return top + 1;}
    
    /**
     * Creates and returns a string version of stack
     * @return a string reprenting items in stack
     */
    public String toString(){

        String result = "[";

        for (int i = 0; i <= top ; i++) {
            result += array[i];

            if(i < top){
                result += ", ";
            }
        }
        result += "]";
        return result;
    }
}