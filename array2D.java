import java.util.*;;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter cols: ");
        int cols = sc.nextInt();

        // declare an 2D array
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter X for search: ");
        int x = sc.nextInt();
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (array[i][j] == x) {
                    System.out.println("X found at loaction (" + i + "," + j + ")");
                }
                // System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
