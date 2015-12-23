package Chap6;

import java.util.Scanner;

public class Chap6_05 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数 : ");
		int[] a = new int[stdIn.nextInt()];

			for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
				a[i] = stdIn.nextInt();
			}

			System.out.print("a = {");
			for (int i = 0; i < a.length; i++) {
				System.out.print(a[i]);
				if(i != a.length - 1)
					System.out.print(", ");
			}
			System.out.print("}");
	}
}