
public class sort_345 {
	public String reverseVowels(String s) {
		int i = 0;
		int j = s.length() - 1;
		char[] ss = s.toCharArray();
		while (i < j) {
			while (i < j && (!isvowels(ss[i]))) {
				i++;
			}
			while (i < j && (!isvowels(ss[j]))) {
				j--;
			}
			char tmp = ss[i];
			ss[i] = ss[j];
			ss[j] = tmp;
			i++;
			j--;
		}
		return new String(ss);
	}

	public boolean isvowels(char c) {
		c = Character.toLowerCase(c);
		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			return true;
		}
		return false;

	}
}
