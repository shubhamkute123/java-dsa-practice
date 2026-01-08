// CalculatorUsingSwitch.java
import java.util.Scanner;

public class CalculatorUSingSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculator program using Switch Case...\n");

        // User Input
        System.out.print("Enter the first number: ");
        double num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        double num2 = sc.nextInt();
        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);
        System.out.println();

        double result;
        
        // Switch Case
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println(num1+ " + " +num2+ " = " +result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1+ " - " +num2+ " = " +result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1+ " * " +num2+ " = " +result);
                break;

            case '/':
                if(num2 != 0) {
                    result = num1 / num2;
                    System.out.println(num1+ " / " +num2+ " = " +result);
                } else {
                    System.out.println("Error: Division by zero is now allowed");
                }
                break;

            case '%':
                result = num1 % num2;
                System.out.println(num1+ " % " +num2+ " = " +result);
                break;
        
            default:
                System.out.println("Please enter a valid operator ('+' | '-' | '*' | '/' | '%')");
                break;
        }

        sc.close();
    }
}

/*
Output:
Calculator program using Switch Case...

Enter the first number: 50
Enter the second number: 10
Enter the operator: /

50.0 / 10.0 = 5.0
*/
