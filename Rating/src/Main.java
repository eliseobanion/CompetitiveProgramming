import java.util.*; //importing scanner and other stuff

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner(System.in);
		double n, k = 0.0; //n and k
		double score, max, min = 0.0;
		
		String temp = keyboard.nextLine(); //input n and k
		String [] strInput = temp.split(" "); //split n and k into an array
		
		n = Double.parseDouble(strInput[0]);
		k = Double.parseDouble(strInput[1]);
		min = (n-k) * -3.0; //potential min score of absent professors
		max = (n-k) * 3.0; //potential max score of absent professors

		score = 0.0;
		for (int i = 0; i < k; i++)
			score += keyboard.nextDouble(); //add up all scores already given
				
		min += score; //total
		max += score; //total

		
		min /= n; //average
		max = max / n; //average
		
		System.out.println(min + " " + max);
		
		
		
		keyboard.close();
		
		
		
		
	}

}
