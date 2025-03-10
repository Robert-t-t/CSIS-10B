package Lab5PartA;

/**
 * A class of bags whose entries are stored in a fixed-size array.
 */
public class ArrayBag {
    private Object[] myArray;
    private static final int DEFAULT_CAPACITY = 25;
    private int mySize = 0;

    /**
     * Creates an empty bag whose initial capacity is 25.
     */
    public ArrayBag() {
        myArray = new Object[DEFAULT_CAPACITY];

    } // end default constructor

    /**
     * Creates an empty bag having a given initial capacity.
     *
     * @param capacity the integer capacity desired
     */
    public ArrayBag(int capacity) {
        myArray = new Object[capacity];
    } // end constructor

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry the object to be added as a new entry
     * @return true if the addition is successful, or false if not
     */
    public boolean add(Object newEntry) {


        boolean result = true;
        if (isFull()) {
            result = false;

        } else {
            myArray[mySize] = newEntry;
            mySize++;
        }
        return result;
    } // end add

    /**
     * Sees whether this bag is empty.
     *
     * @return true if this bag is empty, or false if not
     */
    public boolean isEmpty() {
        return mySize == 0;
    } // end isEmpty


    /**
     * Sees whether this bag is full.
     *
     * @return true if this bag is full, or false if not
     */
    public boolean isFull() {

        return mySize == myArray.length;
    } // end isFull


    /**
     * Gets the current number of objects in this bag.
     *
     * @return the integer number of objects currently in the bag
     */
    public int getCurrentSize() {

        return DEFAULT_CAPACITY;
    } // end getCurrentSize

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    public int getFrequencyOf(Object anEntry) {

        int counter = 0;
        for (int i = 0; i < mySize; i++) {
            if (myArray[i] == anEntry) {
                counter++;
            }
        }

        return counter;
    } // end getFrequencyOf

    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry the entry to locate
     * @return true if this bag contains anEntry, or false otherwise
     */
    public boolean contains(Object anEntry) {

        for (int i = 0; i < mySize; i++) {
            if (myArray[i].equals(anEntry)) {
                return true;
            }
        }
        return false;
    } // end contains


    /**
     * Removes one unspecified entry from this bag, if possible.
     *
     * @return either the removed entry, if the removal
     * was successful, or null
     */
    public Object remove() {

        Object result = null;

        if (isEmpty()) {
            return null;
        } else {
            result = myArray[mySize - 1];
            myArray[mySize - 1] = null;
            mySize--;
        }
        return result;
    } // end remove

    /**
     * Removes one occurrence of a given entry from this bag.
     *
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false otherwise
     */
    public boolean remove(Object anEntry) {

        for (int i = 0; i < mySize; i++) {

            if (myArray[i] == anEntry) {

                Object temp = myArray[mySize - 1];
                myArray[mySize - 1] = null;
                myArray[i] = temp;
                mySize--;
                return true;

            }

        }

        return false;
    } // end remove


    /**
     * Removes all entries from this bag.
     */
    public void clear() {
        while (!isEmpty()) {
            remove();
        }
    } // end clear


    /**
     * Retrieves all entries that are in this bag.
     *
     * @return a newly allocated array of all the entries in the bag
     */
    public Object[] toArray() {

        Object[] temp = new Object[mySize];

        for (int i = 0; i < mySize; i++) {
            temp[i] = myArray[i];
        }

        return temp;
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
            if (k < mySize - 1) result += myArray[k] + ", "; // up to item before last
            else result += myArray[k];  // the last item
        return result;
    }
} // end ArrayBag