package leetcode;

import org.omg.CORBA.PUBLIC_MEMBER;

public class sort_258 {
//	public int addDigits(int num){
//		while(num>=10){
//			num=num/10+num%10;
//		}
//			return num;
//	}
	public int addDigits(int num){
		return 1 + (num-1)%9; 
	}

}
