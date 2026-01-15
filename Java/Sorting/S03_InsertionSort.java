// Program to sort an array using the Insertion Sort algorithm
public class S3_InsertionSort {
    public static void main(String[] args) {

        System.out.println("Insertion Sort");
        int[] arr = {80, 30, 40, 10, 70};
        int n = arr.length;

        // Insertion Sort
        for(int i=1; i<n; i++) {
            int current = arr[i];
            int j = i-1;
            while (j >= 0 && arr[j] > current) {
                arr[j+1] = arr[j];
                j--;
            }

            //placement
            arr[j+1] = current;
        }

        for(int i=0; i<n; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}


/*
Time Complexity:
Best Case    : O(n)
Average Case : O(n^2)
Worst Case   : O(n^2)

Space Complexity:
O(1)

Output:
Insertion Sort...
10 30 40 70 80
*/
