package Chap6;

import java.util.Random;
import java.util.Scanner;

public class Chap6_10 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数 : ");
		int[] a = new int[stdIn.nextInt()];

		for (int i = 0; i < a.length; i++)
		{
			a[i] = rand.nextInt(10) + 1;
			if (i > 1)
			{
				if (a[i] == a[i - 1])
					i --;
			}
		}

		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}