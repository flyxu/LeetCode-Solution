package leetcode;

public class sort_5 {
	public String longestPalindrome(String s) {
		if(s.length()==1){
			return s;
		}
		int maxlength=1;
		String substring=null;
		// check all possible sub strings  
        for(int i=0;i<s.length();i++){
        	for(int j=i+1;j<s.length();j++){
        		String sub=s.substring(i,j+1);
        		if(ispalindrome(sub)){
        			int length=j+1-i;
        			if(length>maxlength){
        				maxlength=length;
        				substring=sub;
        			}
        		}
        	}
        }
        return substring;
    }
	public boolean ispalindrome(String s){
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="a";
		sort_5 sort=new sort_5();
		System.out.println(sort.longestPalindrome(s));

	}

}
