package javaalgorithm;
import java.util.LinkedList; //import
import java.util.Queue; //import

public class Que {

	public static void main(String[] args) {
		Queue<Integer> myQ = new LinkedList<Integer>();
		
		myQ.add(15);
		myQ.add(12);
		myQ.add(43);
		myQ.add(11);
		System.out.println(myQ.toString());
		
		System.out.println(myQ.peek());
		System.out.println(myQ.toString());
		
		System.out.println(myQ.poll());
		System.out.println(myQ.toString());
		
		System.out.println(myQ.size());
		
		myQ.clear();
		
		System.out.println(myQ.isEmpty());
		
	}

}
