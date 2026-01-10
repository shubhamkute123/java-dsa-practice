// Program to check whether a person is eligible to vote based on age
import java.util.Scanner;

public class F05_EligibleForVote {
    public static void isEligibleForVote(int age) {
        if(age >= 18) {
            System.out.println("\nYou are eligible for vote");
        } else {
            System.out.println("\nYou are not eligible for vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nPerson is eligible for vote or not?");
        System.out.print("\nEnter your real age: ");
        int age = sc.nextInt();
        
        isEligibleForVote(age);
        sc.close();
    }
}

/*
Output:
Person is eligible for vote or not?

Enter your real age: 18

You are eligible for vote
*/
