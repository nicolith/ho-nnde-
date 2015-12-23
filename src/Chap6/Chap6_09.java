package Chap6;

import java.util.Random;
import java.util.Scanner;

public class Chap6_09 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);

		System.out.print("要素数 : ");
		int[] a = new int[stdIn.nextInt()];

		for (int i = 0; i < a.length; i++)
			a[i] = rand.nextInt(10)+1;

		for(int i = 0; i < a.length; i++)
			System.out.println("a[" + i + "] = " + a[i]);
	}

}