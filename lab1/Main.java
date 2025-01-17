/**
  C2  "+"
  C3 = 0
  C5 = "%"
  C7 ��� ������� i �� j = char
 */

import java.util.Scanner;


public class Main {
    static boolean checkIsNextWrong(Scanner in) {
        if (!in.hasNextInt()) {
            System.out.println("Value can not be calculated. Incorrect input found");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        final int C = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A: ");
        final int a = in.nextInt();
        System.out.print("Enter B: ");
        if (checkIsNextWrong(in))
            return;
        final int b = in.nextInt();
        System.out.print("Enter N: ");
        if (checkIsNextWrong(in))
            return;
        final int n = in.nextInt();
        System.out.print("Enter M: ");
        if (checkIsNextWrong(in))
            return;
        final int m = in.nextInt();
        double S = 0;
        if (a < 0 || b < 0 || n < 0 || m < 0) {
            System.out.println("Value can not be calculated. Char can not be negative");
            return;
        }
        if ((a + C <= 0 && n + C >= 0) || b == 0) {
            System.out.println("Value can not be calculated. Dividing by zero found");
            return;
        }
        for (char i = (char) a; i <= (char)n; ++i) {
            for (char j = (char) b; j <= (char)m; ++j) {
                S += i % j / ((double) i + C);
            }
        }
        System.out.println("S = " + S);
        in.close();
    }
}