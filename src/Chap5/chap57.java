package Chap5;

class chap57 {

	public static void main(String[] args) {
		System.out.println("  x          x^2");
		System.out.println("--------------------");

		for(float x = 0.0F; x <= 1.0F; x += 0.001F)
		{
			System.out.printf("%.7f  %.7f\n", x, x*x);
		}
	}
}
