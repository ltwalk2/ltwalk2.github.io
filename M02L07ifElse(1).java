/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class M02L07ifElse
{
	
	public static void main(String[] args)
	{
		
		{
			//create input object to read data from the keyboard
			Scanner input = new Scanner(System.in);
		
			//read in a character
			System.out.println("Enter a char");
			char someChar = input.next().charAt(0);
			
			//establish the specific capitol letter chars you want
			if ((someChar >='A') && (someChar <= 'Z'))
			{
				System.out.printf ("An uppercase letter was entered with ascii value %d \n", (int) someChar);
			}
			//establish if user inputs lowercase letters
			else if ((someChar >='a') && (someChar <='z'))
			{
				System.out.printf ("A lowercase letter was eneted with ascii value %d \n", (int) someChar);
			}
			//include numbers and symbols
			else   
			{
				System.out.printf ("You have entered a number or symbol with ascii value %d \n", (int) someChar);
			}//end of if statement
			
		}//end input
	}//end main
}//end class
