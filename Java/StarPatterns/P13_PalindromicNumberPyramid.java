// Program to print a palindromic number pyramid pattern
public class P13_PalindromicNumberPyramid {
    public static void main(String[] args) {

        int n = 5;

        for(int i=1; i<=n; i++) {
            // spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            // Left side
            for(int j=i; j>=1; j--) {
                System.out.print(j + " ");
            }
            // Right side
            for(int j=2; j<=i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}

/*
Output:
        1 
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
*/
