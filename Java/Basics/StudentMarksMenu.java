import java.util.Scanner;

// Menu-driven program to take student marks input and display comments based on marks
public class StudentMarksMenu {
    public static void main(String[] args) {

        System.out.println("StudentMarksMenu Program: Enter student marks and get feedback");
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.print("\nDo you want to enter marks? (1 = Yes, 0 = No): ");
            choice = sc.nextInt();

            if(choice == 1) {
                System.out.print("Enter student's marks (0-100): ");
                int marks = sc.nextInt();

                if(marks >= 90) {
                    System.out.println("This is Good");
                } else if(marks >= 60) {
                    System.out.println("This is also Good");
                } else if(marks >= 0) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid marks! Please enter between 0 and 100");
                }
            } else if(choice != 0) {
                System.out.println("Invalid choice! Enter 1 to continue or 0 to stop");
            }
        } while(choice != 0);

        sc.close();
    }
}

/*
Output:
StudentMarksMenu Program: Enter student marks and get feedback

Do you want to enter marks? (1 = Yes, 0 = No): 1
Enter student's marks (0-100): 85
This is also Good

Do you want to enter marks? (1 = Yes, 0 = No): 0
*/
