package chap7;

import java.util.Scanner;

/**
 * Created by simezi on 2015/12/26.
 */
public class chap7_06 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("月の季節を表示しますよ～こいつ～：");
        int m = stdIn.nextInt();

        printSeason(m);
    }

    public static void printSeason(int m) {
        if (m <= 5 && 3 <= m) {
            System.out.println("春 War");
        }
        else if (8 >= m && m >= 6) {
            System.out.println("夏が…終わったんやなって…");
        }
        else if (11 >= m && m >= 9) {
            System.out.println("秋しかないけどいいかな？");
        }
        else if (12 == m || 1 == m || 2 == m) {
            System.out.println("冬…あんだけどお…焼いてかない？");
        }
    }
}
