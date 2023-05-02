package ArrayDemo;

public class Array {

	public static void main(String[] args) {
		int[] array1 = new int[5];
		int [] array2 = new int[5];
		int array3[]= new int[5];
		
		int[] array4;
		array4 = new int[5];
		
		int[] array5 = {1,2,3,4,5};
		
		String str_Arr[] = new String[5];
		str_Arr[0] = "A";
		str_Arr[1] = "B";
		str_Arr[2] = "C";
		str_Arr[3] = "D";
		str_Arr[4] = "E";
		
		System.out.println(str_Arr[0]);
		str_Arr[0] = "AAA";
		System.out.println(str_Arr[0]);
		

	}
	
	

}
