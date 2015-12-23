package Chap5;

class chap56 {

	public static void main(String[] args) {
		System.out.println("  float      int");
		System.out.println("--------------------");

		int	i = 0;
		for(float x = 0.0F; x <= 1.0F; x += 0.001F)
		{
			System.out.printf("%.7f  %.7f\n", x, (float)i++ / 1000);
		}
	}
}
