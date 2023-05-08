package javaalgorithm;
import java.util.Stack;


public class stack {
	public static void main(String[] args) {
	Stack<Integer> myStack = new Stack<Integer>();
	
	myStack.add(15);
	myStack.push(12);
	myStack.add(43);
	myStack.add(11);
	System.out.println(myStack.toString());
	
	System.out.println(myStack.peek());
	System.out.println(myStack.toString());
	
	System.out.println(myStack.pop());
	System.out.println(myStack.toString());
	
	System.out.println(myStack.size());
	
	myStack.clear();
	
	System.out.println(myStack.isEmpty());
	
	}
}
