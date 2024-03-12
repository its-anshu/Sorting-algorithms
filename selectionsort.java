public class selectionsort {
    static void selectionSort(int arr[], int n) {
        int i, j;
        int minIndex;
        int temp;

        for (i = 0; i < n - 1; i++) {
            minIndex = i;

            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {17, 34, 25, 49, 9};
        int n = arr.length;

        System.out.print("Original Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        selectionSort(arr, n);

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
