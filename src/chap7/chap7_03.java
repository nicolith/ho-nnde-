package chap7;

import java.util.Scanner;

import static chap7.chap7_03.med;

/**
 * Created by simezi on 2015/12/26.
 */
public class chap7_03 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数a：");
        int a = stdIn.nextInt();
        System.out.print("整数b：");
        int b = stdIn.nextInt();
        System.out.print("整数c：");
        int c = stdIn.nextInt();

        System.out.println("中央値は" + med(a, b, c) + "です。");
    }

    public static int med(int a, int b, int c) {
        int med = a;
        if (b > med) {
            if (c > b) {
                med = b;
            } else if (a > c) {
                med = a;
            } else {
                med = c;
            }
        } else if (b < med) {
            if (c < b) {
                med = b;
            } else if (a < c) {
                med = a;
            } else {
                med = c;
            }
        }
        return med;
    }
}
