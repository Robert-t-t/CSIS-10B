package Lab6;

/**
 * A class of bags whose entries are stored in a chain of linked nodes.
 * The bag is never full.
 *
 * @author Frank M. Carrano
 * @version 3.0
 */
public class LinkedBag {
    private Node firstNode;       // reference to first node
    private int size;

    public LinkedBag() {
        this.size = 0;
        this.firstNode = null;
    } // end default constructor

    // [OPTIONAL - Not Graded] -------------------------
    public LinkedBag(Object[] items, int numberOfItems) {

    } // end constructor

    /**
     * Adds a new entry to this bag.
     *
     * @param newEntry the object to be added as a new entry
     * @return true
     */
    public boolean add(Object newEntry) // OutOfMemoryError possible
    {
        try {
            Node addNode = new Node(newEntry, firstNode);
            size++;
            return true;
        } catch (Exception e) {
            System.out.println("CANT ADD");
            return false;
        }
    } // end add

    /**
     * Sees whether this bag is empty.
     *
     * @return true if the bag is empty, or false if not
     */
    public boolean isEmpty() {
        return size == 0;
    } // end isEmpty


    /**
     * Sees whether this bag is full.
     *
     * @return false
     */
    public boolean isFull() {
        return false;
    } // end isFull

    /**
     * Gets the number of entries currently in this bag.
     *
     * @return the integer number of entries currently in the bag
     */
    public int getCurrentSize() {
        return size;
    } // end getCurrentSize

    /**
     * Counts the number of times a given entry appears in this bag.
     *
     * @param anEntry the entry to be counted
     * @return the number of times anEntry appears in the bag
     */
    public int getFrequencyOf(Object anEntry) {

        Node current = firstNode;
        int count = 0;

        while(current != null){
            if(current.data == anEntry)
               count++;

            current = current.next;
        }

        return count;
    } // end getFrequencyOf

    /**
     * Tests whether this bag contains a given entry.
     *
     * @param anEntry the entry to locate
     * @return true if the bag contains anEntry, or false otherwise
     */
    public boolean contains(Object anEntry) {

       Node current = firstNode;

       while(current != null){

          if(current.data == anEntry){
             return true;
          }

          current = current.next;
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
        if(!isEmpty()) {
            Node temp = firstNode;
            firstNode = firstNode.next;
            size--;
            return temp.data;
        }
        return null;
    } // end remove

    /**
     * Removes one occurrence of a given entry from this bag, if possible.
     *
     * @param anEntry the entry to be removed
     * @return true if the removal was successful, or false otherwise
     */
    public boolean remove(Object anEntry) {

        Node removetarget = firstNode;
        Node slow = firstNode;
        boolean flag = false;

        if(isEmpty()){
            return false;
        }

        //take care of the first node
        if(removetarget.data == anEntry){
            firstNode = removetarget.next;
            return true;
        }

        //Take care of linklist 2+
        while(removetarget != null ){

            if(removetarget.data == anEntry){
                flag = true;
                break;
            }
            else{
                slow = slow.next;
            }
            removetarget = removetarget.next;
        }

        slow.next = removetarget.next;
        size--;

        return flag;
    } // end remove


    /**
     * Removes all entries from this bag.
     */
    public void clear() {

           while(size != 0){
               remove();
               size--;
           }
    } // end clear


//     public BagInterface<T> union(BagInterface<T> anotherBag)
//     {
//         
//         
//     }


    /**
     * Retrieves all entries that are in this bag.
     *
     * @return a newly allocated array of all the entries in the bag
     */
    public Object[] toArray() {

        return null;
    } // end toArray


    public String toString() {
        return "";
    }

    private class Node {
        public Object data; // entry in bag
        public Node next; // link to next node

        private Node(Object dataPortion) {
            this(dataPortion, null);
        } // end constructor

        private Node(Object dataPortion, Node nextNode) {
            data = dataPortion;
            next = nextNode;
        } // end constructor
    } // end Node
} // end LinkedBag
