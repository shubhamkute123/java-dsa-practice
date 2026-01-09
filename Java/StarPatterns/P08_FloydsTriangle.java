// Program to print Floyd's triangle using numbers
public class P08_FloydsTriangle {
    public static void main(String args[]) {

        int n = 4;
        int count = 1;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }

    }
}

/*
Output:
1
23
456
78910
*/
