package algorithm;
import java.util.Random;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {10,2,6,4,3,7,5};
		
		for(int i = 1; i < arr.length; i++) {
			int standard = arr[i];
			int aux = i-1;
			
			while(aux >= 0 && standard < arr[aux]) {
				arr[aux+1]=arr[aux];
				
				aux--;
			}
			arr[aux+1]=standard;
		}
		printArr(arr);
		

	}
	public static void printArr(int[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
	}
}
