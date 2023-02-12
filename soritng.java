public class soritng {
    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO JAVA DATA STRUCTURE COURSE WITH JAVA");
        // Bubble sort =time complexity Big O(n^2)
        // int arr[] = { 7, 8, 3, 1, 2 };
        // for (int i = 0; i < arr.length; i++) {// n-1
        // for (int j = 0; j < arr.length - i - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // // swaping the values
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }

        // SELECTION SORT time complexity = Big O(n^2)
        // int arr[] = { 7, 8, 3, 1, 2 };
        // for (int i = 0; i < arr.length - 1; i++) {
        // int smallest = i;
        // for (int j = i + 1; j < arr.length; j++) {
        // if (arr[smallest] > arr[j]) {
        // smallest = j;
        // }
        // }
        // int temp = arr[smallest];
        // arr[smallest] = arr[i];
        // arr[i] = temp;
        // }

        // INSERTION SORT

        int arr[] = { 7, 8, 3, 1, 2 };
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            // placement
            arr[j + 1] = current;
        }

        printArray(arr);
    }
}
