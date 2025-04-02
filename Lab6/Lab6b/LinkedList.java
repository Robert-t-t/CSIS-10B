package Lab6.Lab6b;

/**
 A linked implementation of the ADT list.

 @author Frank M. Carrano
 @version 3.0
 */
public class LinkedList<T>
{
    private Node firstNode; // reference to first node
    private int  mySize;

    public LinkedList()
    {
        firstNode = null;
        mySize = 0;
    } // end default constructor

    public boolean isEmpty()
    {
        boolean result;

        if (mySize == 0) // or getLength() == 0
        {
            assert firstNode == null;
            result = true;
        }
        else
        {
            assert firstNode != null;
            result = false;
        } // end if

        return result;
    } // end isEmpty

    public void add(T newEntry)           // OutOfMemoryError possible
    {
        try{

            if(mySize == 0) {
                Node addNode = new Node(newEntry, firstNode);
                firstNode = addNode;
                mySize++;
            }
            else
            {
                Node current = firstNode;

                while(current.next != null){
                    current = current.next;
                }

                Node newNode = new Node(newEntry, current.next);
                current.next = newNode;
                mySize++;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }  // end add

    public boolean add(int newPosition, T newEntry) // OutOfMemoryError possible
    {
        System.out.println("in the Add method");
        if (newPosition <= 0 || newPosition > mySize + 1) {
            System.out.println("position not vaild");
            return false;
        }

        if (newPosition == 1) {
            System.out.println("new posiotn is 1");

            Node addFrontNode = new Node(newEntry, firstNode);
            firstNode = addFrontNode;
        }
        else
        {
            System.out.println("Position greater than 1");
            Node current = firstNode;
            int counter = 1;

            while (counter < newPosition -1) {
                current = current.next;
                counter++;
            }

            Node newNode = new Node(newEntry, current.next);
            current.next = newNode;
        }
        mySize++;
        return true;
    } // end add

    public T remove(int givenPosition)
    {
        if(givenPosition < 1 || givenPosition > mySize){
            return null;
        }

        T returnVal;

        if(givenPosition == 1){
            returnVal = firstNode.data;
            firstNode = firstNode.next;
        }
        else
       {
            Node current = firstNode;

            for(int i = 1; i < givenPosition -1; i++){
                current = current.next;
            }

            returnVal = current.next.data;
            current.next = current.next.next;

        }

        mySize--;
        return  returnVal;
    } // end remove

    public final void clear() // note the final method
    {
        firstNode = null;
        mySize = 0;
    } // end clear


    public boolean replace(int givenPosition, T newEntry)
    {
        if(givenPosition < 1 || givenPosition > mySize){return false;}

        Node current = firstNode;
        int position = 1;

        while(current != null){

            if(position == givenPosition){
                current.data = newEntry;
                return true;
            }

            current = current.next;
            position++;
        }

        return false;
    } // end replace

    public T getEntry(int givenPosition)
    {
       if(givenPosition >= 1 && givenPosition <= mySize){

           Node current = firstNode;

           int counter = 1;

           while(current != null){

               if(counter == givenPosition){
                   return current.data;
               }

               current = current.next;
               counter++;
           }
       }

        return null;
    } // end getEntry

    public boolean contains(T anEntry)
    {
        boolean found = false;
        Node currentNode = firstNode;

        while (!found && (currentNode != null))
        {
            if (anEntry.equals(currentNode.getData()))
                found = true;
            else
                currentNode = currentNode.getNextNode();
        } // end while

        return found;
    } // end contains

    public int getLength()
    {
        return mySize;
    } // end getLength


    public T[] toArray()
    {
        // the cast is safe because the new array contains null entries
        @SuppressWarnings("unchecked")
        T[] result = (T[])new Object[mySize];

        int index = 0;
        Node currentNode = firstNode;
        while ((index < mySize) && (currentNode != null))
        {
            result[index] = currentNode.getData();
            currentNode = currentNode.getNextNode();
            index++;
        } // end while

        return result;
    } // end toArray

    public String toString()
    {
        String result = "[";
        Node currentNode = firstNode;
        if (currentNode == null)
            result = "[]";
        while (currentNode != null)
        {
            if (currentNode.getNextNode() == null)
                result += currentNode.getData() + "]";
            else
                result += currentNode.getData() + ", ";
            currentNode = currentNode.getNextNode();
        }
        return result;
    }

    public int getPosition(T entry){

        Node current = firstNode;
        int position = 1;

        while(current != null){

            if(current.data == entry){
                return position;
            }

            current = current.next;
            position++;
        }

        return -1;
    }


   public void moveToEnd(int givenPosition){

        T data = remove(givenPosition);

        add(mySize + 1, data);
   }

    private class Node
    {
        private T    data; // entry in list
        private Node next; // link to next node

        private Node(T dataPortion)
        {
            data = dataPortion;
            next = null;
        } // end constructor

        private Node(T dataPortion, Node nextNode)
        {
            data = dataPortion;
            next = nextNode;
        } // end constructor

        private T getData()
        {
            return data;
        } // end getData

        private void setData(T newData)
        {
            data = newData;
        } // end setData

        private Node getNextNode()
        {
            return next;
        } // end getNextNode

        private void setNextNode(Node nextNode)
        {
            next = nextNode;
        } // end setNextNode
    } // end Node
} // end LList