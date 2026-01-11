// Program to sort an array using the Bubble Sort algorithm
public class S01_BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort...\n");
        
        int[] arr = {80, 30, 40, 10, 70};
        int n = arr.length;
        int temp;

        // bubble sort
        for(int i=0; i<n-1; i++) {
            for(int j=0; j<n-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
      
    }
}

/*
time complexity = O(n^2)
Output:
Bubble Sort...

10 30 40 70 80
*/
