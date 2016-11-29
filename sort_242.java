package leetcode;

import java.util.Arrays;

public class sort_242 {
	public static boolean isAnagram(String s, String t) {
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length!=b.length){
        	return false;
        }
        else{
        	for(int i=0;i<a.length;i++){
        		if(a[i]!=b[i])
        			return false;
        	}
        	return true;
        }
        
    } 
	public static int ceshi (String a){
		char b=a.charAt(5);
		int c=b-'a';
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="anagram";
		String t="nagarbm";
		System.out.println(isAnagram(s,t));
		System.out.println(ceshi(t));
	}

}
