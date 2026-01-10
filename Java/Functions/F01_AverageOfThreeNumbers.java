// Program to calculate the average of three numbers entered by the user
import java.util.Scanner;

public class F01_AverageOfThreeNumbers {
    public static void averageFunction(int num1, int num2, int num3) {
        int average = (num1 + num2 + num3) / 3;
        System.out.println("Average of " +num1+ " + " +num2+ " + " +num3+ " is " +average);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter 3 nunmbers to find it's average: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        averageFunction(num1, num2, num3);
        sc.close();

    }
}

/*
Output:
Please enter 3 nunmbers to find it's average: 
10
20
30
Average of 10 + 20 + 30 is 20
*/
