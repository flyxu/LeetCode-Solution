
public class sort_268 {
	public static int missingNumber(int[] nums) {

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < nums.length; i++) {
			sum1 = sum1 + nums[i];
		}
		System.out.println(sum1);
		for (int i = 0; i <= nums.length; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		return sum2 - sum1;

	}

	public static void main(String[] args) {
		int[] a = { 0, 1, 2, 3, 5 };
		System.out.println(missingNumber(a));
	}
}
