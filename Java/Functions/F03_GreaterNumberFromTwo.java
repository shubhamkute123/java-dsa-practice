// Program to find the greater number between two numbers using functions
import java.util.Scanner;

public class F03_GreaterNumberFromTwo {
    public static void greaterNumber(int num1, int num2) {
        if(num1 > num2) {
            System.out.println("\nGreater number is " +num1);
        } else if(num1 < num2) {
            System.out.println("\nGreater number is " +num2);
        } else{
            System.out.println("\nBoth values are equal...");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nFind greater number program...");
        System.out.print("\nEnter 2 numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        greaterNumber(num1, num2);
        sc.close();
    }
}

/*
Output:
Find greater number program...

Enter 2 numbers: 10
20

Greater number is 20
*/
