import java.util.Scanner;

public class two {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();

        equation(input);





    }


    public static void equation(int x){

        double y = (double)((1.0/3)* x + (x/4.0) + 2 * x);

        System.out.println(y);

    }
}