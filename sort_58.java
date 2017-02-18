
public class sort_58 {
    public static int lengthOfLastWord(String s) {
    	if(s==null||s.length()==0||s==" "){
    		return 0;
    	}
        String[] word=s.split(" ");
        String aString=word[word.length-1];
        return aString.length();
    }
    public static void main(String[] args) {
		String string="hello world";
		System.out.println(string.lastIndexOf("l"));
		System.out.println(lengthOfLastWord(string));
	}
}
