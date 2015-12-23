package Chap6;

public class Chap6_03 {

	public static void main(String[] args) {
		double[] a = new double [5];

		for (int i = 0; i < a.length; i++)
			a[i] = i * 1.1;

		for (int i = 0; i < a.length; i++)
			System.out.printf("a[%d] =　%.1f\n", i, a[i]);
	}

}