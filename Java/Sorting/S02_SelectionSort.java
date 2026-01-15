// Program to sort an array using the Selection Sort algorithm
public class S02_SelectionSort {
    public static void main(String[] args) {

        System.out.println("Selection Sort...");
        int[] arr = {80, 30, 40, 10, 70};
        int n = arr.length;
        int smallest, temp;

        // Selection Sort
        for(int i=0; i<n-1; i++) {
            smallest = i;
            for(int j=i+1; j<n; j++) {
                if(arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

/*
Time Complexity:
Best Case    : O(n^2)
Average Case : O(n^2)
Worst Case   : O(n^2)

Space Complexity:
O(1)

Output:
Selection Sort...
10 30 40 70 80
*/

