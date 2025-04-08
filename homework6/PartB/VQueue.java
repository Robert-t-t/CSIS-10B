package homework6.PartB;

import java.util.Vector;
/**
 * Implements a Queue using a Vector
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VQueue<E>
{
    // declare a Vector<E> queue here to hold the data in the VQueue
    Vector<E> myVector = new Vector<E>();

    public VQueue(){
        Vector<E> myVector = new Vector<E>();
    }

    public void enqueue(E value){
        myVector.add(value);
    }
    // post: the value is added to the tail of the structure
    
    public E dequeue(){
       if(myVector.isEmpty()){
           return null;
       }

       return myVector.remove(0);
    }
    // pre: the queue is not empty
    // post: the head of the queue is removed and returned
    
    public E getFront(){return myVector.get(0);}
    // pre: the queue is not empty
    // post: the element at the head of the queue is returned
    
    public boolean isEmpty(){return myVector.isEmpty();}
    // post: returns true if and only if the queue is empty
    
    public int size(){return myVector.size();}
    // post: returns the number of elements in the queue
    public String toString() {
        String result = "[";

        for (int i = 0; i < myVector.size(); i++) {
            if (i > 0 && i != myVector.size() - 1) {
                result += ", ";
            }
            result += myVector.get(i);
        }

        result += "]";
        return result;
    }

}