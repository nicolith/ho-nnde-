package Chap6;

import java.util.Random;
import java.util.Scanner;

public class Chap6_12 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数 : ");
		int n = stdIn.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
		{
			a[i] = rand.nextInt(10)+1;
			System.out.println("a[" + i + "] = " + a[i]);
		}

		System.out.println("要素の並びをシャッフルしました。");


		for (int i = 0; i < n; i++)
		{
			int j = rand.nextInt(n);
			int k = a[i];
			a[i] = a[j];
			a[j] = k;
		}

		for (int i = 0; i < n; i++)
		{
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}