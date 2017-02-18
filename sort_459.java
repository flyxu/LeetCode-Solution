
public class sort_459 {
	public static boolean repeatedSubstringPattern(String str) {
       //直接截取重复试验
		int n=str.length();
		for(int i=n/2;i>=1;i--){
			if(n%i==0){
			String substr=str.substring(0, i);
			StringBuffer suBuffer=new StringBuffer();
			for(int j=0;j<n/i;j++){
			suBuffer.append(substr);
			}
			if(suBuffer.toString().equals(str)){
				return true;
				}
			}
		}
		return false;
    }
	public static void main(String[] args) {
		String aString="abcac";
		System.out.println(repeatedSubstringPattern(aString));
	}
}
