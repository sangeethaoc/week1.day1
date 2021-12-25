package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int range =8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		System.out.println("FibonacciSeries for the range 8 :");
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i=1;i<range-1;i++)
		{
			if(i>1)
			{
				firstNum = secNum;
				secNum = sum;
			}
			sum = firstNum+secNum;
			System.out.println(sum);
		}

	}

}
