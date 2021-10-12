package afternoon;

//Recursive fibonacci method.

public class FibonacciCalculator
{
// recursive declaration of method fibonacci
public static long fibonacci( long number )
{
   if ( ( number == 0 ) || ( number == 1 ) ) // base cases
      return number;
   else // recursion step
      return fibonacci( number - 1 ) + fibonacci( number - 2 );
} // end method fibonacci

public static void displayFibonacci()
{
   for ( int counter = 0; counter <= 10; counter++ )
      System.out.printf( "Fibonacci of %d is: %d\n", counter,
         fibonacci( counter ) );
} // end method displayFibonacci
} // end class FibonacciCalculator
