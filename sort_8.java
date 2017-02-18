
public class sort_8 {
	public static int myAtoi(String str){
		if(str==null||str.length()==0){
			return 0;
		}
		int a=Integer.parseInt(str);
		return a;
	}
	public static void main(String[] args) {
		String aString="+";
		System.out.println(myAtoi(aString));
	}
}
