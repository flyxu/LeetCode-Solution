import java.util.Arrays;

public class sort_216 {
	public void wiggleSort(int[] nums) {
		if (nums == null) {
			return;
		}
		int tmp[] = new int[nums.length];
		Arrays.sort(nums);
		int mid = (nums.length - 1) / 2;
		int right = nums.length - 1;
		for (int i = 0; i < tmp.length; i++) {
			if ((i & 1) == 0) {
				tmp[i] = nums[mid];
				mid--;
			} else {
				tmp[i] = nums[right];
				right--;
			}
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = tmp[i];
		}
		return;

	}
}
