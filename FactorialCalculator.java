package afternoon;

//Recursive factorial method.

class FactorialCalculator
{
	public static void main(String args[])
	{
		int i,fact=1;
		int number=5;
		
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		//System.out.
		System.out.println("Recursion example 5!(Factorial of 5) " + number + " is: " + fact);
	}
	
}

