import java.util.ArrayList;
import java.util.List;

public class sort_448 {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		if (nums.length == 0) {
			return null;
		}
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[nums[i] - 1] > 0) {
				nums[nums[i] - 1] = -nums[nums[i] - 1];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}
}
