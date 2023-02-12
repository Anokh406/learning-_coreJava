import java.util.*;

// print numbers from 5 to 1
public class recuirson {
    public static void printNumbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printNumbers(n - 1);// recurisive call to the funtion
    }

    // print numbers from 1 to 5
    public static void Print_recursively(int n) {
        if (n == 6) {

            return;
        }
        System.out.println(n);
        Print_recursively(n + 1);
    }

    // print first n natural numbers using recursion
    public static void printSum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        printSum(i + 1, n, sum);
        System.err.println(i);
    }

    // print a factorial of a number n?
    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = factorial(n - 1);
        int fact_n = n * fact;

        return fact_n;
    }
    // print the fibonaci series till nth term

    public static void PrintFibonacci(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        PrintFibonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of n :");
        // int n = sc.nextInt();
        // printNumbers(n);
        // Print_recursively(n);
        // printSum(1, 25, 0);
        // System.out.println(factorial(5));
        int a = 0, b = 1, n = 7;
        System.out.println(a);
        System.out.println(b);
        PrintFibonacci(a, b, n - 2);
    }
}
