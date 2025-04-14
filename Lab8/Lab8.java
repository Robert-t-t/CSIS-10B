package Lab8;

import java.util.Scanner;
/**
 * class Lab8:  Recursion and Big-O code analysis
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lab8
{
    public static int board[][] = {
            { 6,4,7,4,8,3,6,7 },
            { 9,1,4,7,3,6,8,6 },
            { 4,8,1,9,7,9,2,3 },
            { 1,8,6,6,8,4,8,3 },
            { 7,3,7,4,4,1,5,9 },
            { 1,6,3,2,1,4,3,3 },
            { 5,3,8,4,2,6,7,9 },
            { 6,4,3,8,7,1,2,4 }};

    public static Scanner keyboard = new Scanner(System.in);

    //  define for problem 1
    public static int validInput(int low,int high)
    {
        // use the keyboard Scanner created above this method (don't declare a new Scanner)
        int temp = keyboard.nextInt();

        if(temp >= low && temp <= high){
            return temp;
        }
        else {
            return validInput(low,high);
        }
    }


    public static void displayRowOfCharacters(char c, int value){

        //base case
        if(value == 0){
            System.out.println();
            return;
        }

        if(value > 0){
            System.out.print(c);
            displayRowOfCharacters(c, value-1);
        }
    }


    public static void displayBackward(int[] array, int targetIndex, int endIndex){
        if(endIndex == targetIndex -1){
            return;
        }

        if(endIndex > targetIndex-1){
            System.out.print(array[endIndex]);
            displayBackward(array,targetIndex,endIndex-1);
        }
    }

    public static void  displayBackward2(int[] array,int firstIndex, int endIndex){

        if(firstIndex>endIndex){
            return;
        }

        displayBackward2(array,firstIndex+1,endIndex);

        System.out.print(array[firstIndex] + " ");
    }

    public static boolean isPalindrome(String string){

        //base
        if(string.length() <= 1){
            return true;
        }

        char start = string.charAt(0);
        char end = string.charAt(string.length() -1);

        if(start == end){
            String newString = string.substring(1,string.length() -1);
            return isPalindrome(newString);
        }
        else
        {
           return false;
        }
    }


    public static int maxValue(int row, int column){

        //base2
        if(column < 0 || column > 7){
            return 0;
        }

        //base 1
        if(row == 0){
            return board[row][column];
        }


        int left = maxValue(row-1,column-1);

        int right = maxValue(row - 1, column +1);

        int max;

        if(left > right){
            max = left;
        }
        else{
            max = right;
        }

        return board[row][column] + max;
    }




    public static void main ( String [] args)
    {
        // read the Lab 8 handout on the website for more information

        /**************** Problem 1 Write the recursive method used below *****
         //                 Do not change this method call

         int n = validInput(1,10);
         System.out.println("You entered " + n );

         //************************  End Problem 1 ****************************/
        /******* Problem 2 Implement displayRowOfCharacters above main  ******

         displayRowOfCharacters('~',50);
         displayRowOfCharacters('@',10);


         //************************  End Problem 2 ****************************/
        /**************** Problem 3 displayBackward method            ********

         int data1[] = {12, 20, 30, 42, 49, 50};
         displayBackward(data1,0,5);



         //************************  End Problem 3 ***************************/
        /**************** Problem 4 displayBackward2 method            ********

         int data2[] = {9, 18, 27, 47, 53, 62};
         displayBackward2(data2,0,5);



         //************************  End Problem 4 ***************************/
        /**************** Problem 5 isPalindrome method              ********

         System.out.println("Is level a palindrome? " + isPalindrome("level"));
         System.out.println("Is deed a palindrome? " + isPalindrome("deed"));
         System.out.println("Is leval a palindrome? " + isPalindrome("leval"));
         System.out.println("Is dead a palindrome? " + isPalindrome("dead"));

         //************************  End Problem 5 ***************************/

        //**************** Problem 7 write the maxValue method and use it ********
         //  to find the max value possible from moving from a given row/col to the top
         //   row of the checkerboard defined above as board[][]

         System.out.println("Location: row 7, col 4");
         System.out.println(maxValue(7,4));

         System.out.println("Location: row 6, col 3");
         System.out.println(maxValue(6,3));

         System.out.println("Location: row 2, col 0");
         System.out.println(maxValue(2,0));




         //************************  End Problem 7 ***************************/

    }




}
