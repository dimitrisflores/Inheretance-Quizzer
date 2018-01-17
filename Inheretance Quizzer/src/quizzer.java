import java.util.Scanner;

public class quizzer
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
			picQuestions();
			questionOne();
		}

		

		public static void picQuestions()
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("How many questions would you like?");
				String guess =userInput.nextLine();
				if(guess.equals("1"))
					{
					questionOne();	
					}
				else if(guess.equals("2"))
					{
						
					}
				else if(guess.equals("3"))
					{
						
					}
				else if(guess.equals("4"))
					{
						
					}
				else if(guess.equals("5"))
					{
						
					}
				else if(guess.equals("6"))
					{
						
					}
				else if(guess.equals("7"))
					{
						
					}
			}
		private static void questionOne()
			{
				System.out.println("What will Food f = new Food(); System.out.print(f.food());");
				System.out.println("a. 7");
				System.out.println("b. You have 7 grapes to eat.");
				System.out.println("c. 7 *nextline* You have 7 grapes to eat.");
				String guess = userInput.nextLine();
				if(guess.equals("a"))
					{
						System.out.println("Sorry you are wrong.");
					}
				else if(guess.equals("b"))
					{
						System.out.println("Sorry you are wrong.");
					}
				else if(guess.equals("c"))
					{
						System.out.println("Yes you are correct.");
					}
				
			}
				
			}
