import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner k = new Scanner(System.in);
        int n = k.nextInt();
        
        String input = k.next();
        String [] strInput = input.split("");
        int t = 10;
        
        int prev, curr = 0;
        
        if (strInput.length < 10)
        {

            for (int i = 1; i < strInput.length; i++)
            {
                prev = Integer.parseInt(strInput[i - 1]);
                curr = Integer.parseInt(strInput[i]);
                
                if ((curr - prev) != 1)
                {
                    System.out.println(curr - 1);
                    break;
                }
            }
            System.out.println(++curr);
        }
        else
        {
        	
            for (int i = 1; i < 9; i++)
            {
                prev = Integer.parseInt(strInput[i - 1]);
                curr = Integer.parseInt(strInput[i]);
                
                if ((curr - prev) != 1)
                {
                    System.out.println(curr - 1);
                    break;
                }
            }
            
            prev = 0;
            if (n != 100)
            {
            	for (int j = 10; j < strInput.length - 2; j+=2)
            	{
                
            		curr = Integer.parseInt(strInput[j + 2]);
            		prev = Integer.parseInt(strInput[j]);
	                t++;
	                
	                if (Math.abs(curr-prev) != 2)
	                {
	                	System.out.println(t - 1);
	                	break;
	                }//if
            	}//for
            }//if
            else
            {
            	for (int j = 11; j < strInput.length - 5; j+=2)
            	{
                
            		curr = Integer.parseInt(strInput[j + 2]);
            		prev = Integer.parseInt(strInput[j]);
	                t++;
	                
	                if (Math.abs(curr-prev) != 2)
	                {
	                	System.out.println(t - 1);
	                	break;
	                }//if
            	}//for
            }//else
        }//else
        
        
        
        k.close();
        
    }

}