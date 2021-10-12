package afternoon;

import java.util.Scanner;

public class LAT
{
   public static void main( String args[] )
   {
      // create Scanner object to input data
      Scanner input = new Scanner( System.in );

      int searchInt; // search key
      int position; // location of search key in array

      // create array and output it
      LinearArray searchArray = new LinearArray( 10 );
      System.out.println( searchArray ); // print array

      // get input from user
      System.out.print( 
         "Please enter an integer value (-1 to quit): " );
      searchInt = input.nextInt(); // read first int from user

      // repeatedly input an integer; -1 terminates the program
      while ( searchInt != -1 )
      {
         // perform linear search
         position = searchArray.linearSearch( searchInt );

         if ( position == -1 ) // integer was not found
            System.out.println( "The integer " + searchInt + 
               " was not found.\n" );
         else // integer was found
            System.out.println( "The integer " + searchInt + 
               " was found in position " + position + ".\n" );

         // get input from user
         System.out.print( 
            "Please enter an integer value (-1 to quit): " );
         searchInt = input.nextInt(); // read next int from user
      } // end while
   } // end main
} // end class LinearSearchTest
