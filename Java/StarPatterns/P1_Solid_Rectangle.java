// Program to print a solid rectangle star pattern
public class P1_Solid_Rectangle {
    public static void main(String args[]) {
        
        int n = 4;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Output:
****
****
****
****
*/
