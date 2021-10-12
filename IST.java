package afternoon;

//Test the insertion sort class.

public class IST
{
public static void main( String[] args )
{
   // create object to perform insertion sort
   InsertSort sortArray = new InsertSort( 10 );
   
   System.out.println( "Unsorted array:" );
   System.out.println( sortArray ); // print unsorted array

   sortArray.sort(); // sort array

   System.out.println( "Sorted array:" );
   System.out.println( sortArray ); // print sorted array
} // end main
} // end class InsertionSortTest
