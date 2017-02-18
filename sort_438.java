import java.util.ArrayList;
import java.util.List;

public class sort_438 {
	public List<Integer> findAnagrams(String s, String p) {
		List list = new ArrayList<>();
		if (s.length() < p.length()) {
			return list;
		}
		char[] S = s.toCharArray();
		char[] P = p.toCharArray();
		int s_count[] = new int[26];
		int p_count[] = new int[26];
		for (int i = 0; i < P.length; i++) {
			p_count[P[i] - 'a']++;
			s_count[S[i] - 'a']++;
		}
		if (check(p_count, s_count)) {
			list.add(0);
		}
		for (int i = P.length; i < S.length; i++) {
			s_count[S[i - P.length] - 'a']--;
			s_count[S[i] - 'a']++;
			if (check(s_count, p_count)) {
				list.add(i - P.length + 1);
			}
		}
		return list;

	}

	private boolean check(int counter[], int tmp[]) {
		for (int i = 0; i < 26; i++)
			if (counter[i] != tmp[i])
				return false;
		return true;
	}

	// public static boolean check(String a, String b) {
	// char[] A = a.toCharArray();
	// char[] B = b.toCharArray();
	// for (int i = 0; i < B.length; i++) {
	//
	// }
	// Arrays.sort(A);
	// Arrays.sort(B);
	// for (int i = 0; i < A.length; i++) {
	// if (A[i] != B[i]) {
	// return false;
	// }
	//
	// }
	// return true;
	//
	// }

}
