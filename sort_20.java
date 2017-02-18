import java.util.HashMap;
import java.util.Stack;

public class sort_20 {
	public static boolean isValid(String s) {
        Stack<Character>  stack=new Stack<Character>();
        HashMap<Character, Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        for(int i=0;i<s.length();i++){
        	if(!stack.isEmpty() && map.get(stack.peek())==s.charAt(i)){
        		stack.pop();
        	}
        	else{
        		stack.push(s.charAt(i));
        	}
        }
        if(stack.isEmpty()){
        	return true;
        }
        return false;
    }
	public static boolean isbracketvalid(String s){
		HashMap<Character, Character> map=new HashMap<Character,Character>();
		map.put('(',')');
		map.put('{', '}');
		map.put('[', ']');
		Stack<Character> stack=new Stack<>();
		for(int i=0;i<s.length();i++){
			if(!stack.isEmpty()&&map.containsKey(s.charAt(i))){
				if(map.get(stack.peek())==s.charAt(i)){
					stack.pop();
				}
				else{
					stack.push(s.charAt(i));
				}
			}
			else{
			stack.push(s.charAt(i));
			}
		}
		if(stack.isEmpty()){
			return true;
		}
		else{
			return false;
		}
	}

	public static void main(String[] args) {
		String aString="([)]";
		System.out.println(isbracketvalid(aString));
	}
}
