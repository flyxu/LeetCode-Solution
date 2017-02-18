public class sort_396 {
	// public static int maxRotateFunction(int[] A) {
	// if (A.length == 0) {
	// return 0;
	// }
	// int n = A.length;
	// int[] f = new int[n];
	// for (int k = 0; k < n; k++) {
	// int[] b = construct_B(A, k);
	// for (int i = 0; i < n; i++) {
	// f[k] += i * b[i];
	// }
	// }
	// Arrays.sort(f);
	// return f[f.length - 1];
	//
	// }

	public static int[] construct_B(int[] A, int k) {
		int n = A.length;
		int[] B = new int[n];
		if (k == 0) {
			B = A;
			return B;
		}

		for (int i = 0; i < k; i++) {
			B[i] = A[n - k + i];
		}
		int h = 0;
		for (int j = k; j < n; j++) {
			B[j] = A[h];
			h++;

		}
		return B;

	}

	public static int maxRotateFunction(int[] A) {
		int max = Integer.MIN_VALUE;
		int n = A.length;
		int sum = 0;
		if (n == 0) {
			return 0;
		}
		int f[] = new int[n];
		for (int i = 0; i < n; i++) {
			sum += A[i];
			f[0] += i * A[i];
		}
		max = Math.max(max, f[0]);
		for (int i = 1; i < n; i++) {
			f[i] = f[i - 1] + sum - n * A[n - i];
			max = Math.max(max, f[i]);
		}
		return max;

	}

	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 6 };
		System.out.println(maxRotateFunction(a));
		// int[] b = construct_B(a, 1);
		// for (int i : b) {
		// System.out.println(i);
		// }
		// Arrays.sort(a);
		// System.out.println(a[0]);
		System.out.println(Integer.MIN_VALUE);
	}

}
