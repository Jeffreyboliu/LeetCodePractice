package solutions;
import java.util.*;


public class ValidParentheses {

	private static final Map<Character, Character> map = new HashMap<Character, Character>(){
		{
			put('(',')');
			put('[',']');
			put('{','}');
		}
	};
	
	public boolean isValid(String s){
		Stack<Character> stack = new Stack<Character>();
		
		for(char c: s.toCharArray()){
			if(map.containsKey(c)){
				stack.push(c);
			}else if(stack.isEmpty() || map.get(stack.pop()) != c){
				return false;
			}	
		}
		return stack.isEmpty();
	}
	
	
}