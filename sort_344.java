package leetcode;
import java.lang.StringBuffer;


public class sort_344 {
	public static String reverse1(String s) {
		StringBuffer a=new StringBuffer(s);
		StringBuffer b=a.reverse();
		return b.toString();
	} 
	public static String reverse2(String s){
		char[] letters=s.toCharArray();
		int len=letters.length;
		for(int i=0;i<=len/2-1;i++){
			char temp=letters[i];
			letters[i]=letters[len-i-1];
			letters[len-i-1]=temp;
		}
		return new String(letters);	
	}
	public static void main(String[] args){
		String string="hello";
		String e=reverse1(string);
		String k=reverse2(string);
		System.out.println(e);
		System.out.println(k);
	}
}
