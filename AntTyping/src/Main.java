import java.util.*;

public class Main {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner k = new Scanner(System.in);
		
		while(k.hasNextInt())
		{
			
		
		String input = k.next(); //get the input

		int seconds = 0; //total number of minimum seconds
		int temp = 0; //temporary int
		int current = 0; //current place

		String [] strInput = input.split("(?!^)"); //https://stackoverflow.com/questions/5235401/split-string-into-array-of-character-strings

		temp = Integer.parseInt(strInput[0]);
		if (temp == 1)
			seconds++;
		else
			seconds = temp - 1;

		for (int i = 1; i < strInput.length; i++)
		{
			current = Integer.parseInt(strInput[i - 1]);
			temp = Integer.parseInt(strInput[i]);
			if (current == temp)
			{
			//	System.out.println(1);
				seconds++;
			}//if
			else
			{
				//System.out.println(Math.abs(current - temp));
				seconds = seconds + Math.abs(current - temp);
			}//else
			/*if (current == 0)
				current = 10;
			else if (temp == 0)
				temp = 10;
				*/
			//System.out.println(seconds);
		}//for

		System.out.println(seconds);
		}
		k.close();



	}

}
