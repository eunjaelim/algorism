package ArrayDemo;

import java.util.Arrays;

public class two_Arrray {

	public static void main(String[] args) {
		int n = 5;
		int m = 4;
		int[][] array = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j =0;j<m;j++) {
				System.out.print("("+i+","+j+")\t");
			}
		}
		String[] arrays = {"A","B","C","D","E"};
		int lng = array.length;
		
		System.out.println(lng);
		
		String[] array2 = {"A","B","C","D","E"};
		System.out.println(array2);
		System.out.println(Arrays.toString(array2));
		
		String[] str_Array = {"C","B","AA","A"};
		int[] num_Array = {3,52,12,64};
		
		Arrays.sort(str_Array);
		Arrays.sort(num_Array);
		
		System.out.println(Arrays.toString(str_Array));
		System.out.println(Arrays.toString(num_Array));
		
		

	}

}
