

// // print number from n to 1

import java.util.Scanner;

public class recursion1 {

    public static void printNum(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println(n);
        printNum(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        printNum(n);
    }
}
