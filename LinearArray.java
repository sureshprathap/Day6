package afternoon;

//Class that contains an array of random integers and a method 
//that will search that array sequentially.
import java.util.Random;

public class LinearArray
{
private int[] data; // array of values
private static Random generator = new Random();

// create array of given size and fill with random integers
public LinearArray( int size )
{
   data = new int[ size ]; // create space for array

   // fill array with random ints in range 10-99
   for ( int i = 0; i < size; i++ )
      data[ i ] = 10 + generator.nextInt( 90 );
} // end LinearArray constructor

// perform a linear search on the data
public int linearSearch( int searchKey )
{
   // loop through array sequentially
   for ( int index = 0; index < data.length; index++ )
      if ( data[ index ] == searchKey )
         return index; // return index of integer

   return -1; // integer was not found      
} // end method linearSearch

// method to output values in array
public String toString()
{
   StringBuffer temporary = new StringBuffer();

   // iterate through array
   for ( int element : data )
      temporary.append( element + " " );

   temporary.append( "\n" ); // add endline character
   return temporary.toString();
} // end method toString
} // end class LinearArray
