package solutions;
import java.util.*;

public class MinStack {
	private Stack<Integer> stack = new Stack<Integer>();
	private Stack<Integer> minStack = new Stack<Integer>();
	
	
	public void push(int x){
		stack.push(x);
		if ( minStack.isEmpty() || x <= minStack.peek()){
			minStack.push(x);
		}
	}
	
	public void pop(){
		int temp = stack.pop();
		if (temp == minStack.peek()) minStack.pop();
	}
	
	public int top(){
	
		return stack.peek();
	}
	
	public int getMin(){

		if(stack.isEmpty()) return 0;
		else
			return minStack.peek();
	}
	
}
