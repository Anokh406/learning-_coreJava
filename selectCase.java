import java.util.Scanner;
public class selectCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int button = sc.nextInt();
        // switch (button) {
        //     case 1:
        //         System.err.println("Hello");
        //         break;
        //     case 2:
        //         System.out.println("Namaste");
        //         break;
        //     case 3:
        //         System.out.println("Bonjur");
        //         break;
        //     default:
        //         System.out.println("Invalid button");
        // }
        // questions using operators
        // double result;
        // System.out.print("Input a character: ");  
        // reading a character   
        // char c = sc.next().charAt(0);   
        //prints the character   
        // System.out.println("You have entered "+c);   
        // double a , b ;
        // System.out.println("Enter the value of a: ");   
        // a=sc.nextDouble();
        // System.out.println("Enter the value of b:");   
        // b=sc.nextDouble();

        // switch (c) {
        //     case '+':
        //         result = a + b;
        //         System.out.println("A+B:" + result);
        //         break;
        //     case '-':
        //         result = a - b;
        //         System.out.println("A-B:" + result);
        //         break;
        //     case '/':
        //         result = a / b;
        //         System.out.println("A/B:" + result);
        //         break;
        //     case '*':
        //         result = a * b;
        //         System.out.println("A*B:" + result);
        //         break;
        //     case '%':
        //         result = a % b;
        //         System.out.println("A%B:" + result);
        //         break;
        //     default:
        //         System.out.println("Invalid operator");
        // }
        // using switch statement print a every month of year
        System.out.println("Enter the value of Number:");
    int number=sc.nextInt();
    switch(number){
        case 1:System.out.println("JANUARY");break;
        case 2:System.out.println("FEBUARY");break;
        case 3:System.out.println("MARCH");break;
        case 4:System.out.println("APRIL");break;
        case 5:System.out.println("MAY");break;
        case 6:System.out.println("JUNE");break;
        case 7:System.out.println("JULY");break;
        case 8:System.out.println("AUGUST");break;
        case 9:System.out.println("SEPTEMBER");break;
        case 10:System.out.println("OCTOBER");break;
        case 11:System.out.println("NOVEMBER");break;
        case 12:System.out.println("DECEMBER");break;
    }
    }
}
