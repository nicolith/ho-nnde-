package chap7;

import java.util.Scanner;

/**
 * Created by simezi on 2015/12/26.
 */
public class chap7_04 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1からnまでの整数の和を返しますよ～こいつ～");

        System.out.print("このへんにぃ、うまい整数n： ");
        int n = stdIn.nextInt();
        System.out.println("来てるらしいっすよ ");

        System.out.println("ああ～1からnまでの整数の和は" + sum(n) + "なんじゃ～");
    }

    public static int sum(int a) {
        int tmp = 0;
        for (int i =1; i <= a; i++) {
            tmp += i;
        }
        return tmp;
    }
}
