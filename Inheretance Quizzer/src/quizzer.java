import java.util.Scanner;

public class quizzer
	{
		static Scanner userInput = new Scanner(System.in);
		public static void main(String[] args)
		{
			picQuestions();
			questionOne();
			questionTwo();
			questionThree();
			questionFour();
			questionFive();
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
						questionOne();
						questionTwo();
					}
				else if(guess.equals("3"))
					{
						questionOne();
						questionTwo();
						questionThree();
					}
				else if(guess.equals("4"))
					{
						questionOne();
						questionTwo();
						questionThree();
						questionFour();
					}
				else if(guess.equals("5"))
					{
						questionOne();
						questionTwo();
						questionThree();
						questionFour();
						questionFive();
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
		private static void questionTwo()
		{
			System.out.println("What will Food f = new Sweet(); System.out.print(f.sweets());");
			System.out.println("a. 7");
			System.out.println("b. 7 *next line* 17 *next line* Cake is amazing!");
			System.out.println("c. 17 *next line* Cake is awesome!");
			String guess = userInput.nextLine();
			if(guess.equals("a"))
				{
					System.out.println("Sorry you are wrong.");
				}
			else if(guess.equals("b"))
				{
					System.out.println("Yes you are correct");
				}
			else if(guess.equals("c"))
				{
					System.out.println("Sorry you are wrong.");
				}
			
		}
		private static void questionThree()
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
		private static void questionFour()
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
		private static void questionFive()
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
