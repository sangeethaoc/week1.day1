package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		
		int n=5,fact;
		Factorial factorial = new Factorial();
		fact = factorial.fact(n);
		System.out.println("Factorial of 5 is :" + fact);
}

	public int fact(int n) {
		int prod = 1,temp;
		for(int i=1;i<=n;i++)
			
		{
		 temp = i*prod;
		 prod = temp;
		}

		return prod;
	}

}
