class pattern {
    public static void main(String[] args) {
        // print solid pattern
        // *****
        // *****
        // *****
        // *****
        // outer loop
        // for(int i=1; i<=4; i++){
        // inner loop
        // for(int j=1; j<=4; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }
        // Q-2=>print the hollow pattern
        // *****
        // * *
        // * *
        // *****
        // int r = 4, c = 5;
        // for (int i = 1; i <= r; i++) {
        // for (int j = 1; j <= c; j++) {
        // if (i == 1 || j == 1 || i == 4 || j == 5) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // half pyramid pattern
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }
        // reverse pattern
        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }

        // inverted half pyramid pattern at 180 degree
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + "");
        // }
        // System.out.println();
        // }
        // for (int i = 5; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }
        // int number = 1;
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(number + "");
        // number++;
        // }
        // System.out.println();
        // }
        // print one bit trangle
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= i; j++) {
        // int sum = i + j;
        // if (sum % 2 == 0) {
        // System.out.print("1");
        // } else {
        // System.out.print("0");
        // }
        // }
        // System.out.println();
        // }
        // PRINT THE RHYMBO PATTERN
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 9 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= 5; j++) {
        // System.out.print(" *");
        // }
        // System.out.println();
        // }
        // for (int i = 1; i <= 5; i++) {
        // for (int j = 1; j <= 5 - i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // paildrone pattern print

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        // PRINT BUTERFLY PATTERN
        // for (int i = 1; i <= 4; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (4 - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }
        // for (int i = 4; i >= 1; i--) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // int spaces = 2 * (4 - i);
        // for (int j = 1; j <= spaces; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // PRINT THE DIAMOND PATTERN
        int n = 4;
        // upper part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower part
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}