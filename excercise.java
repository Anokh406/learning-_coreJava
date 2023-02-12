import java.util.*;;

// calculate the average of three numbers
public class excercise {
    public static int avergage(int x, int y, int z) {
        int formula = (x + y + z) / 3;

        return formula;
    }

    // print the odd number from 1to n
    public static void OddNumber(int n) {
        if (n % 2 == 0) {
            return;
        } else {
            int odd = n;
            System.out.println(odd);
        }
        return;
    }

    // check greater and return greater number
    public static int greater(int x, int y) {
        if (x > y) {
            return x;
        } else {
            return y;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the value of a");
        // int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();
        System.out.println("Enter the value of c");
        int c = sc.nextInt();
        // int anser = avergage(a, b, c);
        // System.out.println(anser);
        // OddNumber(c);
        System.out.println(greater(b, c));
    }
}
