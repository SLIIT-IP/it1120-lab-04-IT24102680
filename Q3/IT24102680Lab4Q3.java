import java.util.Scanner;

public class IT24102680Lab4Q3
{
	public static void main (String[] args)
   {

	Scanner input = new Scanner(System.in);
	int number;

	System.out.print("Enter a number: ");
	number = input.nextInt();

	String result = (number>0)?"The number is: Positive"
			:(number<0)?"The number is: Negative"
			:"The number is Zero";
	
	System.out.println(result);
    }
}