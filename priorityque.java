package javaalgorithm;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Random;

public class priorityque {

	public static void main(String[] args) {
		Random r = new Random();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for(int i=0;i<5;i++) {
			pq.add(r.nextInt(100));
		}
		System.out.println(pq.toString());
		
		for (int i =0;i<5;i++) {
		System.out.println(pq.poll());}
		
	}

}



