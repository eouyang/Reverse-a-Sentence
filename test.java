import java.io.*;
import java.util.Scanner;

public class test {
    public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
        String[] lineArray = line.split("\n");
        if (lineArray.length > 0) {
            //Process line of input Here
        	for(int m = 0; m <lineArray.length; m++)
        	{
        		int strlen = lineArray[m].length();
        		char reverseChar[] = lineArray[m].toCharArray();
        		for(int i = 0; i < strlen/2; i++)
        		{
        			char temp = reverseChar[i];
        			reverseChar[i] = reverseChar[strlen - 1 - i];
        			reverseChar[strlen - 1 - i] = temp;
        		}
        		
        		//Reverse the token words
        		for(int i = 0; i < strlen; i++)
        		{
        			if(((int)reverseChar[i] >= 65 && (int)reverseChar[i] <= 90) 
        					|| ((int)reverseChar[i] >= 97 && (int)reverseChar[i] <= 122))
        			{
        				//Find the starting and ending indexes
        				int starting = i;
        				while(i < strlen && (((int)reverseChar[i] >= 65 && (int)reverseChar[i] <= 90) 
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
    }
    in.close();
  }
}

