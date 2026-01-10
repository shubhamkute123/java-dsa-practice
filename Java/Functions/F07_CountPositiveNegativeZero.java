// Program to count positive, negative, and zero values from user input
import java.util.Scanner;

public class F07_CountPositiveNegativeZero {
    public static void countPosNegZero(int positive, int negative, int zeros) {
        System.out.println("\nResults: ");
        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zeros);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nDisplay count of positive, negative, and zeros entered...!");
        int num;
        char choice;
        int positive = 0;
        int negative = 0; 
        int zero = 0;

        do {
            System.out.print("\nEnter the number: ");
            num = sc.nextInt();
            if(num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);
        } while(Character.toLowerCase(choice) == 'y');

        countPosNegZero(positive, negative, zero);
        sc.close();
    }
}

/*
Output:
Display count of positive, negative, and zeros entered...!

Enter the number: 10
Do you want to continue? (y/n): y

Enter the number: 80
Do you want to continue? (y/n): y

Enter the number: -10
Do you want to continue? (y/n): y

Enter the number: 0
Do you want to continue? (y/n): y

Results:
Positive numbers: 2
Negative numbers: 1
Zeros: 1
*/
