public class RecursiveBubbleSortDesc {
    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
    
        bubbleSortRecursive(arr, arr.length);
    
        System.out.print("Sorted Descending: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    static void bubbleSortRecursive(int[] arr, int n) {

        if (n == 1) return;
        innerBubble(arr, 0, n);
        bubbleSortRecursive(arr, n - 1);
    }

 
    static void innerBubble(int[] arr, int i, int n) {

        if (i == n - 1) return;

   
        if (arr[i] < arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

 
        innerBubble(arr, i + 1, n);
    }

}

