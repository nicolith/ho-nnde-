package Chap6;

import java.util.Random;
import java.util.Scanner;

public class Chap6_11 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数(10以下) : ");
		int[] a = new int[stdIn.nextInt()];

		for (int i = 0; i < a.length; i++)
		{
			a[i] = rand.nextInt(10) + 1;

			for (int j = 1 ; j <= i; j++)
				if(a[i] == a[j - 1])
				{
					i--;
					break;
				}
		}

		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}