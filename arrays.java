import java.util.*;

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int size = sc.nextInt();
        // arrays
        // int marks[] = new int[3];
        // int marks[] = { 97, 98, 99, 100 };
        int number[] = new int[size];
        System.out.println("Enter the value of serched item");
        int x = sc.nextInt();
        // input
        for (int i = 0; i < size; i++) {
            System.out.println("Enter the value of an array: " + i);
            number[i] = sc.nextInt();
        }
        // output
        for (int i = 0; i < number.length; i++) {

            if (number[i] == x) {
                System.out.println("Index found at number :" + i);
            }
        }
        // marks[0] = 97;// phy
        // marks[1] = 98;// chem
        // marks[2] = 99;// maths
        // System.out.println(marks[0]);
        // for (int i = 0; i <= 4; i++) {
        // System.out.println(marks[i]);
        // }
    }
}
