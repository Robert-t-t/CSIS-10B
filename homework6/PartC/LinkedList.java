package homework6.PartC;

/**
   A linked implementation of the ADT list.
   
   @author Frank M. Carrano
   @version 3.0
*/
public class LinkedList 
{
    private Node firstNode; // reference to first node
    private int  mySize; 

    public LinkedList()
    {
        firstNode = null;
        mySize = 0;
    } // end default constructor

   
    public void add(Object newEntry)  // add at end of list 
    {  
        if (mySize == 0)
            firstNode = new Node(newEntry, null);
        else {  
            Node lastNode = firstNode;
            while (lastNode.next != null){ 
                lastNode = lastNode.next;
            } // assert: lastNode points to last node in list
            lastNode.next = new Node(newEntry, null);
        }
        mySize++;
    }  // end add

   
   public String toString()
   {
       String result = "[";
       Node currentNode = firstNode;
       if (currentNode == null)
          result = "[]";
       while (currentNode != null)
       {
            if (currentNode.next == null)
                result += currentNode.data + "]";
            else
                result += currentNode.data + ", ";
            currentNode = currentNode.next;    
       }
       return result;
   }
  
   /** Add your assigned method here */

   public void swapWithEnd(int position){
       if(mySize > 0){
           Node lastNode = firstNode;
           Node current = firstNode;

           //go to the last node
           while(lastNode.next != null){
               lastNode = lastNode.next;
           }

           //go to the desire position
           for(int i = 1; i < position; i++){
               current = current.next;
           }

           Object temp = current.data;

           current.data = lastNode.data;

           lastNode.data = temp;
       }
   }


    private class Node 
    {
      public Object    data; // entry in list
      public Node next; // link to next node

      private Node(Object dataPortion, Node nextNode)
      {
         data = dataPortion;
         next = nextNode;   
      } // end constructor
    } // end Node
} // end LList



