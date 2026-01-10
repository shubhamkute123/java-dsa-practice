// Program to demonstrate an infinite loop
import java.util.Scanner;

public class F06_InfiniteLoopDemo {
    public static void runInfiniteLoop() {
        do{
            System.out.println("...Infinite Loop...");
        } while (true);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nAre you ready? Enter y/n key to start an Infinite Loop...!");
        char input = sc.next().toLowerCase().charAt(0);
        if(input == 'y') {
            runInfiniteLoop();
        } else if(input == 'n') {
            System.out.println("Program exit");
        } else {
            System.out.println("Please enter valid input");
        }

        sc.close();
    }
}

*/
Output:
Are you ready? Enter y/n key to start an Infinite Loop...!
y
...Infinite Loop...
...Infinite Loop...
...Infinite Loop...
(loop continues...)
*/
