
public class sort_344_2 {
    public static  String reverseString(String s) {
        StringBuffer stringBuffer=new StringBuffer(s);
        return stringBuffer.reverse().toString();
        
    }
    public static String reverseString2(String s){
    	if(s.length()==1||s.length()==0){
    		return s;
    	}
    	int len=s.length();
    	String aString=s.substring(len-1);
    	String subsolution=reverseString(s.substring(0, len-1));
    	return aString+subsolution;
    	
    }
    public static void main(String[] args) {
		String string="abcd";
		String bString="ddd";
		System.out.println(reverseString2(string));
		System.out.println(string+bString);
	}
}
