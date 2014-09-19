import java.io.*;
import java.util.Scanner;

public class test {
    public static void main (String[] args) throws IOException {
    File file = new File(args[0]);
    BufferedReader in = new BufferedReader(new FileReader(file));
    String line;
    while ((line = in.readLine()) != null) {
    	line = line.trim();
        String[] lineArray = line.split(" ");
        if (lineArray.length > 0) {
            //Process line of input Here
        	for(int i = lineArray.length - 1; i >= 0; i--)
        	{
        		if(!lineArray[i].equals(""))
        			System.out.print(lineArray[i]);
        		if(i > 0)
        			System.out.print(" ");
        	}
        	System.out.println("");
        }
    }
    in.close();
  }
}

