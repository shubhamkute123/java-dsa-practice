// Program to print a butterfly star pattern
public class P10_ButterflyPattern {
    public static void main(String args[]) {

        int n = 4;
        
        // Upper Loop - 4 rows
        for(int i=1; i<=n; i++) {
            // Part 1 stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // blank spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            // Part 2 stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
      
        // Lower Loop - 4 rows
        for(int i=n; i>=1; i--) {
            // Part 1 stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            // blank spaces
            int spaces = 2*(n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" ");
            }
            // Part 2 stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    }
}

/*
Output:
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
(end)
*/
