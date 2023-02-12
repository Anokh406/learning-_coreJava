import java.util.*;
public class conditonal {
    
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    
    // int age= sc.nextInt();
    // if (age>18) {
        //     System.out.println("Adult");
        
        // }else{
            //     System.out.println("Not Adult");
            // }
            // cheking weather entered number is even or odd
            // System.out.println("Enter the value of Number: ");
            // int number=sc.nextInt();
            // if (number %2==0) {
            //     System.out.println("The entered number is even :)");
            // }else{
            //     System.out.println("The entered number is odd !!!");
            // }
            int a=sc.nextInt();
            int b=sc.nextInt();
            if (a==b) {
                System.out.println("Entered number is equal");
            }else{
                if (a>b) {
                    System.out.println("a is greater than b");
                }else{
                    System.out.println("a is lesser than b");
                }
            }
            // second method of nested if else if
            if (a==b) {
                System.out.println("Entered number is equal");
            }else if (a>b) {
                    System.out.println("a is greater than b");
            }else{
                    System.out.println("a is lesser than b");
             }
}
}
