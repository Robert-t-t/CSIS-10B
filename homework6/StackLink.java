package homework6;

import java.util.Currency;

/**
 * Implements Stack using Linked Nodes
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StackLink {
    private Node top;    // reference to the top node of our stack
    private int size;

    public StackLink() {
        this.top = null;
        size = 0;
    }

    /**
     * Pushes a new item onto top of stack
     *
     * @param item the item to add to the stack
     */
    public void push(Object item) {

        Node addNode = new Node(item, top);
        top = addNode;
        size++;
    }

    /**
     * Pops an item off the top of stack
     *
     * @return the top item
     */
    public Object pop() {

        Object temp = null;

        if (!isEmpty()) {
            temp = top.data;
            top = top.next;
        }

        return temp;
    }

    /**
     * Returns the top item from stack without removing
     *
     * @return the top item
     */
    public Object peek() {

        Object temp = null;

        if (!isEmpty()) {

            temp = top.data;
        }

        return temp;
    }

    /**
     * Checks for empty stack
     *
     * @return true iff stack is empty
     */
    public boolean isEmpty() {
        return top == null;
    }

    /**
     * Gets the number of items in the stack
     *
     * @return the number of items in stack
     */
    public int size() {
        return size;
    }

    /**
     * Creates and returns a string version of stack
     *
     * @return a string reprenting items in stack
     */
    public String toString() {

        Node current = top;
        String result = "" ;
        boolean first = true;

        while (current != null) {

            if (first) {
                result += current.data;
                first = false;
            }
            else
            result = current.data + ", " + result;

            current = current.next;
        }

        result = "[" + result + "]";


        return result;
    }

    private class Node {
        public Object data;     // data field -- the data stored in this particular node
        public Node next;  // next field -- reference to next SLLNode in list, or null

        // Constructor
        Node(Object data, Node next) {
            this.data = data;
            this.next = next;
        }

    }
}