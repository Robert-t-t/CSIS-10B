package Lab5PartB;

import java.time.temporal.Temporal;
import java.util.Arrays;
//replace mathod, get positon works but get positon(...) , add, remove doesnt not work

/**
 * A class that implements the ADT list by using an array.
 * The list is never full.
 *
 * @author Frank M. Carrano
 * @version 3.0
 */
public class ArrayList<T> {
    private T[] myArray;   // array of list entries
    private int mySize;
    private static final int DEFAULT_INITIAL_CAPACITY = 25;

    // public methods:  
    public ArrayList() {
        this(DEFAULT_INITIAL_CAPACITY);
    } // end default constructor

    public ArrayList(int initialCapacity) {
        mySize = 0;
        @SuppressWarnings("unchecked")
        T[] tempArray = (T[]) new Object[initialCapacity];
        myArray = tempArray;
    } // end constructor

    public boolean isEmpty() {
        return mySize == 0;
    } // end isEmpty


    public void add(T newEntry) {
        ensureCapacity();
        myArray[mySize] = newEntry;
        mySize++;
    } // end     add

    public boolean add(int newPosition, T newEntry) {

        if(newPosition >= 1 && newPosition <= mySize + 1){

            ensureCapacity();

            int index = newPosition-1;

            int lastindex = mySize -1;

            for(int i = lastindex; i >= index; i--){
                myArray[i +1] = myArray[i];
            }

            myArray[index] = newEntry;
            mySize++;
            return true;
        }
        return  false;
    } // end add

    public boolean remove(int givenPosition) {

        if(givenPosition >= 1 && givenPosition <= mySize){

            for(int i = givenPosition-1; i < mySize-1; i++){

                myArray[i]= myArray[i +1];

            }

            mySize--;
            return true;
        }
        return false;

    } // end remove

    public void clear() {
        for (int k = 0; k < mySize; k++)
            myArray[k] = null;
        mySize = 0;
    } // end clear

    public boolean replace(int givenPosition, T newEntry) {

        //goal is to replace the index at the given position

        int index = givenPosition -1;

        if(index >= 0 && index <= mySize -1) {

            myArray[index] = newEntry;
            return true;
        }

        return false;
    } // end replace

    public T getEntry(int givenPosition) {
        int index = givenPosition - 1;
        return myArray[index];
    } // end getEntry

    public boolean contains(T anEntry) {
        boolean found = false;
        for (int index = 0; !found && (index < mySize); index++) {
            if (anEntry.equals(myArray[index]))
                found = true;
        } // end for

        return found;
    } // end contains

    public int getLength() {
        return mySize;
    } // end getLength

    private void ensureCapacity() {
        if (mySize == myArray.length)
            myArray = Arrays.copyOf(myArray, 2 * myArray.length);
    }

    public Object[] toArray() {
        Object[] result = new Object[mySize];
        for (int index = 0; index < mySize; index++) {
            result[index] = myArray[index];
        } // end for
        return result;
    } // end toArray


    /**
     * Converts all the data in the bag into one big String
     *
     * @return a very long String of objects contained in bag
     */
    public String toString() {
        int k;
        String result = "";
        for (k = 0; k < mySize; k++)
            if (k < mySize - 1)
                result += myArray[k] + ", "; // up to item before last
            else
                result += myArray[k];  // the last item
        return result;
    }


    public int getPosition(String target) {

        for (int i = 0; i < mySize; i++) {

            if (myArray[i] == target) {
                return i + 1;
            }
        }

        return -1;
    }


    public void moveToEnd(int index) {

        int newIndex = index -1;
        int lastIndex = mySize -1 ;


        //the method moveToEnd  should move the item at givenPosition to the end of the list.
        T temp = myArray[newIndex];

        for(int i = newIndex; i < lastIndex; i++){
            myArray[i] = myArray[i+1];
        }
        myArray[lastIndex] = temp;
    }


} // end AList