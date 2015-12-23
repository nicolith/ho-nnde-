package Chap6;

import java.util.Scanner;

public class Chap6_06 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("人数 : ");
		final int ninzu = stdIn.nextInt();
		int[] tensu = new int[ninzu];

		for (int i = 0; i < ninzu; i++) {
			System.out.print((i +1) + "番の点数 : ");
			tensu[i]= stdIn.nextInt();
		}

		int sum = tensu[0];
		for (int i = 1; i < tensu.length; i++)
			sum += tensu[i];

		System.out.println("合計点は" + sum + "点です。");

		System.out.println("平均点は" + (double) sum / ninzu + "点です。");

		int max = tensu[0];
		for (int i = 1; i < tensu.length; i++)
			if (tensu[i] > max) max = tensu[i];

		System.out.println("合計点は" + max + "点です。");

		int min = tensu[0];
		for (int i = 1; i < tensu.length; i++)
			if (tensu[i] < min) min = tensu[i];

		System.out.println("最低点は" + min + "点です。");
	}

}
