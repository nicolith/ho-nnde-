package Chap6;

import java.util.Random;
import java.util.Scanner;

public class Chap6_13 {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数：");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];

		for (int i = 0; i < n; i++) {
			a[i] = rand.nextInt(10)+1;
			System.out.println("a[" + i + "] = " + a[i]);
		}

		for (int i = 0; i < n; i++)
			b[n - i - 1] = a[i];

		System.out.println("aの全要素をbに逆順にコピーしました。");

		for (int i = 0; i < n; i++)
			System.out.println("b[" + i + "] = " + b[i]);

	}
}
