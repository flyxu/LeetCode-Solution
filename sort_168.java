package leetcode;

public class sort_168 {
    public static String convertToTitle(int n) {
        StringBuffer a =new StringBuffer();
        while(n>0){
        	n--;
        	a.insert(0, (char)('A'+n%26));
        	n/=26;
        }
        return a.toString();
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(convertToTitle(280));

	}

}
