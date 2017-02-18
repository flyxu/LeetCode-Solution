import java.util.ArrayList;
import java.util.Collections;

// class ListNode {
//	int val;
//	ListNode next;
//
//	ListNode(int x) {
//		val = x;
//	}
//}

public class sort_234 {
	public boolean isPalindrome(ListNode head) {
		ArrayList list = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			head = head.next;
		}
		ArrayList list2 = new ArrayList<>(list);
		Collections.reverse(list);
		for (int i = 0; i < list.size(); i++) {
			if (!list.get(i).equals(list2.get(i))) {
				return false;
			}
		}
		return true;

	}

}
