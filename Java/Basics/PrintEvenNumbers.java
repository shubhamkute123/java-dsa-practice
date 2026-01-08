// Program to print all even numbers up to a given number n
import java.util.Scanner;

public class PrintEvenNumbers {
    public static void main(String[] args) {

        System.out.println("Print Even Numbers Program: Prints all even numbers up to n\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("\nEven numbers up to " +n+ ": ");
        for(int i=2; i<=n; i+= 2) {
            System.out.println(i);
        }

        sc.close();
    }
}

/*
Output:
Print Even Numbers Program: Prints all even numbers up to n

Enter the value of n: 9

Even numbers up to 9:
2
4
6
8
*/
