package Lab5PartB;

/**
   A driver that demonstrates the class AList.
   
   @author Frank M. Carrano, modified by Tom Rebold
   @version 3.0
*/
public class Lab5b
{
    public static void main(String[] args) 
    {
        System.out.println("\f");
        //******************** Problem 1 getEntry method **********************
        System.out.println("****************  Problem 1 *********************\n");
        ArrayList<String> myList = new ArrayList<String>();

        System.out.println("Testing add to end: Add 15, 25, 35, 45");
          myList.add("15");
          myList.add("25");
          myList.add("35");
          myList.add("45");
      
        System.out.println("\n\nList should contain\n15 25 35 45 ");
        displayList(myList);  // uses getEntry

        System.out.println("\nIs List empty? " + myList.isEmpty());

        System.out.println("Add more entries to end: Add 55, 65, 75, 85, 95");
        myList.add("55");
        myList.add("65");
        myList.add("75");
        myList.add("85");
        myList.add("95");
        
        System.out.println("\n\nIs List empty? " + myList.isEmpty());

        System.out.println("-------------------------\n");
        System.out.println("\n\nList should contain 15 25 35 45 55 65 75 85 95");
        displayList(myList);
        
        //*************************** END Problem 1 ***********************************/
        //*************************** Problem 2 add at position **************** 
        System.out.println("\n\n****************  Problem 2 *********************\n");
        System.out.println("Testing clear() ");
        myList.clear();
        
        System.out.println("List should be empty: ");
        System.out.println("Is list empty? " + myList.isEmpty());

        System.out.println("-------------------------\n");
        System.out.println("Create a new list of max size 8.\n");
        myList = new ArrayList<String>(8);  // 8 is max size

        System.out.println("Testing add at position ");
        System.out.println("Add 15 at position 1: returns " + myList.add(1, "15"));
        System.out.println("Add 25 at position 2: returns " + myList.add(2, "25"));
        System.out.println("Add 35 at position 3: returns " + myList.add(3, "35"));
        System.out.println("Add 99 at position 0: returns " + myList.add(0, "99"));
        System.out.println("Add 99 at position 9: returns " + myList.add(9, "99"));
    
        System.out.println("\n\nList should contain\n15 25 35 ");
        displayList(myList);
        
        System.out.println("Is List empty? " + myList.isEmpty());

        System.out.println("Add 19 at position 1: returns " + myList.add(1, "19"));
        System.out.println("Add 39 at position 3: returns " + myList.add(3, "39"));
        System.out.println("Add 29 at position 2: returns " + myList.add(2, "29"));
        System.out.println("Add 55 at position 7: returns " + myList.add(myList.getLength()+1, "55"));
        System.out.println("Add 65 at position 8: returns " + myList.add(8, "65"));
    
        System.out.println("\n\nList should contain\n19 29 15 39 25 35 55 65");
        displayList(myList);
        
        System.out.println("Is List empty? " + myList.isEmpty());
        //*************************** END Problem 2 ***********************************/
        //*************************** Problem 3 remove, replace **************** 
        System.out.println("\n\n****************  Problem 3 *********************\n");
            
        System.out.println("\n-------------------------\n");
        System.out.println("Testing remove() ");
        System.out.println("Removing 15 at position 3: returns " + myList.remove(3));
        System.out.println("Removing 19 at position 1: returns " + myList.remove(1));
        System.out.println("Removing 65 at position 6: returns " + myList.remove(6));
        System.out.println("Removing ?? at position 6: returns " + myList.remove(6));
        System.out.println("Removing ?? at position 0: returns " + myList.remove(0));
    
        System.out.println("\n\nList should contain\n29 39 25 35 55");
        displayList(myList);

        System.out.println("\n-------------------------\n");
        System.out.println("Testing replace() ");
        System.out.println("Replace 29 at position 1 with 92 : returns " + myList.replace(1, "92"));
        System.out.println("Replace 39 at position 2 with 93 : returns " + myList.replace(2, "93"));
        System.out.println("Replace 25 at position 3 with 52 : returns " + myList.replace(3, "52"));
        System.out.println("Replace 35 at position 4 with 53 : returns " + myList.replace(4, "53"));
        System.out.println("Replace 55 at position 5 with 50 : returns " + myList.replace(5, "50"));
        System.out.println("Replace ?? at position 0 with 99 : returns " + myList.replace(0, "99"));
        System.out.println("Replace ?? at position 6 with 99 : returns " + myList.replace(6, "99"));
        
        System.out.println("\n\nList should contain\n92 93 52 53 50");
        displayList(myList);
        
        System.out.println("Is List empty? " + myList.isEmpty());
        
        System.out.println("\n-------------------------\n");
        System.out.println("Testing contains() [results should be TRUE]");
        System.out.println("List contains 92: " + myList.contains("92"));
        System.out.println("List contains 52: " + myList.contains("52"));
        System.out.println("List contains 53: " + myList.contains("53"));
        System.out.println("List contains 50: " + myList.contains("50"));
        System.out.println("\n");

        System.out.println("Testing contains() [results should be FALSE]");
        System.out.println("List contains 91 returns : " + myList.contains("91"));
        System.out.println("List contains 55 returns : " + myList.contains("55"));
        System.out.println("List contains 4  returns : " + myList.contains("4"));
        System.out.println("List contains 12 returns : " + myList.contains("12"));
        //*************************** END Problem 3 ***********************************/
        //*************************** Problem 4 getPosition, moveToEnd ********************** 
        System.out.println("\n\n****************  Problem 4 *********************\n");
        
        System.out.println("The position of 92 is " + myList.getPosition("92") + "(should be 1)");         
        System.out.println("The position of 52 is " + myList.getPosition("52") + "(should be 3)");
        System.out.println("The position of 50 is " + myList.getPosition("50") + "(should be 5)");
        System.out.println("The position of 4 is " + myList.getPosition("4") + "(should be -1)");
        
        myList.moveToEnd(1);
        System.out.println("The number 92 should be at the end");
        displayList(myList);

        myList.moveToEnd(4);
        System.out.println("The number 50 should be at the end");
        displayList(myList);
        
        myList.moveToEnd(myList.getPosition("52"));
        System.out.println("The number 52 should be at the end");
        displayList(myList);
        
        //*************************** END Problem 4 ***********************************/
        /*************************** Problem 5 Replace without replace at the client level ******** 
        // write statements to replace the "53" with "35" without knowing where it is, or using replace
        // (use methods getIndex, remove and add acting on myList)

        System.out.println("\n\n****************  Problem 5 *********************\n");
        
        System.out.println("after replacing 53 with 35");
        displayList(myList);        
        //*************************** END Problem 5 ***********************************/        
    } // end testStringList

    public static void displayList(ArrayList<String> list)
    {
      int numberOfEntries = list.getLength();
      
      System.out.println("\nThe list contains " + numberOfEntries +
                         " entries, as follows:");
      for (int position = 1; position <= numberOfEntries; position++)
        System.out.println(list.getEntry(position) + 
                           " is entry " + position);
      System.out.println();
    } // end displayList
}  // end Driver

