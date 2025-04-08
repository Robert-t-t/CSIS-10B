package homework6.PartB;

/**
 * Implements a Queue using Linked Nodes
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LQueue
{
    private Node front;   // reference to the front node of the queue (the next to be dequeued)
    private Node back;    // reference to the back node of the queue (the last item that was added)
    
    // Define Constructor here

    public LQueue(){
        front = null;
        back = null;
    }
    
    
    public void enqueue(Object value){
       Node addNode = new Node(value, null);

       if(isEmpty()){
           front = addNode;
           back = addNode;
       }
       else
       {
           back.next = addNode;
           back = addNode;
       }
    }
    // post: the value is added to the tail of the structure

    public Object dequeue(){

        Object temp = null;

        if(!isEmpty()){
            temp = front.element;
            front = front.next;

            if(front == null){
                back = null;
            }
        }

        return temp;
    }
    // pre: the queue is not empty
    // post: the head of the queue is removed and returned

    public Object getFront(){return front.element;}
    // pre: the queue is not empty
    // post: the element at the head of the queue is returned

    public boolean isEmpty(){return front == null && back == null;}
    // post: returns true if and only if the queue is empty

    public int size(){
        Node current = front;
        int counter = 0;

        while(current != null){
            counter++;
            current = current.next;
        }

        return counter;
    }
    // post: returns the number of elements in the queue

    public String toString(){

        Node current = front;

        String result = " ";

        boolean first = true;

        while(current != null){

            if(first){
                result = result + current.element;
                first = false;
                current = current.next;
            }

           result = result + ", " + current.element;

           current = current.next;
        }

        result = "[" + result + "]";

        return result;
    }

    
    private class Node                // Facilitator class for the LQueue class
    {
        // Data members
        public Object element;         // Queue element
        public Node next;         // Pointer to the next element
    
        // because there are no access labels (public, private or protected),
        // access is limited to the package where these methods are declared
    
        // Constructor
        Node ( Object elem, Node nextPtr )
        { element = elem; next = nextPtr;  }
    
    } // Class Node
    
}