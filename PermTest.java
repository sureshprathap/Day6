package afternoon;
import java.util.Scanner;

public class PermTest {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		Permutation pm = new Permutation();
		
		System.out.println("Enter a string: ");
		String input = sc.nextLine();
		
		pm.permuteString("", input);
	}
}
