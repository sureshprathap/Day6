package afternoon;

//Recursive factorial method.

public class FactorialCalculator1
{
// recursive declaration of method factorial
public static long factorial( long number )
{
   if ( number <= 1 ) // test for base case
      return 1; // base cases: 0! = 1 and 1! = 1
   else // recursion step
      return number * factorial( number - 1 );
} // end method factorial

// output factorials for values 0-5
public static void displayFactorials()
{
   // calculate the factorials of 0 through 5
   for ( int counter = 0; counter <= 5; counter++ )
      System.out.printf( "%d! = %d\n", counter, factorial( counter ) );
} // end method displayFactorials
} // end class FactorialCalculator

