// Program to sort an array using the Merge Sort algorithm
public class S04_MergeSort {

    public static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        for(int i=0, j=si; i<merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    public static void divide(int[] arr, int si, int ei) {
        if(si >= ei) {
            return;
        }
      
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }

    public static void main(String[] args) {
        System.out.println("Merge Sort...");
        int[] arr = {80, 30, 40, 10, 70};
        int n = arr.length;

        // Merge Sort
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++) {
            System.out.print(arr[i] + " ");
        }
      
    }
}

/*
Time Complexity:
Best Case    : O(nlog(n))
Average Case : O(nlog(n))
Worst Case   : O(nlog(n))

Space Complexity:
O(n)

Output:
Merge Sort...
10 30 40 70 80
*/
