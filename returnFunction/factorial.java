package returnFunction;

public class factorial {
	//5! = 5 * 4 * 3 * 2 * 1 = 120
	public static int factorial(int number) {
//		int sum = 1;
//		for(int i =2;i<=number;i++)
//		{
//			sum*=i;
//		}
//		return sum;
		
		if(number == 1)
			return 1;
		else
			return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		
		System.out.println("10! ="
				+ " " + factorial(10));
	}

}
