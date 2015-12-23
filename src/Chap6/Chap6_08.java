package Chap6;

import java.util.Scanner;

public class Chap6_08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数 : ");
		double[] a = new double[stdIn.nextInt()];

			for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
				a[i] = stdIn.nextDouble();
			}

			double sum = 0;
			for(double i : a)
				sum += i;

			System.out.println("合計値 : " + sum);
			System.out.println("平均値 : " + sum / a.length);
	}
}