package exercise;

// Divide by zero with / without Exception
import java.util.*;
import java.util.InputMismatchException;

public class Ex1 {
	public static int quotient(int numerator, int denominator) throws ArithmeticException //java.lang
	{
		return numerator/denominator; // possible division by zero
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		boolean continueLoop = true;
		do {
			try { //calculate quotient with try..catch
				System.out.println("Please enter an integer (numerator): ");
				int numerator = sc.nextInt();
				System.out.println("Please enter an integer (denominator): ");
				int denominator = sc.nextInt();
				
				int result = quotient(numerator, denominator);
				System.out.println("\nResult :\n"+ result);
				continueLoop = false; // input successfully and looping
				//System.out.printf
			}
			catch (InputMismatchException inme){
				System.err.println(inme);
				sc.nextLine();
				System.out.println("User must enter proper integer. Please try again");
			}
			catch(ArithmeticException ae) {
				System.err.println("Zero is a invalid denominator. Please try again");
			}
		}while(continueLoop);
		}
		
	}
