package leetcode;

public class sort_258 {
	public static int addDigits(int num){
		while(num>=10){
			num=num/10+num%10;
		}
			return num;
	}
	
	
	public static void main(String[] args){
		System.out.println(addDigits(100));
	}
}
