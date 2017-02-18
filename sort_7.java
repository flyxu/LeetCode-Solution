
public class sort_7 {
	public static int reverse(int x) {
		int b = 0;
		while (x != 0) {
			int a = x % 10;
			x = x / 10;
			b = b * 10 + a;
		}
		return b;

	}

}
