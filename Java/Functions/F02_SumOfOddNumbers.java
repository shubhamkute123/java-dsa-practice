// Calculates the sum of all odd numbers from 1 to n using a function
import java.util.Scanner;

public class F02_SumOfOddNumbers {
    public static void calculateSumOfOdds(int n) {
        int sumOfOddNumbers = 0;
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) {
                sumOfOddNumbers+= i;
            }
        }
        System.out.println("\nResult: " +sumOfOddNumbers);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nSum of all odd numbers from 1 to n...\n");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        calculateSumOfOdds(n);
        sc.close();
    }
}

/*
Output:
Sum of all odd numbers from 1 to n...

Enter the value of n: 8

Result: 16
*/
