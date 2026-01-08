// Program to display the month name based on user input using switch case
import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Program to Display Month Name using Switch Case\n");

        // User Input
        System.out.print("Enter the month name: ");
        int monthName = sc.nextInt();

        switch(monthName) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;

            case 5:
                System.out.println("May");
                break;

            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("August");
                break;

            case 9:
                System.out.println("September");
                break;

            case 10:
                System.out.println("October");
                break;

            case 11:
                System.out.println("November");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Please enter a valid number between 1 and 12");
                break;
        }
        
        sc.close();
    }
}

/*
Output:
Program to Display Month Name using Switch Case

Enter the month name: 11
November
*/
