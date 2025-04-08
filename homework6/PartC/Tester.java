package homework6.PartC;

import java.util.PriorityQueue;

/** 
   A driver that demonstrates the class AList.
   
   @author Frank M. Carrano, modified by Tom Rebold
   @version 3.0
*/
public class Tester
{
    public static void main(String[] args) 
    {
        System.out.println("\f");
        /******************** Problem 1 ArrayList  method **********************a
        System.out.println("****************  Problem 1 ArrayList swapWithEnd *********************\n");
        ArrayList list1 = new ArrayList();
        list1.add("a");  list1.add("b"); list1.add("c"); list1.add("d"); 
        ArrayList list2 = new ArrayList();
        list2.add("a");  list2.add("b"); list2.add("c"); list2.add("d");
        ArrayList list3 = new ArrayList();
        list3.add("a");  
        
        // test all three test cases on your method
        System.out.println("list1 before swapWithEnd: " + list1);
        list1.swapWithEnd(1);
        System.out.println("list1 after swapWithEnd(1) should look like d-b-c-a: " + list1);
        
        System.out.println("list2 before swapWithEnd: " + list2);
        list2.swapWithEnd(2);
        System.out.println("list2 after swapWithEnd(2) should look like a-d-c-b: " + list2);
        
        System.out.println("list3 before swapWithEnd: " + list3);
        list3.swapWithEnd(1);
        System.out.println("list3 after swapWithEnd should look like a: " + list3);
                
 
        System.out.println("-------------------------\n");
        
        //*/
        //******************** Problem 2 LinkedList method **********************
       
        System.out.println("****************  Problem 2 LinkedList swapWithEnd *********************\n");
        LinkedList list1 = new LinkedList();
        list1.add("a");  list1.add("b"); list1.add("c"); list1.add("d"); 
        LinkedList list2 = new LinkedList();
        list2.add("a");  list2.add("b"); list2.add("c"); list2.add("d");
        LinkedList list3 = new LinkedList();
        list3.add("a");  
        
        // test all three test cases on your method
        System.out.println("list1 before swapWithEnd: " + list1);
        list1.swapWithEnd(1);
        System.out.println("list1 after swapWithEnd(1) should look like d-b-c-a: " + list1);
        
        System.out.println("list2 before swapWithEnd: " + list2);
        list2.swapWithEnd(2);
        System.out.println("list2 after swapWithEnd(2) should look like a-d-c-b: " + list2);
        
        System.out.println("list3 before swapWithEnd: " + list3);
        list3.swapWithEnd(1);
        System.out.println("list3 after swapWithEnd should look like a: " + list3);        
        System.out.println("-------------------------\n");
        
        //*/
   } 
}  // end Driver

