import java.util.Scanner;

public class strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // String name = sc.next();
        // String declaration
        // String name = "hello gys my name is anokh";
        // System.out.println("Your name is : " + name);
        // concatenation of two string
        // String fName = "Anokh";
        // String lName = "kashyap";
        // String Name = fName + "@" + lName;
        // System.out.println(Name.length());
        // // charAt
        // for (int i = 0; i < Name.length(); i++) {
        // System.out.println(Name.charAt(i));
        // }
        // compare two strings
        String Fstring = "anokh";
        String sstring = "anokh";
        if (Fstring.compareTo(sstring) == 0) {
            System.out.println("strings are equal");

        } else {
            System.out.println("strings are not equal");

        }
    }
}
