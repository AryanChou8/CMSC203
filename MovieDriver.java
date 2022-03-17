import java.util.Scanner;

public class MovieDriver {
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Scanner intInput = new Scanner(System.in);
		
		String answer;
		
		do {
			System.out.println("Enter the name of a movie");
			String title = input.nextLine();
			
			System.out.println("Enter the rating of the movie");
			String rating = input.nextLine();
			
			System.out.println("Enter the number of tickets sold for this movie");
			int tickets = intInput.nextInt();
			
			Movie m1 = new Movie(title, rating, tickets);
			
			System.out.println(m1.toString());
			
			System.out.println("Do you want to enter another movie? ");
			answer = input.nextLine();
			
			while(!answer.equals("n") && !answer.equals("y") && !answer.equals("Y") && !answer.equals("N"))
			{
				System.out.println("That is not a valid input, please type Y or N");
				answer = input.nextLine();
			}
		}
		while(answer.equals("Y") || answer.equals("y"));
		
		System.out.println("Goodbye");
			
		input.close();
		intInput.close();
	}
}