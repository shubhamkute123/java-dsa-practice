// Program to calculate the power of a number
import java.util.Scanner;

public class F08_PowerOfNumber {
    public static void calculatePower(int base, int power) {
      int result = base;
      for(int i=1; i<power; i++) {
        result *= base;
      }  
      System.out.println("\n" +base+ " raised to the power of " +power+ " is " +result);
    }

    public static void main(String[] main) {
        System.out.println("Program to calculate power of a number...!\n");
        Scanner sc = new Scanner(System.in);

        int base, power;

        System.out.print("Enter the base number: ");
        base = sc.nextInt();
        System.out.print("Enter the Exponent Power number: ");
        power = sc.nextInt();
        
        calculatePower(base, power);
        sc.close();
    }
}

/*
Output:
Program to calculate power of a number...!

Enter the base number: 2
Enter the Exponent Power number: 4

2 raised to the power of 4 is 16
*/
