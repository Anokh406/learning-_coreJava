import java.util.*;;

public class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int sumOfNumbers(int x, int y) {
        int sum = x + y;
        System.out.println(sum);
        return sum;
    }

    public static int calculateMultiply(int x, int y) {
        int sum = x * y;
        System.out.println(sum);
        return sum;
    }

    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Invalid number");
            return;
        }
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void CheckPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println("The number is prime");
        } else {
            System.out.println("Not prime number");
        }
        return;
    }

    public static void EvenOdd(int n) {

        if (n % 2 == 0) {
            System.out.println("Given number is even");
        } else {
            System.out.println("odd number");
        }
        return;
    }

    public static void PrintTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Table  :" + n * i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Your name:");
        // String name = sc.next();
        // printMyName(name);
        // System.out.println("Enter the value of x:");
        // int x = sc.nextInt();
        // System.out.println("Enter the value of y:");
        // int y = sc.nextInt();
        // sumOfNumbers(x, y);// funtion call
        // calculateMultiply(x, y);// funtion call

        System.out.println("Enter the value of factorial:");
        int fact = sc.nextInt();
        // printFactorial(fact);
        // CheckPrime(fact);
        // EvenOdd(fact);
        PrintTable(fact);

    }
}
