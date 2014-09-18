import java.io.*;
import java.util.Scanner;

public class test {
	public static void main(String[] args)
	{
		String reverse;
		Scanner terminalInput = new Scanner(System.in);
		System.out.println("Enter the sentence to reverse: ");
		reverse = terminalInput.nextLine();
		terminalInput.close();
		
		//Reverse the string
		char[] reverseChar = reverse.toCharArray();
		for(int i = 0; i < reverse.length()/2; i++)
		{
			char temp = reverseChar[i];
			reverseChar[i] = reverseChar[reverse.length() - 1 - i];
			reverseChar[reverse.length() - 1 - i] = temp;
		}
		
		//Reverse the token words
		for(int i = 0; i < reverse.length(); i++)
		{
			if(((int)reverseChar[i] >= 65 && (int)reverseChar[i] <= 90) 
					|| ((int)reverseChar[i] >= 97 && (int)reverseChar[i] <= 122))
			{
				//Find the starting and ending indexes
				int starting = i;
				while(i < reverse.length() && (((int)reverseChar[i] >= 65 && (int)reverseChar[i] <= 90) 
					|| ((int)reverseChar[i] >= 97 && (int)reverseChar[i] <= 122)))
				{
					i++;
				}
				
				for(int j = 0; j < (i - starting)/2; j++)
				{
					char temp = reverseChar[starting + j];
					reverseChar[starting + j] = reverseChar[i - 1 - j];
					reverseChar[i - 1 - j] = temp;
				}
			}

		}
		
		System.out.println(String.valueOf(reverseChar));
	}
}
