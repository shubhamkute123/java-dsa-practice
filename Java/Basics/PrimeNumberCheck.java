import java.util.Scanner;

// Program to check whether a number is prime or not
public class PrimeNumberCheck {
    public static void main(String[] args) {

        System.out.println("PrimeNumberCheck Program: Check whether a number is prime\n");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        boolean isPrime = true;

        if(n <= 1) {
            isPrime = false;
        } else {
            for(int i=2; i<=Math.sqrt(n); i++) {
                if(n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(n+ " is a prime number");
        } else {
            System.out.println(n+ " is not a prime number");
        }

        sc.close();
    }
}


/*
Output:
PrimeNumberCheck Program: Check whether a number is prime

Enter the number: 37
37 is a prime number
*/
